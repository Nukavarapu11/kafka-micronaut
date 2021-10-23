package com.micronaut.demo.listener

import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.OffsetReset
import io.micronaut.configuration.kafka.annotation.Topic


@KafkaListener(offsetReset = OffsetReset.EARLIEST)
class KafkaListener {

    @Topic("test-topic")
    fun receive(message: String) {
        println("")
    }
}
