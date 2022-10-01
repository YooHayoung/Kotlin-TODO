package com.example.backend.web.user.controller

import com.example.backend.domain.user.service.UserService
import com.example.backend.web.common.ApiResponse
import com.example.backend.web.user.request.UserSaveRequest
import com.example.backend.web.user.response.UserSaveResponse
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController(val userService: UserService) {

    // logger
    companion object {
        private val log = LoggerFactory.getLogger(UserController::class.java)
    }

    @PostMapping
    fun userSave(@RequestBody request: UserSaveRequest): ApiResponse<UserSaveResponse> {
        log.info("start ${object{}.javaClass.enclosingMethod.name} start!")
        val savedUserId = userService.saveUser(request.toServiceDto())
        return ApiResponse.createSuccess(UserSaveResponse(savedUserId))
    }
}