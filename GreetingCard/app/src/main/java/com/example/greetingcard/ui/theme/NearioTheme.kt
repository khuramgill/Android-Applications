package com.example.greetingcard.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EA),
    secondary = Color(0xFF03DAC5),
    background = Color.White
)

@Composable
fun NearioTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,  // Using Typography from androidx.compose.material3
        content = content
    )
}
