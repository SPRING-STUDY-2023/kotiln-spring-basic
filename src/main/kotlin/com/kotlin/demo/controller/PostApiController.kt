package com.kotlin.demo.controller

import com.kotlin.demo.controller.common.ApiController
import com.kotlin.demo.service.PostService

@ApiController
class PostApiController(private val postService: PostService) {
}