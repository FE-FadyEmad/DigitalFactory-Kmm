package com.example.digitalfactorykmm.data

import com.example.digitalfactorykmm.data.models.DataModel

interface DataSource {
    suspend fun getData(): List<DataModel>
}