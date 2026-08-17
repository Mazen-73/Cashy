package com.mazen.cashy

object CashyConfig {
    const val APP_NAME = "Cashy"
    const val BUILD_LANGUAGE = "Kotlin"
    const val VERSION = "5.0.2"
}

data class TransactionModel(
    val id: Int,
    val text: String,
    val amount: Double,
    val category: String
)

enum class AppTheme {
    LIGHT,
    DARK,
    SYSTEM_DEFAULT
}

class CashyHelper {
    fun getWelcomeMessage(): String {
        return "Welcome to Cashy App"
    }
}
