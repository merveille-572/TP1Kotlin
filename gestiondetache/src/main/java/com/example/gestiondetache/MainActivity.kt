package com.example.gestiondetache

import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gestiondetache.ui.theme.DiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Task(name = "")
                }
            }
        }
    }
}

@Composable
fun Task(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize() // Remplit toute la taille de l'écran
            .padding(16.dp), // Padding global si besoin
        contentAlignment = Alignment.Center // Centre tout le contenu verticalement et horizontalement
    ){
        Column( horizontalAlignment = Alignment.CenterHorizontally,) {
            val image = painterResource(R.drawable.android_logo).also {
                Image(
                    painter = it,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    alpha = 0.5F,
                    modifier = Modifier

                )
            }
            Text(
                text = "All tasks completed",
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp)
                    .align(alignment = Alignment.CenterHorizontally)// Marge intérieure de 16dp (haut, bas, gauche, droite)
            )

            Text(
                text = "Nice work!",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 8.dp)
                    .align(alignment = Alignment.CenterHorizontally)
                // Marge intérieure de 16dp (haut, bas, gauche, droite)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DiceRollerTheme {
        Task(name = "")
    }
}

