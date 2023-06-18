package com.example.bootcamp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.bootcamp.navigation.MovieNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MyApp{
                MovieNavigation()
            }
        }
    }
}

@Composable
fun MyApp(content : @Composable () -> Unit){
    content()
}

