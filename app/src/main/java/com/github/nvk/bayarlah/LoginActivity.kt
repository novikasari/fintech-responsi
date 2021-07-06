package com.github.nvk.bayarlah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.github.nvk.bayarlah.presenter.LoginPresenter
import com.github.nvk.bayarlah.view.ILoginView

class LoginActivity : AppCompatActivity(), ILoginView {

    internal lateinit var loginPresenter: LoginPresenter

   // private lateinit var btnLogin: Button
    private lateinit var etEmail: EditText
    private lateinit var etPass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //init
        loginPresenter = LoginPresenter(this)

        //event
        val  btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            loginPresenter.onLogin(etEmail.text.toString(),
                etPass.text.toString())
        }

    }

    override fun onLoginSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}