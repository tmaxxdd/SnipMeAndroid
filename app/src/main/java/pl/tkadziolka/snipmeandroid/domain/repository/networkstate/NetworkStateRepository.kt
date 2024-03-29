package pl.tkadziolka.snipmeandroid.domain.repository.networkstate

import io.reactivex.Observable
import io.reactivex.Single

interface NetworkStateRepository {
    fun isAvailable(): Single<Boolean>

    fun observe(): Observable<Boolean>
}