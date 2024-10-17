package com.example.pokemonproject.ui.network

import com.example.pokemonproject.ui.model.Pokemon
import retrofit2.Response
import retrofit2.http.GET

interface PokeApi {
    @GET("/api/v2/pokemon/squirtle")
    suspend fun getPokemon(): Response<Pokemon>
}