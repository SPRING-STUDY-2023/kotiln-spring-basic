package com.kotlin.demo.service

import com.kotlin.demo.dto.member.CreateMemberRequest
import com.kotlin.demo.entity.Member
import com.kotlin.demo.repository.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService (
        private val memberRepository: MemberRepository
){
    @Transactional(readOnly = true)
    fun createMember(request: CreateMemberRequest): Member {
        val member =  Member(
                name = request.name,
                age = request.age
        )

        return memberRepository.save(member)
    }
}