package com.example.bootcamp.views

import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.bootcamp.model.Movie
import com.example.bootcamp.model.getMovies
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield

@OptIn(ExperimentalPagerApi::class)
@Composable
fun DetailsView(navController: NavController, movieTitle: String?) {

    val newMovieList: List<Movie> = getMovies().filter { movie ->
        movie.title == movieTitle
    }

    val pageCount = newMovieList[0].images.size
    val pagerState = rememberPagerState(
        initialPage = 1
    )
    LaunchedEffect(Unit) {
        while (true) {
            yield()
            delay(2000)
            tween<Float>(600)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1) % pageCount
            )
        }
    }

//    val newList = newMovieList[0].images[page]
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
//            .data(newList)
            .build(), contentDescription = null, contentScale = ContentScale.FillBounds,
        colorFilter = ColorFilter.tint(Color.Black.copy(0.4f), blendMode = BlendMode.Darken)
    )

}




@Composable
private fun DetailBody(newMovieList: Movie) {

}

@Composable
private fun ProjectText(data: String?, title: String?) {

}