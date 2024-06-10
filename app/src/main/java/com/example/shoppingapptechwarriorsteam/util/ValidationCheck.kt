package com.example.shoppingapptechwarriorsteam.util

import android.util.Patterns


fun validateEmail(email:String): RegisterValidation{
    if(email.isEmpty())
        return RegisterValidation.Failure("Email cannot be empty")

    if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        return RegisterValidation.Failure("Wrong email format")
    return RegisterValidation.Success
}
fun  validatePassword(password:String): RegisterValidation{
    if(password.isEmpty())
        return RegisterValidation.Failure("Password cannot be empty")
    if(password.length < 6)
        return RegisterValidation.Failure("Password should contain at least 6 characters")

    return RegisterValidation.Success

}