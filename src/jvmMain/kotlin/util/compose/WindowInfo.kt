package util.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class WindowInfo(
    val screenWidthInfo: WindowType = WindowType.Compact,
    val screenHeightInfo: WindowType = WindowType.Compact,
    val screenWidth: Dp = 599.dp,
    val screenHeight: Dp = 479.dp
) {
    sealed class WindowType {
        object Compact : WindowType()
        object Medium : WindowType()
        object Expanded : WindowType()
    }

    companion object {
        fun baseOnSize(width: Dp, height: Dp) = WindowInfo(
            screenWidthInfo = when {
                width < 600.dp -> WindowType.Compact
                width < 840.dp -> WindowType.Medium
                else -> WindowType.Expanded
            },
            screenHeightInfo = when {
                height < 480.dp -> WindowType.Compact
                height < 900.dp -> WindowType.Medium
                else -> WindowType.Expanded
            },
            screenWidth = width,
            screenHeight = height
        )
    }
}

val LocalWindowInfo = compositionLocalOf { WindowInfo() }

@Composable
fun rememberWindowInfo(width: Dp, height: Dp) = WindowInfo.baseOnSize(width, height)