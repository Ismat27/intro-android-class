package com.example.introandroidclass

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var emailInput: EditText
    private  lateinit var passwordInput: EditText
    private lateinit var submitButton: MaterialButton
    private val emailRegex = Regex("[A-Za-z]+[A-Za-z0-9._]+@[A-Za-z]+\\.[A-Za-z]{2,3}")

    private var emailText = ""
    private var passwordText = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
    }

    private fun validateCredentials(email: String, password: String): String {
        if (!emailRegex.matches(email)) {
            return "incorrect email format"
        }
        if (email != "adegbiteismail27@gmail.com") {
            return  "Incorrect email"
        }
        if (password.isEmpty() || password.isBlank()) {
            return "password cannot be empty"
        }
        if (password != "password") {
            return "Incorrect password"
        }
        return  "Login Successful"
    }

    private fun initializeView() {
        emailInput = findViewById(R.id.emailInput)
        passwordInput = findViewById(R.id.passwordInput)
        submitButton = findViewById(R.id.btnTap)

        submitButton.setOnClickListener {
            val emailEntered = emailInput.text.toString()
            val passwordEntered = passwordInput.text.toString()
            val validationResponse = validateCredentials(emailEntered, passwordEntered)
            Toast.makeText(this, validationResponse, Toast.LENGTH_SHORT).show()
        }
    }
}