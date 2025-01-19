package k4ustu3h.forkicons.di

import android.app.Application
import k4ustu3h.forkicons.repository.IconRepository
import k4ustu3h.forkicons.repository.IconRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object IconRepositoryModule {

    @Provides
    @Singleton
    fun provideIconRepository(application: Application): IconRepository =
        IconRepositoryImpl(application)
}
