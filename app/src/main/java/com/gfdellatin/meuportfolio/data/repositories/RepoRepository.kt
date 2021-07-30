package com.gfdellatin.meuportfolio.data.repositories

import com.gfdellatin.meuportfolio.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String) : Flow<List<Repo>>
}