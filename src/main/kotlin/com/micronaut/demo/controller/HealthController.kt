package com.micronaut.demo.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HealthController {

    @Get
    fun health(): String {
        return "I'm Healthy"
    }
}
