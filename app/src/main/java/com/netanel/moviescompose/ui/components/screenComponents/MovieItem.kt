package com.netanel.moviescompose.ui.components.screenComponents

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.netanel.moviescompose.domain.newModel.Movie
import com.netanel.moviescompose.ui.components.uiComponents.AppText

@OptIn(ExperimentalGlideComposeApi::class)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MovieItem(modifier: Modifier, movie: Movie? = null, onMovieClicked: (Movie) -> Unit) {
    /*    Card(
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
                .padding(horizontal = 12.dp)
                .clickable { movie?.let { onMovieClicked(it) } },
            shape = MaterialTheme.shapes.large,
            backgroundColor = Color.Transparent,
        ) {*/
    if (movie?.poster_path != null)
    Column(
        modifier = modifier
            .wrapContentHeight()
            .width(120.dp)
            .padding(horizontal = 8.dp)
            .clickable { onMovieClicked(movie) },
        horizontalAlignment = CenterHorizontally
    ) {
        GlideImage(
            contentScale = ContentScale.Crop,
            modifier = modifier
                .height(150.dp),
            model = movie.fullPosterPath,
            contentDescription = movie.title
        )
        AppText(
            modifier = modifier.padding(vertical = 8.dp),
            text = movie.title,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
            maxLines = 3
        )
        AppText(
            modifier = modifier,
            text = movie.release_date
        )
    }
//    }
}

@Preview(name = "MovieItem")
@Composable
private fun PreviewMovieItem() {

}