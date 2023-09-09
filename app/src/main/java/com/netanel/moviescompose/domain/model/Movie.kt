package com.netanel.moviescompose.domain.model

data class Movie(
    val _id: String? = null,
    val id: String? = null,
    val originalTitleText: OriginalTitleText? = null,
    val primaryImage: PrimaryImage? = null,
    val releaseDate: ReleaseDate? = null,
    val releaseYear: ReleaseYear? = null,
    val titleText: TitleText? = null,
    val titleType: TitleType? = null
) {
    val fullReleaseDate
        get() = "${releaseDate?.day}/${releaseDate?.month}/${releaseDate?.year}"
}