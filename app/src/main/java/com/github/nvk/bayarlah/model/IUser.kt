package com.github.nvk.bayarlah.model

interface IUser {

    val email: String
    val password: String
    fun isDataValid(): Int
}