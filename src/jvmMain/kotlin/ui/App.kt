package ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import util.compose.LocalWindowInfo

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Actual text: $text",
                style = MaterialTheme.typography.h1
            )
            Text(
                text="${LocalWindowInfo.current}",
                style = MaterialTheme.typography.caption
            )
            Button(onClick = {
                text = "Hello, Desktop!"
            }) {
                Text(text.uppercase())
            }
        }
    }
}