package com.example.backend.domain.user.service.dto

import com.example.backend.domain.user.entity.User

class UserDto {

    var loginId: String
    var password: String
    var nickname: String

    constructor(loginId: String, password: String, nickname: String) {
        this.loginId = loginId
        this.password = password
        this.nickname = nickname
    }

    fun toEntity() = User(loginId = loginId, password = password, nickname = nickname)
}