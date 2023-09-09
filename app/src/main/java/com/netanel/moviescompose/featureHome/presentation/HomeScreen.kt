package com.netanel.moviescompose.featureHome.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.netanel.moviescompose.R
import com.netanel.moviescompose.ui.components.screenComponents.MovieList
import com.netanel.moviescompose.ui.components.uiComponents.HorizontalDottedProgressBar

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController? = null,
    viewModel: HomeViewModel = hiltViewModel()
) {
    Column(modifier = modifier.fillMaxSize()) {
        if (viewModel.upcomingMovies.value.isEmpty() && viewModel.nowPlayingMovies.value.isEmpty()) HorizontalDottedProgressBar()
        else Row {
            MovieList(
                modifier = modifier,
                headerText = stringResource(id = R.string.upcoming_movies_year),
                movies = viewModel.upcomingMovies.value,
                onMovieClicked = { movie ->
                    /*movie.id.let { movieId ->
                        navController?.navigate(route = Screen.MovieDetails.withArgs(movieId))
                    }*/
                })
        }
        Row {
            MovieList(
                modifier = modifier,
                headerText = stringResource(id = R.string.now_playing),
                movies = viewModel.nowPlayingMovies.value,
                onMovieClicked = { movie ->
                    /*movie.id.let { movieId ->
                        navController?.navigate(route = Screen.MovieDetails.withArgs(movieId))
                    }*/
                })
        }

    }
}

@Preview(name = "HomeScreen")
@Composable
private fun PreviewHomeScreen() { }