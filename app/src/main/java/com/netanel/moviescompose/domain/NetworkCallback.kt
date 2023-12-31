package com.netanel.moviescompose.domain

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * Created by netanelamar on 20/08/2023.
 * NetanelCA2@gmail.com
 */
abstract class NetworkCallback<T : DefaultRestError?> : Callback<T?> {
    override fun onResponse(call: Call<T?>, response: Response<T?>) {
        if (isResponseOK(response)){
            onSuccess(response.body())
        } else {
            Log.i("Netanel", "onResponse: $response")
            onFailure(DefaultRestError(error = response.raw().code.toString() , stack = response.raw().message, result = response.message().toString()))
        }
    }

    override fun onFailure(call: Call<T?>, throwable: Throwable) {
        onFailure(DefaultRestError())
    }

    abstract fun onSuccess(result: T?)

    abstract fun onFailure(error: DefaultRestError?)

    companion object {
        const val TAG = "DefNetworkClbk"

        fun isResponseOK(response: Response<out DefaultRestError?>?): Boolean {
            return response?.body() != null && response.body()?.isErrorType() == false
        }
    }
}