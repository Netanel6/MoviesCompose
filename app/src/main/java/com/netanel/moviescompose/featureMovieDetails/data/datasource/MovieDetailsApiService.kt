package com.netanel.moviescompose.featureMovieDetails.data.datasource

import com.netanel.moviescompose.domain.model.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


/**
 * Created by netanelamar on 26/08/2023.
 * NetanelCA2@gmail.com
 */
interface MovieDetailsApiService {

    companion object{
        const val MOVIE_ID : String = "movieId"
    }

    @GET("titles/x/titles-by-ids?idsList=$MOVIE_ID")
    fun getMovieDetails(@Path(MOVIE_ID) movieId:String): Call<List<Movie>>
}