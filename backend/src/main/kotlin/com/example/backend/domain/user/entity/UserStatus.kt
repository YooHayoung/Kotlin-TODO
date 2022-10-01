package com.example.backend.domain.user.entity

enum class UserStatus(val description: String) {

    ACTIVATE("서비스 이용 가능 상태"),
    WITHDRAWN("탈회한 상태"),
    ;
}