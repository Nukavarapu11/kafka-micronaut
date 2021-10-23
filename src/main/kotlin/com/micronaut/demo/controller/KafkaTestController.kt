package com.micronaut.demo.controller

import com.micronaut.demo.client.KafkaClient
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/test")
class KafkaTestController(var kafkaClient: KafkaClient) {

    @Post("/publish")
    fun publishMessage(@Body message: String): String {
        kafkaClient.sendMessage("test-topic", message)
        return "Message Published"
    }

}
