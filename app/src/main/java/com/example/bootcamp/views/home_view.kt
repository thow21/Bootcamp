package com.example.bootcamp.views

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.bootcamp.model.Movie
import com.example.bootcamp.model.getMovies

@Composable
fun HomeView(navController: NavController, movieList: List<Movie> = getMovies()) {

}