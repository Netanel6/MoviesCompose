package com.netanel.moviescompose.featureMovieDetails.data.datasource


/**
 * Created by netanelamar on 26/08/2023.
 * NetanelCA2@gmail.com
 */
interface MovieDetailsApiService {

    companion object{
        const val MOVIE_ID : String = "idsList"
    }
/*
    @GET("titles/x/titles-by-ids")
    fun getMovieDetails(@Query(MOVIE_ID) movieId:String): Call<MovieDetailsModel>*/
}