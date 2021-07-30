package com.gfdellatin.meuportfolio.domain

import com.gfdellatin.meuportfolio.core.UseCase
import com.gfdellatin.meuportfolio.data.model.Repo
import com.gfdellatin.meuportfolio.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository,
    ) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}