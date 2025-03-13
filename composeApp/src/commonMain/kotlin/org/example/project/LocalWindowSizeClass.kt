package org.example.project

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.compositionLocalOf

val LocalWindowSizeClass =
    compositionLocalOf { WindowWidthSizeClass.Compact }