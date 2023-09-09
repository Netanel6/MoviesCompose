package com.netanel.moviescompose.featureHome.data.dataSource

import com.netanel.moviescompose.domain.RetrofitInstance
import com.netanel.moviescompose.featureHome.data.repository.HomeRepositoryImpl
import com.netanel.moviescompose.featureHome.domain.repository.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/**
 * Created by netanelamar on 21/08/2023.
 * NetanelCA2@gmail.com
 */
@Module
@InstallIn(SingletonComponent::class)
object HomeModule {

    @Singleton
    @Provides
    fun provideNetworkManager(retrofitInstance: RetrofitInstance): HomeApiService {
        return retrofitInstance.create(HomeApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideMoviesRepository(apiService: HomeApiService): HomeRepository {
        return HomeRepositoryImpl(apiService)
    }

}