package com.gfdellatin.meuportfolio.data.model

data class Repo(
    val id: Long,
    val name: String,
    val owner: Owner,
    val stargazersCount: Long,
    val language: String,
    val htmlURL: String,
    val description: String
)
