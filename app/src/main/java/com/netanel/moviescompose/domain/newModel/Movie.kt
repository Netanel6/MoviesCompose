package com.netanel.moviescompose.domain.newModel

import com.netanel.moviescompose.domain.NetworkUtils.POSTER_PATH
import com.netanel.moviescompose.utils.with

data class Movie(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
) {

    val fullPosterPath: String
        get(){
            return POSTER_PATH.with(poster_path)
        }
}
