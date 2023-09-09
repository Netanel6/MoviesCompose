package com.netanel.moviescompose.featureMovieDetails.data.repository

import com.netanel.moviescompose.domain.model.MovieDetailsModel
import com.netanel.moviescompose.featureMovieDetails.data.datasource.MovieDetailsApiService
import com.netanel.moviescompose.featureMovieDetails.domain.repository.MovieDetailsRepository
import retrofit2.Call


/**
 * Created by netanelamar on 26/08/2023.
 * NetanelCA2@gmail.com
 */
class MovieDetailsRepositoryImpl(private val networkManager: MovieDetailsApiService) :
    MovieDetailsRepository {
    override fun getMovieDetails(movieId: String): Call<MovieDetailsModel> {
        return networkManager.getMovieDetails(movieId)
    }
}