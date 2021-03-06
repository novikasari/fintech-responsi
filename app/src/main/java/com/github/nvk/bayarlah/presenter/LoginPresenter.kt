package com.github.nvk.bayarlah.presenter

import com.github.nvk.bayarlah.model.User
import com.github.nvk.bayarlah.view.ILoginView

class LoginPresenter (private var iLoginView: ILoginView): ILoginPresenter{

    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val loginCode = user.isDataValid()
        if (loginCode == 0)
            iLoginView.onLoginError("Email must not be null")
        else if (loginCode == 1)
            iLoginView.onLoginError("Wrong email address !")
        else if (loginCode == 2)
            iLoginView.onLoginError("Password must be grather than 6")
        else
            iLoginView.onLoginSuccess("Login Success")
    }
}