package com.netanel.moviescompose.domain.model

data class PrimaryImage(
    val __typename: String,
    val caption: Caption,
    val height: Int,
    val id: String,
    val url: String,
    val width: Int
)