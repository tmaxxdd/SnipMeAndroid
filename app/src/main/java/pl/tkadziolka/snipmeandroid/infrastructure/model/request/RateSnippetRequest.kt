package pl.tkadziolka.snipmeandroid.infrastructure.model.request

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RateSnippetRequest(val id: String, val reaction: String)