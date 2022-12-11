package pl.tkadziolka.snipmeandroid.bridge.main

import io.flutter.plugin.common.BinaryMessenger
import org.koin.core.component.inject
import pl.tkadziolka.snipmeandroid.bridge.Bridge
import pl.tkadziolka.snipmeandroid.bridge.ModelPlugin
import pl.tkadziolka.snipmeandroid.bridge.toModelData
import pl.tkadziolka.snipmeandroid.domain.snippets.Snippet
import pl.tkadziolka.snipmeandroid.ui.main.*
import pl.tkadziolka.snipmeandroid.util.view.SnippetFilter

class MainModelPlugin : ModelPlugin<Bridge.MainModelBridge>(), Bridge.MainModelBridge {
    private val model: MainModel by inject()
    private var oldEvent: MainEvent? = null
    private var oldState: MainViewState? = null

    override fun onSetup(
        messenger: BinaryMessenger,
        bridge: Bridge.MainModelBridge?
    ) {
        Bridge.MainModelBridge.setup(messenger, bridge)
    }

    override fun getState(): Bridge.MainModelStateData = getState(model.state.value)

    override fun getEvent(): Bridge.MainModelEventData = getEvent(model.event.value)

    override fun resetEvent() {
        model.event.value = Startup
    }

    override fun initState() {
        model.initState()
    }

    override fun loadNextPage() {
        model.loadNextPage()
    }

    override fun filter(filter: Bridge.SnippetFilter) {
        val type = (filter.type?.name ?: Bridge.SnippetFilterType.ALL.name).uppercase()
        val snippetFilter = SnippetFilter.valueOf(type)
        model.filter(snippetFilter)
    }

    override fun logOut() {
        model.logOut()
    }

    override fun refreshSnippetUpdates() {
        model.refreshSnippetUpdates()
    }

    private fun getState(viewState: MainViewState): Bridge.MainModelStateData {
        return Bridge.MainModelStateData().apply {
            state = viewState.toModelState()
            is_loading = viewState is Loading
            data = (viewState as? Loaded)?.snippets?.toModelData()
            oldHash = oldState?.hashCode()?.toLong()
            newHash = viewState.hashCode().toLong()
        }.also {
            oldState = viewState
        }
    }

    private fun getEvent(viewEvent: MainEvent): Bridge.MainModelEventData {
        return Bridge.MainModelEventData().apply {
            event = viewEvent.toModelEvent()
            message = (viewEvent as? Alert)?.message
            oldHash = oldEvent?.hashCode()?.toLong()
            newHash = viewEvent.hashCode().toLong()
        }.also {
            oldEvent = viewEvent
        }
    }

    private fun MainEvent.toModelEvent() =
        when (this) {
            is Alert -> Bridge.MainModelEvent.ALERT
            is Logout -> Bridge.MainModelEvent.LOGOUT
            else -> Bridge.MainModelEvent.NONE
        }

    private fun MainViewState.toModelState() =
        when (this) {
            Loading -> Bridge.ModelState.LOADING
            is Loaded -> Bridge.ModelState.LOADED
            is Error -> Bridge.ModelState.ERROR
        }

    private fun List<Snippet>.toModelData() = map { it.toModelData() }
}
