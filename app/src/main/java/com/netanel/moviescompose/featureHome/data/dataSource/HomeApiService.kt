package com.netanel.moviescompose.featureHome.data.dataSource

import com.netanel.moviescompose.domain.model.UpcomingMoviesModel
import retrofit2.Call
import retrofit2.http.GET

interface HomeApiService {

    @GET("titles/x/upcoming")
    fun getUpcomingMovies(): Call<UpcomingMoviesModel>
}