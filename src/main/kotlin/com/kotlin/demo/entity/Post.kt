package com.kotlin.demo.entity

import com.kotlin.demo.entity.common.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name="post")
class Post (
        @Id
        val id: Long,
        @Column(name="title")
        val title: String,
        @Column(name="content", columnDefinition = "TEXT")
        val content: String
): BaseEntity()