package com.netanel.moviescompose.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.netanel.moviescompose.Screen
import com.netanel.moviescompose.featureHome.presentation.HomeScreen
import com.netanel.moviescompose.featureMovieDetails.presentation.MovieDetailsScreen


/**
 * Created by netanelamar on 21/08/2023.
 * NetanelCA2@gmail.com
 */
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(
            Screen.MovieDetails.withArgs("{$MOVIE_ID}")
        ) { navBackStackEntry ->
            val movieId = navBackStackEntry.arguments?.getString(MOVIE_ID)
            MovieDetailsScreen(navController = navController, movieId= movieId.toString())
        }
    }
}

const val MOVIE_ID = "movieId"
/*arguments = listOf(
                navArgument(
                    "movieId"
                ) {
                    type = NavType.StringType
                    defaultValue = ""
                })*/