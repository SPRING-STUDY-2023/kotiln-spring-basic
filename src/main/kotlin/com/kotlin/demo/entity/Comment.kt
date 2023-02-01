package com.kotlin.demo.entity

import com.kotlin.demo.entity.common.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name="comment")
class Comment (

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
        @Column(name="writer")
    val writer: String,
        @ManyToOne(targetEntity = Post::class, fetch = FetchType.LAZY )
    @JoinColumn(name="post_id")
    val post: Post,
        @Column(name="content", columnDefinition = "VARCHAR(255)")
        val content: String
    ): BaseEntity()