package raf.console.primenotes.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import raf.console.primenotes.domain.use_cases.*
import raf.console.primenotes.domain.repo.NoteRepo
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideAddNoteUseCase(noteRepo: NoteRepo): AddNoteUseCase = AddNoteUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideUpdateNoteUseCase(noteRepo: NoteRepo): UpdateNoteUseCase = UpdateNoteUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideDeleteNoteUseCase(noteRepo: NoteRepo): DeleteNoteUseCase = DeleteNoteUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetAllNotesUseCase(noteRepo: NoteRepo): GetAllNotesUseCase = GetAllNotesUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetAllNotesOrderByTitleUseCase(noteRepo: NoteRepo): GetAllNotesOrderByTitleUseCase = GetAllNotesOrderByTitleUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetAllImportantNotesUseCase(noteRepo: NoteRepo): GetAllImportantNotesUseCase = GetAllImportantNotesUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetAllBookmarkedNotesUseCase(noteRepo: NoteRepo): GetAllBookmarkedNotesUseCase = GetAllBookmarkedNotesUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetAllCompletedNotesUseCase(noteRepo: NoteRepo): GetAllCompletedNotesUseCase = GetAllCompletedNotesUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetAllNotesWithAttachmentsUseCase(noteRepo: NoteRepo): GetAllNotesWithAttachmentsUseCase = GetAllNotesWithAttachmentsUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetAllNotesWithImagesUseCase(noteRepo: NoteRepo): GetAllNotesWithImagesUseCase = GetAllNotesWithImagesUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetAllNotesWithAudioUseCase(noteRepo: NoteRepo): GetAllNotesWithAudioUseCase = GetAllNotesWithAudioUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByStatusUseCase(noteRepo: NoteRepo): GetNotesByStatusUseCase = GetNotesByStatusUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByTagUseCase(noteRepo: NoteRepo): GetNotesByTagUseCase = GetNotesByTagUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesWithRemindersUseCase(noteRepo: NoteRepo): GetNotesWithRemindersUseCase = GetNotesWithRemindersUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByReminderDateRangeUseCase(noteRepo: NoteRepo): GetNotesByReminderDateRangeUseCase = GetNotesByReminderDateRangeUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByLanguageUseCase(noteRepo: NoteRepo): GetNotesByLanguageUseCase = GetNotesByLanguageUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByLocationUseCase(noteRepo: NoteRepo): GetNotesByLocationUseCase = GetNotesByLocationUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByCategoryUseCase(noteRepo: NoteRepo): GetNotesByCategoryUseCase = GetNotesByCategoryUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNoteByIdUseCase(noteRepo: NoteRepo): GetNoteByIdUseCase = GetNoteByIdUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByContentUseCase(noteRepo: NoteRepo): GetNotesByContentUseCase = GetNotesByContentUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByTitleUseCase(noteRepo: NoteRepo): GetNotesByTitleUseCase = GetNotesByTitleUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByDateRangeUseCase(noteRepo: NoteRepo): GetNotesByDateRangeUseCase = GetNotesByDateRangeUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByPriorityUseCase(noteRepo: NoteRepo): GetNotesByPriorityUseCase = GetNotesByPriorityUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByColorUseCase(noteRepo: NoteRepo): GetNotesByColorUseCase = GetNotesByColorUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByTextFormatUseCase(noteRepo: NoteRepo): GetNotesByTextFormatUseCase = GetNotesByTextFormatUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByMinViewCountUseCase(noteRepo: NoteRepo): GetNotesByMinViewCountUseCase = GetNotesByMinViewCountUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesBySortOrderUseCase(noteRepo: NoteRepo): GetNotesBySortOrderUseCase = GetNotesBySortOrderUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesByEncryptionKeyUseCase(noteRepo: NoteRepo): GetNotesByEncryptionKeyUseCase = GetNotesByEncryptionKeyUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetRelatedNotesUseCase(noteRepo: NoteRepo): GetRelatedNotesUseCase = GetRelatedNotesUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideGetNotesWithCommentsUseCase(noteRepo: NoteRepo): GetNotesWithCommentsUseCase = GetNotesWithCommentsUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideUpdateImagePathUseCase(noteRepo: NoteRepo): UpdateImagePathUseCase = UpdateImagePathUseCase(noteRepo)

    @Provides
    @Singleton
    fun provideUpdateAudioPathUseCase(noteRepo: NoteRepo): UpdateAudioPathUseCase = UpdateAudioPathUseCase(noteRepo)
}
