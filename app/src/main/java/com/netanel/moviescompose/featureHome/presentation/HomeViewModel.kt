package com.netanel.moviescompose.featureHome.presentation

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.netanel.moviescompose.domain.DefaultRestError
import com.netanel.moviescompose.domain.NetworkCallback
import com.netanel.moviescompose.domain.model.Movie
import com.netanel.moviescompose.domain.model.UpcomingMoviesModel
import com.netanel.moviescompose.featureHome.domain.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


/**
 * Created by netanelamar on 21/08/2023.
 * NetanelCA2@gmail.com
 */
@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: HomeRepository): ViewModel() {

    val upcomingMovies: MutableState<List<Movie>> = mutableStateOf(ArrayList())

    init {
        getUpcomingMovies()
    }

    private fun getUpcomingMovies(){
        viewModelScope.launch {
            repository.getUpcomingMovies().enqueue(object: NetworkCallback<UpcomingMoviesModel>(){
                override fun onSuccess(result: UpcomingMoviesModel?) {
                    if (result != null) {
                        Log.i(TAG, "onSuccess: $result")
                        upcomingMovies.value = result.results
                    }
                }

                override fun onFailure(error: DefaultRestError?) {
                    Log.i(TAG, "onFailure: $error")
                }

            })
        }
    }
}