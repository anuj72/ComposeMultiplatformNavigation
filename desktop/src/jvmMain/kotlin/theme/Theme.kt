package theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

import theme.Teal200
import theme.baseColor200
import theme.baseColor500
import theme.baseColor700

private val DarkColorPalette = darkColorScheme(
    primary = baseColor200,
    primaryContainer = baseColor700,
    secondary = Teal200
)

private val LightColorPalette = lightColorScheme(
    primary = baseColor500,
    primaryContainer = baseColor700,
    secondary = Teal200,

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

