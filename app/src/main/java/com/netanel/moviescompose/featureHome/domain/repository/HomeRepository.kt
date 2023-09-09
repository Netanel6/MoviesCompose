package com.netanel.moviescompose.featureHome.domain.repository


import com.netanel.moviescompose.domain.newModel.UpcomingMoviesModel
import retrofit2.Call


/**
 * Created by netanelamar on 21/08/2023.
 * NetanelCA2@gmail.com
 */
interface HomeRepository {
    fun getUpcomingMovies(): Call<UpcomingMoviesModel>
    fun getNowPlayingMovies(): Call<UpcomingMoviesModel>
}