package com.netanel.moviescompose.featureMovieDetails.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch


/**
 * Created by netanelamar on 09/09/2023.
 * NetanelCA2@gmail.com
 */
//@HiltViewModel
class MovieDetailsViewModel /*@Inject constructor(private val repository: MovieDetailsRepository)*/ : ViewModel() {

//    val movieDetails: MutableState<Movie> = mutableStateOf(Movie())


    init {
//        movieDetails.value.let { movieDetails ->
            viewModelScope.launch(IO) {
               /* repository.getMovieDetails("tt10801048").enqueue(object: NetworkCallback<MovieDetailsModel>(){
                    override fun onSuccess(result: MovieDetailsModel?) {
                        Log.i("Netanel", result.toString())
                    }

                    override fun onFailure(error: DefaultRestError?) {
                        Log.i("Netanel", "onFailure: $error")
                    }

                })*/
            }
//        }
    }


    fun getMovieDetails() {

    }
}