package me.choicore.demo.springsecurity.authentication

sealed class AuthorizationToken {
    data class Bearer(val token: String) : AuthorizationToken() {
        override fun toString(): String {
            return "Bearer $token"
        }
    }
}
