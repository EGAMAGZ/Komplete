package ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val lightColorPalette = lightColors(
    primary = light_primary,
    onPrimary = light_onPrimary,
    secondary = light_secondary,
    onSecondary = light_onSecondary,
    background = light_background,
    onBackground = light_onBackground,
    surface = light_surface,
    onSurface = light_onSurface
)

@Composable
fun KompleteTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        shapes = Shapes,
        typography = Typography,
        colors = lightColorPalette,
        content = content
    )
}