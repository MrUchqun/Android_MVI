package com.example.android_mvi.activity.main.helper

import com.example.android_mvi.model.Post
import com.example.android_mvi.network.service.PostService

class MainHelperImpl(private val postService: PostService) : MainHelper {

    override suspend fun allPosts(): ArrayList<Post> {
        return postService.allPosts()
    }

    override suspend fun deletePost(id: Int): Post {
        return postService.deletePost(id)
    }
}
