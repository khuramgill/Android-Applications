package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import com.example.greetingcard.ui.theme.NearioTheme

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                    colors = listOf(Color(0xFF6200EA), Color(0xFF03DAC5))
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // App logo/text placeholder
            Box(
                modifier = Modifier
                    .size(180.dp)
                    .background(Color(0xFF03DAC5), CircleShape) // Round background for logo area
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Neario", // App name as text
                    style = MaterialTheme.typography.headlineLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF6200EA)
                    )
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Welcome Text
            Text(
                text = "Welcome to Neario!",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            // App Description
            Text(
                text = "Discover hidden gems and local landmarks wherever you go.",
                style = MaterialTheme.typography.bodyLarge.copy(color = Color.White)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Explore Button (Card style)
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(8.dp),
                shape = MaterialTheme.shapes.medium,
                colors = CardDefaults.cardColors(containerColor = Color(0xFF6200EA))
            ) {
                Button(
                    onClick = { /* Navigate to explore page */ },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EA)),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text(
                        text = "Start Exploring",
                        color = Color.White,
                        style = TextStyle(fontWeight = FontWeight.Bold)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Footer Text
            Text(
                text = "Neario - Explore the world around you.",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NearioTheme {
        HomeScreen()
    }
}
