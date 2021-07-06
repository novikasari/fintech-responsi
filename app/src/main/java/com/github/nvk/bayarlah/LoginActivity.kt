package com.github.nvk.bayarlah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.nvk.bayarlah.presenter.LoginPresenter
import com.github.nvk.bayarlah.view.ILoginView

class LoginActivity : AppCompatActivity(), ILoginView {

    internal lateinit var loginPresenter: LoginPresenter

    private lateinit var btnLogin: Button
    private lateinit var etEmail: EditText
    private lateinit var etPass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //init
        loginPresenter = LoginPresenter(this)

        //event
        btnLogin.setOnClickListener {
            loginPresenter.onLogin(etEmail.text.toString(), etPass.text.toString())
        }

    }

    override fun onLoginSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}