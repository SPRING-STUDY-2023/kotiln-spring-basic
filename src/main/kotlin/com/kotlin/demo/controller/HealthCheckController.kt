package com.kotlin.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    @GetMapping("/health")
    fun healthCheck(): HealthCheckResponse {
        return HealthCheckResponse(status = "OK", true, "성공")
    }

    data class  HealthCheckResponse(
            val status: String,
            val success: Boolean,
            val message: String

    )
}
