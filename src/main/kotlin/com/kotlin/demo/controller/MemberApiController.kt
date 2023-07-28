package com.kotlin.demo.controller

import com.kotlin.demo.controller.common.ApiController
import com.kotlin.demo.dto.member.CreateMemberRequest
import com.kotlin.demo.entity.Member
import com.kotlin.demo.service.MemberService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@ApiController
class MemberApiController(private val memberService: MemberService){

    @PostMapping("/members")
    fun createMember(@RequestBody dto: CreateMemberRequest): ResponseEntity<Member> {

        val savedMember = memberService.createMember(dto)
        return ResponseEntity.ok(savedMember)
    }
}