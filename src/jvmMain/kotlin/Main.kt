import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import ui.App
import ui.theme.KompleteTheme
import util.compose.rememberWindowInfo

fun main() = application {
    val state = rememberWindowState()
    val windowInfo = rememberWindowInfo(state.size.width, state.size.height)

    Window(
        onCloseRequest = ::exitApplication,
        state = state
    ) {
        KompleteTheme(
            windowInfo = windowInfo
        ) {
            App()
        }
    }
}
