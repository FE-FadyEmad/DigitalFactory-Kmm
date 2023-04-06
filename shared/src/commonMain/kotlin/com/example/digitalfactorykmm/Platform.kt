package com.example.digitalfactorykmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform