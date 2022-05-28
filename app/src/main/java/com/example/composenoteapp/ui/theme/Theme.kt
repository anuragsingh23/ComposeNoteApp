package com.example.composenoteapp.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val DarkColorPalette = darkColors(
        primary = Color.White,
        background = DarkGray,
        onBackground = Color.White,
        surface = LightBlue,
        onSurface = DarkGray
    )

    @Composable
    fun ComposeNoteAppTheme(darkTheme: Boolean = true, content: @Composable() () -> Unit) {
        MaterialTheme(
            colors = DarkColorPalette,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
