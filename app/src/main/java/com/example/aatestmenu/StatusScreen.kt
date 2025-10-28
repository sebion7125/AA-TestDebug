package com.example.aatestmenu

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class StatusScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("Systemstatus: OK\nVerbindung aktiv.")
            .setTitle(carContext.getString(R.string.screen_status_title))
            .build()
    }
}
