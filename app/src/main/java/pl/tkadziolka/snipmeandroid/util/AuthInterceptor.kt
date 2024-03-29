package pl.tkadziolka.snipmeandroid.util

import okhttp3.Interceptor
import okhttp3.Response
import pl.tkadziolka.snipmeandroid.BuildConfig
import pl.tkadziolka.snipmeandroid.infrastructure.local.AuthPreferences
import timber.log.Timber

private const val KEY_HEADER_AUTHORIZATION = "Authorization"

class AuthInterceptor(private val authPreferences: AuthPreferences) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val token = authPreferences.getToken() ?: ""
        Timber.i("Authorization token = $token")
        val newRequest = chain
            .request()
            .newBuilder()

        if (token.isNotBlank())
            newRequest.addHeader(KEY_HEADER_AUTHORIZATION, "Token $token")

        return chain.proceed(newRequest.build())
    }
}