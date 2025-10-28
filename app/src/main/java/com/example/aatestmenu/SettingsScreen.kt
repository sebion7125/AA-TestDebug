package com.example.aatestmenu

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class SettingsScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("Einstellungen (Platzhalter).")
            .setTitle(carContext.getString(R.string.screen_settings_title))
            .build()
    }
}
