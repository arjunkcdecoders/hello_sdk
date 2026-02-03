package com.example.hello_sdk

import android.content.Context
import android.widget.Toast

class HelloSDK {
    fun showHello(context: Context) {
        Toast.makeText(context, "Hello from Kotlin SDK!", Toast.LENGTH_LONG).show()
    }
}
