package com.example.qr.controller

import com.example.qr.controller.dto.Response
import com.example.qr.service.QrService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class QrController(
    private val qrService: QrService
) {

    @PostMapping
    fun execute(): Response = qrService.execute()
}