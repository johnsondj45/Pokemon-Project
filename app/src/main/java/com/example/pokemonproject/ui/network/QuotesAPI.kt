package com.example.pokemonproject.ui.network

import com.example.pokemonproject.ui.model.QuoteList
import retrofit2.Response
import retrofit2.http.GET

interface QuotesApi {
    @GET("/quotes")
    suspend fun getQuotes() : Response<QuoteList>
}