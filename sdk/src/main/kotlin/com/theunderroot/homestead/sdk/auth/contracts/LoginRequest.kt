package com.theunderroot.homestead.sdk.auth.contracts

data class LoginRequest(
    val username: String = "",
    val password: String = ""
) {
    constructor() : this("", "")
}