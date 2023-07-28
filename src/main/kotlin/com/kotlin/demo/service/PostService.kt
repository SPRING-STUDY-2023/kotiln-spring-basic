package com.kotlin.demo.service

import com.kotlin.demo.entity.Post
import com.kotlin.demo.repository.PostRepository
import org.springframework.stereotype.Service
import java.util.Optional;

@Service
class PostService(private val postRepository: PostRepository) {

    fun getPost(postId: Long): Post {
        val post: Optional<Post> = postRepository.findById(postId);
        return post.get();
    }

}