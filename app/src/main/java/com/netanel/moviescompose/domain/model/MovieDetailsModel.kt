package com.netanel.moviescompose.domain.model

import com.netanel.moviescompose.domain.DefaultRestError

data class MovieDetailsModel(
    val entries: Int,
    val results: List<Movie>
): DefaultRestError()