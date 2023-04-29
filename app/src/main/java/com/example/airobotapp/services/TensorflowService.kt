package com.example.airobotapp.services

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class TensorflowService : Service() {
    // Binder given to clients.
    private val binder = Binder()

    /**
     * Class used for the client Binder. Because we know this service always
     * runs in the same process as its clients, we don't need to deal with IPC.
     */
    inner class LocalBinder : Binder() {
        // Return this instance of LocalService so clients can call public methods.
        fun getService(): TensorflowService = this@TensorflowService
    }

    override fun onBind(p0: Intent?): IBinder? {
        return binder
    }
}