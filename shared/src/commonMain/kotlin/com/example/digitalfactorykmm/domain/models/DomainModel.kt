package com.example.digitalfactorykmm.domain.models

data class DomainModel (
    val flightNumber: Int,
    val missionName: String,
    val launchDateUTC: String,
    val launchSuccess: Boolean?,
)