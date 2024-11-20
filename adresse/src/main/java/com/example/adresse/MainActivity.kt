package com.example.adresse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.adresse.ui.theme.DiceRollerTheme

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
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Ajouter un Spacer pour créer de l'espace en haut
        Spacer(modifier = Modifier.weight(1f))

        // Section supérieure centrée
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val logo = painterResource(id = R.drawable.android_logo)
            Image(
                painter = logo,
                contentDescription = null, // L'image est décorative
                modifier = Modifier
                    .size(100.dp)
                    .padding(bottom = 16.dp)
            )
            Text(
                text = "Jennifer Doe",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Android Developer Extraordinaire!",
                fontSize = 20.sp,
                color = Color(0xFF3ddc84),
                textAlign = TextAlign.Center
            )
        }

        // Ajouter un Spacer pour pousser la section supérieure vers le centre
        Spacer(modifier = Modifier.weight(1f))

        // Section inférieure
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            ContactItem(iconResId = R.drawable.ic_email, contactText = "jennifer.doe@example.com")
            ContactItem(iconResId = R.drawable.ic_phone, contactText = "+123 456 7890")

        }
    }
}

@Composable
fun ContactItem(contactText: String, iconResId: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(24.dp)
        )
        Text(
            text = contactText,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DiceRollerTheme {
        BusinessCard()
    }
}