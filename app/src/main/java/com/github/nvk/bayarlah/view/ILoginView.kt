package com.github.nvk.bayarlah.view

interface ILoginView {

    fun onLoginSuccess(message: String)
    fun onLoginError(message: String)
}