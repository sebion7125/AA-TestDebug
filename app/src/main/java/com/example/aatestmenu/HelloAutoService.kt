package com.example.aatestmenu

import android.content.Intent
import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator

class HelloAutoService : CarAppService() {
    override fun onCreateSession(sessionInfo: SessionInfo): Session {
        return MainSession()
    }

    override fun createHostValidator(): HostValidator {
        // Allow all hosts for sideloaded testing. In production, restrict to known hosts.
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }
}
