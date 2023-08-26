package com.netanel.moviescompose.domain

/**
 * Created by netanelamar on 20/08/2023.
 * NetanelCA2@gmail.com
 */
open class DefaultRestError(
    val error: String? = null,
    val stack: String? = null,
    val result: String? = null,
) {

    open fun isErrorType(): Boolean {
        return error != null || stack != null && result != null
    }

    override fun toString(): String {
        return "DefaultRestError(error=$error, stack=$stack, result=$result)"
    }
}