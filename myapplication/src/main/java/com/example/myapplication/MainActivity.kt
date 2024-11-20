package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.DiceRollerTheme

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
                    ColumnAndRowExample()
                }
            }
        }
    }
}

@Composable
fun ColumnAndRowExample() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Padding autour de la colonne
        verticalArrangement = Arrangement.SpaceBetween, // Espacement entre les enfants
        horizontalAlignment = Alignment.CenterHorizontally // Centrage des enfants horizontalement
    ) {
        Text(
            text = "En-tête",
            modifier = Modifier
                .background(Color.Red)
                .padding(8.dp) // Padding interne pour le texte
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
                .padding(8.dp), // Padding autour de la row
            horizontalArrangement = Arrangement.SpaceEvenly, // Distribution égale entre les enfants
            verticalAlignment = Alignment.CenterVertically // Centrer verticalement
        ) {
            Text(
                text = "Élément 1",
                modifier = Modifier.background(Color.Green)
            )
            Text(
                text = "Élément 2",
                modifier = Modifier.background(Color.Blue)
            )
            Text(
                text = "Élément 3",
                modifier = Modifier.background(Color.Cyan)
            )
        }

        Text(
            text = "Pied de page",
            modifier = Modifier
                .background(Color.Magenta)
                .padding(8.dp)
        )


    }

    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(onClick = { result = "Résultat du bouton 1" }) {
            Text(text = "Bouton 1")
        }
        Button(onClick = { result = "Résultat du bouton 2" }) {
            Text(text = "Bouton 2")
        }

        // Affichage du résultat
        if (result.isNotEmpty()) {
            Text(text = result)
        }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DiceRollerTheme {
        ColumnAndRowExample()
    }
}