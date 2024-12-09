package raf.console.primenotes.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import raf.console.primenotes.data.repo.NoteRepoImpl
import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {
    @Binds
    @Singleton
    abstract fun bindRepo(noteRepoImpl: NoteRepoImpl): NoteRepo
}