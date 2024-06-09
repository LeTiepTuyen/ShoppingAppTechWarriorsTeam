package com.example.shoppingapptechwarriorsteam.activities.util

sealed class RegisterValidation() {
    object Success : RegisterValidation()
    data class Failure(val message: String) : RegisterValidation()
}
data class RegisterFieldsState(
    val email:RegisterValidation,
    val password:RegisterValidation,
)
