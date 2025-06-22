package de.hamm.habittracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform