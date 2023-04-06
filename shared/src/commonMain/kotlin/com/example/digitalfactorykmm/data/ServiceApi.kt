package com.example.digitalfactorykmm.data

import com.example.digitalfactorykmm.data.models.DataModel
import com.example.digitalfactorykmm.data.network.Networking
import com.example.digitalfactorykmm.data.network.getNetworking
import io.ktor.client.call.body
import io.ktor.client.request.get

class ServiceApi(private val networking: Networking = getNetworking()) {
    suspend fun getData(): List<DataModel> =
        networking.httpClient.get("https://api.spacexdata.com/v4/launches").body()
}