package com.example.backend.web.user.controller

import com.example.backend.domain.user.entity.User

class UserDetailResponse {
    val userId: Long
    val loginId: String
    val password: String
    val nicknmae: String

    constructor(user: User) {
        this.userId = user.id!!
        this.loginId = user.loginId
        this.password = user.password
        this.nicknmae = user.nickname
    }
}