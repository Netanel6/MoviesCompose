package com.netanel.moviescompose.featureMovieDetails.domain.repository

import com.netanel.moviescompose.domain.model.Movie
import retrofit2.Call


/**
 * Created by netanelamar on 26/08/2023.
 * NetanelCA2@gmail.com
 */
interface MovieDetailsRepository {
    fun getMovieDetails(movieId: String): Call<List<Movie>>
}