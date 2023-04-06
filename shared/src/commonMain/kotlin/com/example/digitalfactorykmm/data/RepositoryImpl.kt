package com.example.digitalfactorykmm.data

import com.example.digitalfactorykmm.domain.Repository
import com.example.digitalfactorykmm.domain.models.DomainModel

class RepositoryImpl(
    private val dataSource: DataSource = RemoteDataSource(),
    private val mapper: DataDomainMapper = DataDomainMapper()
) : Repository {
    override suspend fun getData(): List<DomainModel> {
        return mapper.mapDataToDomain(
            dataSource.getData()
        )
    }
}