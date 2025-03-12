package com.idormy.sms.forwarder.entity.setting

data class WebhookParams(
    val account: String,
    val bankname: String,
    val `data`: String,
    val mobileno: String
)