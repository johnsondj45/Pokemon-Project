package com.example.pokemonproject.ui

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.pokemonproject.R
import com.example.pokemonproject.ui.network.PokeApi
import com.example.pokemonproject.ui.network.RetrofitHelper
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
        textView = findViewById(R.id.pokemon_name)
        testRetrofit()
    }

    private fun testRetrofit() {
        val quotesApi = RetrofitHelper.getInstance().create(PokeApi::class.java)
        lifecycleScope.launch {
            val result = quotesApi.getPokemon()
            val pokemon = result.body()
            textView.text = pokemon?.name
            Log.d("SLICK: ", result.raw().toString())
        }
    }

}
