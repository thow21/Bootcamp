package com.example.bootcamp.views

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bootcamp.model.Movie
import com.example.bootcamp.model.getMovies
import com.example.bootcamp.navigation.MovieEnum
import com.example.bootcamp.widgets.MovieRow

@Composable
fun HomeView(navController: NavController, movieList: List<Movie> = getMovies()) {

}