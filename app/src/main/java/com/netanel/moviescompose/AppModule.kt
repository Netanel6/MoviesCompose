package com.netanel.moviescompose

import com.netanel.moviescompose.featureHome.data.dataSource.HomeApiService
import com.netanel.moviescompose.domain.RetrofitInstance
import dagger.Module
import dagger.Provides

import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/**
 * Created by netanelamar on 19/08/2023.
 * NetanelCA2@gmail.com
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofitInstance() = RetrofitInstance


    @Singleton
    @Provides
    fun provideNetworkManager(retrofitInstance: RetrofitInstance): HomeApiService {
        return retrofitInstance.create(HomeApiService::class.java)
    }

}
