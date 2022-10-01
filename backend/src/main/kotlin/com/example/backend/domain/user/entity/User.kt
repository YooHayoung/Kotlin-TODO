package com.example.backend.domain.user.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
open class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val id: Long? = null

    @Column(nullable = false)
    var loginId: String
        protected set

    @Column(nullable = false)
    var password: String
        protected set

    @Column(nullable = false)
    var nickname: String
        protected set

    constructor(loginId: String, password: String, nickname: String) {
        this.loginId = loginId
        this.password = password
        this.nickname = nickname
    }

    fun updateLoginId(loginId: String) {
        this.loginId = loginId
    }

    fun updatePassword(password: String) {
        this.password = password
    }

    fun updateNickname(nickname: String) {
        this.nickname = nickname
    }
}