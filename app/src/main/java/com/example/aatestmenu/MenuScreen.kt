package com.example.aatestmenu

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.*
import androidx.core.graphics.drawable.IconCompat

class MenuScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        val rows = listOf(
            Row.Builder()
                .setTitle(carContext.getString(R.string.row_status))
                .addText("Anzeigen")
                .setOnClickListener { screenManager.push(StatusScreen(carContext)) }
                .setImage(
                    CarIcon.Builder(IconCompat.createWithResource(carContext, R.drawable.ic_logo)).build()
                )
                .build(),
            Row.Builder()
                .setTitle(carContext.getString(R.string.row_player))
                .addText("Demo starten")
                .setOnClickListener { screenManager.push(PlayerScreen(carContext)) }
                .setImage(
                    CarIcon.Builder(IconCompat.createWithResource(carContext, R.drawable.ic_logo)).build()
                )
                .build(),
            Row.Builder()
                .setTitle(carContext.getString(R.string.row_settings))
                .addText("Öffnen")
                .setOnClickListener { screenManager.push(SettingsScreen(carContext)) }
                .setImage(
                    CarIcon.Builder(IconCompat.createWithResource(carContext, R.drawable.ic_logo)).build()
                )
                .build()
        )

        val pane = Pane.Builder().apply { rows.forEach { addRow(it) } }.build()

        return PaneTemplate.Builder(pane)
            .setTitle(carContext.getString(R.string.menu_title))
            .setActionStrip(
                ActionStrip.Builder()
                    .addAction(Action.Builder().setTitle("Info").setOnClickListener {
                        screenManager.push(InfoScreen(carContext))
                    }.build())
                    .build()
            )
            .build()
    }
}
