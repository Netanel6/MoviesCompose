package com.netanel.moviescompose.domain.newModel

import com.netanel.moviescompose.domain.DefaultRestError

data class UpcomingMoviesModel(
    val dates: Dates,
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
): DefaultRestError()