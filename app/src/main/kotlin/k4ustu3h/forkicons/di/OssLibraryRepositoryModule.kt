package k4ustu3h.forkicons.di

import android.app.Application
import k4ustu3h.forkicons.repository.OssLibraryRepository
import k4ustu3h.forkicons.repository.OssLibraryRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OssLibraryRepositoryModule {

    @Provides
    @Singleton
    fun provideOssLibraryRepository(application: Application): OssLibraryRepository = OssLibraryRepositoryImpl(application = application)
}
