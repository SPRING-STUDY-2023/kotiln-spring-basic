package com.kotlin.demo.controller

import com.kotlin.demo.controller.common.ApiController
import com.kotlin.demo.entity.Member
import com.kotlin.demo.service.MemberService
import jakarta.servlet.http.HttpServletResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@ApiController
class MemberApiController
(
        private val memberService: MemberService
        ){


    @PostMapping("/members")
    fun createMember(@RequestBody dto: CreateMemberRequestDto): ResponseEntity<Member> {

        val savedMember = memberService.createMember(dto)
        return ResponseEntity.ok(savedMember)
    }

    data class CreateMemberRequestDto(
            val name: String,
            val age: Int
    )


}