package org.example.project

import androidx.compose.runtime.Composable
import org.example.project.notification.NotificationScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    FeresAppTheme {
        NotificationScreen()
    }
}
