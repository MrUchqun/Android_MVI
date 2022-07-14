package com.example.android_mvi.activity.main.helper

import com.example.android_mvi.model.Post


interface MainHelper {
    suspend fun allPosts(): ArrayList<Post>
    suspend fun deletePost(id: Int): Post
}
