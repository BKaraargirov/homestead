package com.theunderroot.homestead.auth.controller

import com.theunderroot.homestead.sdk.auth.contracts.LoginRequest
import com.theunderroot.homestead.sdk.auth.contracts.LoginResponse
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/auth")
class AuthController {
    @PostMapping("/login")
    fun login(@RequestBody request: LoginRequest): ResponseEntity<LoginResponse> {
        return ResponseEntity.ok(LoginResponse("token", "refreshToken"))
    }
}