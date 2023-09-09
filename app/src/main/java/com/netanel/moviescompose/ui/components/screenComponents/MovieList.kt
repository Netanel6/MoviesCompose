package com.netanel.moviescompose.ui.components.screenComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.netanel.moviescompose.domain.model.Movie
import com.netanel.moviescompose.ui.components.uiComponents.AppText

/**
 * Created by netanelamar on 26/08/2023.
 * NetanelCA2@gmail.com
 */

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MovieList(
    headerText: String? = null,
    modifier: Modifier,
    movies: List<Movie>,
    onMovieClicked: (Movie) -> Unit
) {
    Column(modifier = modifier.fillMaxWidth() , horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        headerText?.let { headerText ->
            AppText(
                modifier = modifier
                    .padding(horizontal = 8.dp, vertical = 12.dp)
                    .align(Alignment.Start), text = headerText, textSize = 16.sp
            )
        }
        LazyRow(
            modifier = modifier
                .wrapContentHeight()
        ) {
            itemsIndexed(items = movies) { _, movie ->
                MovieItem(modifier = modifier, movie, onMovieClicked)
            }
          /*  item {
                AppText(
                    modifier = modifier
                        .padding(horizontal = 8.dp, vertical = 12.dp)
                        .align(Alignment.Start), text = "headerText", textSize = 16.sp
                )
            }*/
            itemsIndexed(items = movies) { _, movie ->
                MovieItem(modifier = modifier, movie, onMovieClicked)
            }
        }
    }

}
