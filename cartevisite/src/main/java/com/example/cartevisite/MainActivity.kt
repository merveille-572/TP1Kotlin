package com.example.cartevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import com.example.cartevisite.ui.theme.DiceRollerTheme

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
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    // Container pour centrer tout le contenu
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Appliquer une marge intérieure sur toute la colonne
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Image (vérifiez que cette image est bien dans res/drawable)
        val image = painterResource(id = R.drawable.android_logo) // Remplacez si nécessaire
        Image(
            painter = image,
            contentDescription = "Logo Android",
            contentScale = ContentScale.Fit, // Assurez-vous que l'image est bien dimensionnée
            modifier = Modifier
                .padding(bottom = 16.dp) // Marge entre l'image et le texte
                .fillMaxSize(0.3f) // Taille relative de l'image, ajustez si nécessaire
        )

        // Nom avec style en gras
        Text(
            text = "Jennifer Doe",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 8.dp) // Marge entre le nom et la description
        )

        // Description
        Text(
            text = "Android Developer Extraordinaire!",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 8.dp) // Marge entre les deux textes
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DiceRollerTheme {
        Greeting()
    }
}
