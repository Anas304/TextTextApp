package org.example.project

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import org.example.getPlatformFontScale

val Int.nonScaledSp
    @Composable
    get() = (this.toFloat() / getPlatformFontScale()).sp
