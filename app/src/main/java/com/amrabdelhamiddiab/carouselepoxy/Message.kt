package com.amrabdelhamiddiab.carouselepoxy

import java.util.*

data class Message(val title: String, val content: String, val id: String = UUID.randomUUID().toString())
