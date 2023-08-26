package com.netanel.moviescompose.domain.model

import com.netanel.moviescompose.domain.DefaultRestError

data class UpcomingMoviesModel(
    val entries: Int,
    val next: String,
    val page: Int,
    val results: List<Movie>
) : DefaultRestError()