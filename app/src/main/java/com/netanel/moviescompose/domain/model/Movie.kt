package com.netanel.moviescompose.domain.model

data class Movie(
    val _id: String,
    val id: String,
    val originalTitleText: OriginalTitleText,
    val primaryImage: PrimaryImage,
    val releaseDate: ReleaseDate,
    val releaseYear: ReleaseYear,
    val titleText: TitleText,
    val titleType: TitleType
) {
    val fullReleaseDate
        get() = "${releaseDate.day}/${releaseDate.month}/${releaseDate.year}"
}