package com.netanel.moviescompose.featureMovieDetails.data.datasource

import com.netanel.moviescompose.domain.RetrofitInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/**
 * Created by netanelamar on 26/08/2023.
 * NetanelCA2@gmail.com
 */
@Module
@InstallIn(SingletonComponent::class)
object MovieDetailsModule {

    @Singleton
    @Provides
    fun provideNetworkManager(retrofitInstance: RetrofitInstance): MovieDetailsApiService {
        return retrofitInstance.create(MovieDetailsApiService::class.java)
    }

    /*    @Provides
        @Singleton
        fun provideMovieDetailsRepository(apiService: MovieDetailsApiService): MovieDetailsRepository {
            return MovieDetailsRepositoryImpl(apiService)
        }*/
}