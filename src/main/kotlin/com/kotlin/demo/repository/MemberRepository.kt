package com.kotlin.demo.repository

import com.kotlin.demo.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
}