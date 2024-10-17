package com.example.pokemonproject.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.pokemonproject.R
import com.example.pokemonproject.ui.network.QuotesApi
import com.example.pokemonproject.ui.network.RetrofitHelper
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
        testRetrofit()
    }

    private fun testRetrofit() {
        val quotesApi = RetrofitHelper.getInstance().create(QuotesApi::class.java)
        GlobalScope.launch {
            val result = quotesApi.getQuotes()
            if (result != null)
                Log.d("ayush: ", result.body().toString())
        }
    }

}
