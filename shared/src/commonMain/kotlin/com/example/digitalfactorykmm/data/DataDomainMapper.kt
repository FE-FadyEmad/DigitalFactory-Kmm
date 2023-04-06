package com.example.digitalfactorykmm.data

import com.example.digitalfactorykmm.data.models.DataModel
import com.example.digitalfactorykmm.domain.models.DomainModel

class DataDomainMapper {

    fun mapDataToDomain(data: List<DataModel>): List<DomainModel> =
        data.map { item ->
            DomainModel(
                flightNumber = item.flightNumber,
                missionName = item.missionName,
                launchDateUTC = item.launchDateUTC,
                launchSuccess = item.launchSuccess,
            )
        }
}