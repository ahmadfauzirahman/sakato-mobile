package com.ifa.sakato

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ifa.sakato.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        supportActionBar?.hide()


        binding.signInButton.setOnClickListener {
            login()

        }
    }

    private fun login() {
        val username = binding.usernameEditText.text.toString().trim()
        val password = binding.userPasswordEditText.text.toString().trim()
        if(!validateUser(username) || !validatePassword(password)){
            return
        }
        startActivity(Intent(this@LoginActivity, HomeActivity::class.java))
    }

    private fun validateUser(username: String): Boolean {
        if(username.isEmpty()){
            binding.usernameInputLayout.error = "Username tidak boleh kosong"
            return false
        }
        binding.usernameInputLayout.error
        return true
    }

    private fun validatePassword(password: String): Boolean {
        if(password.isEmpty()){
            binding.userPasswordInputLayout.error = "Password tidak boleh kosong"
            return false
        }
        return true
    }
}