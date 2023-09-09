package com.netanel.moviescompose.featureHome.data.repository

import com.netanel.moviescompose.domain.newModel.UpcomingMoviesModel
import com.netanel.moviescompose.featureHome.data.dataSource.HomeApiService
import com.netanel.moviescompose.featureHome.domain.repository.HomeRepository
import retrofit2.Call


/**
 * Created by netanelamar on 21/08/2023.
 * NetanelCA2@gmail.com
 */
class HomeRepositoryImpl(private val networkManager: HomeApiService): HomeRepository {

    override fun getUpcomingMovies(): Call<UpcomingMoviesModel> {
       return networkManager.getUpcomingMovies()
    }
    override fun getNowPlayingMovies(): Call<UpcomingMoviesModel> {
       return networkManager.getNowPlayingMovies()
    }

    override fun getTopRatedMovies(): Call<UpcomingMoviesModel> {
       return networkManager.getTopRatedMovies()
    }
}