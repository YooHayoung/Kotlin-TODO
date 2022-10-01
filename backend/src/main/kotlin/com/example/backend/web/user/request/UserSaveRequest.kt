package com.example.backend.web.user.request

import com.example.backend.domain.user.service.dto.UserDto

class UserSaveRequest {
    val loginId: String
    val password: String
    val nickname: String

    constructor(loginId: String, password: String, nickname: String) {
        this.loginId = loginId
        this.password = password
        this.nickname = nickname
    }

    fun toServiceDto(): UserDto = UserDto(loginId, password, nickname)
}