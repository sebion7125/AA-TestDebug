package com.example.aatestmenu

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.MessageTemplate
import androidx.car.app.model.Template

class PlayerScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        // For simplicity, we keep it non-playing. You can integrate ExoPlayer later.
        return MessageTemplate.Builder("Audio-Demo. Hier könntest du ExoPlayer anbinden.")
            .setTitle(carContext.getString(R.string.screen_player_title))
            .build()
    }
}
