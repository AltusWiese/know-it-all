package com.example.android.knowitall.model.repositories

interface AutomotiveRepositoryI {

    interface RepositoryCallback {
        fun onSuccess(response:Boolean)
        fun onError(exception: Exception?)
    }

    fun retrieveText(callback: RepositoryCallback)

}