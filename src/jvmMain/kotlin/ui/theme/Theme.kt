package ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import util.compose.LocalWindowInfo
import util.compose.WindowInfo

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
    windowInfo: WindowInfo,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(LocalWindowInfo provides windowInfo){
        MaterialTheme(
            shapes = Shapes,
            typography = Typography,
            colors = lightColorPalette,
            content = content
        )
    }
}