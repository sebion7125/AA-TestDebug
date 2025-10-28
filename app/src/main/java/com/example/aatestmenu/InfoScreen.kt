package com.example.aatestmenu

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class InfoScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        return MessageTemplate.Builder("AA TestMenu App\nLegal & regelkonform.\nNur Templates, keine Videos.")
            .setTitle("Info")
            .build()
    }
}
