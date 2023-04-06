package com.example.digitalfactorykmm.domain

import com.example.digitalfactorykmm.domain.models.DomainModel

interface Repository {
    suspend fun getData(): List<DomainModel>
}