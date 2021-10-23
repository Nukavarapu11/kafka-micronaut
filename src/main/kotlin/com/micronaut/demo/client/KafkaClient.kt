package com.micronaut.demo.client

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaClient
interface KafkaClient {

    fun sendMessage(@Topic topic: String, message: String)
}
