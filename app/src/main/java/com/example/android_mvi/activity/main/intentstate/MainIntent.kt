package com.example.android_mvi.activity.main.intentstate

sealed class MainIntent {
    object AllPosts : MainIntent()
    object DeletePost : MainIntent()
}

