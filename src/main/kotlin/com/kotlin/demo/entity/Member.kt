package com.kotlin.demo.entity

import com.kotlin.demo.entity.common.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name="member")
class Member (
        @Id
        val id: Long = 0,
        @Column(name="name")
        val name: String,
        @Column()
        val age: Int,
) : BaseEntity()