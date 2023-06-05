package com.example.kotlinproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.kotlinproject.screens.HomeScreen
import com.example.kotlinproject.ui.theme.KotlinProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()

        }
    }
}

@Composable
fun App() {
    KotlinProjectTheme {
        Surface {
            HomeScreen()
        }
    }
}









