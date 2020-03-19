package com.webSocket

import android.app.Application

import java.net.URISyntaxException

import io.socket.client.IO
import io.socket.client.Socket

class ChatApplication : Application() {

    var socket: Socket? = null
        private set

    init {
        try {
            socket = IO.socket(Constants.CHAT_SERVER_URL)
        } catch (e: URISyntaxException) {
            throw RuntimeException(e)
        }

    }
}
