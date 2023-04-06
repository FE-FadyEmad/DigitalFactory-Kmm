package com.example.digitalfactorykmm.data.network

import io.ktor.client.*

interface Networking {
    val httpClient : HttpClient
}

expect fun getNetworking() : Networking
