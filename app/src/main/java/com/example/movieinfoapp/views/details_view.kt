package com.example.movieinfoapp.views

import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.movieinfoapp.model.Movie
import com.example.movieinfoapp.model.getMovies
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
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

    val newList = newMovieList[0].images[page]
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(newList)
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