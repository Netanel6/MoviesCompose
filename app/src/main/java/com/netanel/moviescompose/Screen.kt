package com.netanel.moviescompose


/**
 * Created by netanelamar on 21/08/2023.
 * NetanelCA2@gmail.com
 */
sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object MovieDetails : Screen("movie_details")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
