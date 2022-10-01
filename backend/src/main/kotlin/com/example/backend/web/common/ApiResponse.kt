package com.example.backend.web.common

import org.springframework.http.HttpStatus
import java.time.LocalDateTime

class ApiResponse<T> private constructor(
    val responseTime: LocalDateTime,
    val status: Int,
    val data: T
) {

    companion object {
        fun <T> createSuccess(data: T): ApiResponse<T> {
            return ApiResponse(
                responseTime = LocalDateTime.now(),
                status = HttpStatus.OK.value(),
                data = data
            )
        }
    }
}