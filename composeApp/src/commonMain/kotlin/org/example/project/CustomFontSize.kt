package org.example.project

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.TextUnit

data class CustomFontSize(
    val windowSizeClass: WindowSizeClass
) {
    @Composable
    private fun getScaledSize(compactSize: Int, expandedSize: Int): TextUnit {
        return if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) {
            compactSize.nonScaledSp
        } else {
            expandedSize.nonScaledSp
        }
    }

    val mStandard: TextUnit @Composable get() = getScaledSize(10, 20)
    val xStandard: TextUnit @Composable get() = getScaledSize(13, 16)
    val xStandardX: TextUnit @Composable get() = getScaledSize(14, 16)
    val lStandard: TextUnit @Composable get() = getScaledSize(14, 18)
    val xlarge: TextUnit @Composable get() = getScaledSize(15, 18)
    val large: TextUnit @Composable get() = getScaledSize(16, 16)
    val largeX: TextUnit @Composable get() = getScaledSize(16, 26)
    val smLarge: TextUnit @Composable get() = getScaledSize(18, 20)
    val smLargeX: TextUnit @Composable get() = getScaledSize(18, 24)
    val smLargeXx: TextUnit @Composable get() = getScaledSize(18, 28)
    val xLarge: TextUnit @Composable get() = getScaledSize(20, 24)
    val xLargeX: TextUnit @Composable get() = getScaledSize(20, 28)
    val sLarge: TextUnit @Composable get() = getScaledSize(24, 24)
    val largeMax1: TextUnit @Composable get() = getScaledSize(40, 57)
}
@ReadOnlyComposable
fun fontSizing(calculateWindowSizeClass: WindowSizeClass) =
    compositionLocalOf { CustomFontSize(calculateWindowSizeClass) }

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
val MaterialTheme.fontSize: CustomFontSize
    @Composable
    get() = fontSizing(calculateWindowSizeClass()).current