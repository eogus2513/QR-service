package com.example.qr.service

import com.example.qr.controller.dto.Response
import com.example.qr.domain.User
import com.example.qr.domain.UserRepository
import org.springframework.stereotype.Service

@Service
class QrService(
    private val userRepository: UserRepository
) {

    fun execute(): Response {
        val user: User = userRepository.save(User())
        println(user.id)
        return Response(user.id)
    }
}