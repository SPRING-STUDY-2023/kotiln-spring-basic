package com.kotlin.demo.controller.common

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS)
@RestController
@RequestMapping(path = ["/api/v1"])
annotation class ApiController()