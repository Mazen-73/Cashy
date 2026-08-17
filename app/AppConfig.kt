package com.mazen.cashy

object CashyConfig {
    const val APP_NAME = "Cashy"
    const val VERSION_NAME = "5.0.2"
    const val DESIGN_SYSTEM = "Material 3 Expressive"

    object TechStack {
        const val LANGUAGE = "Kotlin"
        const val DATABASE = "Room Database"
    }
}


enum class AppThemeMode {
    LIGHT,
    DARK,
    SYSTEM_DEFAULT
}

class CashyHelper {
    fun getAppInfo(): String {
        return "${CashyConfig.APP_NAME} v${CashyConfig.VERSION_NAME} - Built with ${CashyConfig.TechStack.LANGUAGE}"
    }
}
