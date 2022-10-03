package com.example.backend.domain.user.service

import com.example.backend.domain.user.entity.User
import com.example.backend.domain.user.repository.UserRepository
import com.example.backend.domain.user.service.dto.UserDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserService(val userRepository: UserRepository) {

    fun saveUser(userSaveDto: UserDto): Long = userRepository.save(userSaveDto.toEntity()).id!!

    fun getUserList(): List<User> = userRepository.findAll()
}