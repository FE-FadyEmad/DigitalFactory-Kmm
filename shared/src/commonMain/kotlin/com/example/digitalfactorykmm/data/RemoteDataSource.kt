package com.example.digitalfactorykmm.data

import com.example.digitalfactorykmm.data.models.DataModel

class RemoteDataSource(private val serviceApi: ServiceApi = ServiceApi()) : DataSource {
    override suspend fun getData(): List<DataModel> =
        serviceApi.getData()
}