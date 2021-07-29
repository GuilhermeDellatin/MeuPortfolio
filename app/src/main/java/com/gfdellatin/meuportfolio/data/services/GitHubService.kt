package com.gfdellatin.meuportfolio.data.services

import com.gfdellatin.meuportfolio.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{users}/repos")
    fun  listRepositories(@Path("user") user: String) : List<Repo>
}