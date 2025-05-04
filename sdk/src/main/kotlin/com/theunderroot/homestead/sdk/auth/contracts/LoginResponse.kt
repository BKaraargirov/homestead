package com.theunderroot.homestead.sdk.auth.contracts

data class LoginResponse(
    val token: String,
    val refreshToken: String
)
