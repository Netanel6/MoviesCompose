package com.netanel.moviescompose.featureHome.data.dataSource

import com.netanel.moviescompose.domain.newModel.UpcomingMoviesModel
import retrofit2.Call
import retrofit2.http.GET

interface HomeApiService {

    @GET("movie/upcoming?language=en-US&page=1")
    fun getUpcomingMovies(): Call<UpcomingMoviesModel>

    @GET("movie/now_playing?language=en-US&page=1")
    fun getNowPlayingMovies(): Call<UpcomingMoviesModel>

    @GET("movie/top_rated?language=en-US&page=1")
    fun getTopRatedMovies(): Call<UpcomingMoviesModel>

    @GET("movie/popular?language=en-US&page=1")
    fun getPopularMovies(): Call<UpcomingMoviesModel>
}