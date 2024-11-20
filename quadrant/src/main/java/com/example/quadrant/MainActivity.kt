package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrant.ui.theme.DiceRollerTheme

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
    Column( modifier= Modifier
        .fillMaxSize()
        .padding(16.dp)
    ) {
        Row (modifier = Modifier.weight(1f)){

            Quadrant(
    title = "Text composable",
    description ="Displays text and follows the recommended Material Design guidelines." ,
    backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f))

            Quadrant(
                title = "Image composable",
                description ="Creates a composable that lays out and draws a given Painter class object." ,
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f) )
        }

        Row (modifier = Modifier.weight(1f)){
            Quadrant(
                title = "Row composable",
                description ="A layout composable that places its children in a horizontal sequence." ,
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f) )

            Quadrant(
                title = "Column composable",
                description ="A layout composable that places its children in a vertical sequence." ,
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f) )
        }
    }
}

@Composable


fun Quadrant(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize() // Utilisation correcte du modificateur passé
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 16.dp) // Pas besoin d'utiliser le `modifier` passé ici
        )
        Text(
            text = description,
            fontSize = 12.sp
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