package com.kotlin.demo.controller

import com.kotlin.demo.controller.common.ApiController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@ApiController
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
