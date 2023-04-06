package com.example.digitalfactorykmm.domain

import com.example.digitalfactorykmm.Platform
import com.example.digitalfactorykmm.data.RepositoryImpl
import com.example.digitalfactorykmm.getPlatform
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.daysUntil
import kotlinx.datetime.todayIn

class UseCase {
    private val repository: Repository = RepositoryImpl()
    private val platform: Platform = getPlatform()

    suspend operator fun invoke(): String {
        val rockets = repository.getData()
        val lastSuccessLaunch = rockets.last { it.launchSuccess == true }
        val dataList = rockets.take(7).joinToString(",\n") {
            "${it.flightNumber} , ${it.missionName}"
        }
        return "Guess what it is! > ${platform.name}!" +
                "\nThe last successful launch was ${lastSuccessLaunch.launchDateUTC} 🚀" +
                "\n \n" +
                dataList
    }

}