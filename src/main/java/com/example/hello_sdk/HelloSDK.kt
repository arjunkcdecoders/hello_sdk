package com.example.hello_sdk

import android.content.Context
import android.widget.Toast

class HelloSDK {
    fun showHello(context: Context) {
        Toast.makeText(context, "Hello from version 1.1.0 — Kotlin SDK!", Toast.LENGTH_LONG).show()
    }
}
