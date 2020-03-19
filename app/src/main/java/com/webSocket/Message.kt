package com.webSocket

class Message private constructor() {

    var type: Int = 0
        private set
    var message: String? = null
        private set
    var username: String? = null
        private set


    class Builder(private val mType: Int) {
        private var mUsername: String? = null
        private var mMessage: String? = null

        fun username(username: String): Builder {
            mUsername = username
            return this
        }

        fun message(message: String): Builder {
            mMessage = message
            return this
        }

        fun build(): Message {
            val message = Message()
            message.type = mType
            message.username = mUsername
            message.message = mMessage
            return message
        }
    }

    companion object {

        val TYPE_MESSAGE = 0
        val TYPE_LOG = 1
        val TYPE_ACTION = 2
    }
}
