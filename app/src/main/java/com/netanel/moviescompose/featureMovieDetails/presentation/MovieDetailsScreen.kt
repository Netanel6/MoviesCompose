package com.netanel.moviescompose.featureMovieDetails.presentation

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.netanel.moviescompose.ui.components.uiComponents.AppText


/**
 * Created by netanelamar on 26/08/2023.
 * NetanelCA2@gmail.com
 */

@Composable
fun MovieDetailsScreen(
    modifier: Modifier = Modifier,
    movieId: String,
    navController: NavController? = null,
    viewModel: MovieDetailsViewModel = hiltViewModel()
) {
    val context = LocalContext.current


    /*val data = remember {
        mutableStateOf(navController?.previousBackStackEntry?.arguments?.getStringArrayList("movieId"))
    }*/

    Column(modifier = modifier.fillMaxSize()) {
        AppText(
            modifier = modifier.clickable{
            Toast.makeText(context, movieId, Toast.LENGTH_SHORT).show()
        } , text = "Details", )
    }
}