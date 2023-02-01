package com.kotlin.demo.service

import com.kotlin.demo.controller.MemberApiController
import com.kotlin.demo.entity.Member
import com.kotlin.demo.repository.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService (
        private val memberRepository: MemberRepository
){
    @Transactional(readOnly = true)
    fun createMember(dto: MemberApiController.CreateMemberRequestDto): Member {
        val member =  Member(
                name = dto.name,
                age = dto.age
        )

        return memberRepository.save(member)
    }
}