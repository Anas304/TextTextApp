package org.example.project

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

//data class Spacing(
//    val xxxSmall: Dp = 1.dp,
//    val xxSmall: Dp = 2.dp,
//    val xSmall: Dp = 3.dp,
//    val mSmall: Dp = 4.dp,
//    val small: Dp = 6.dp,
//    val ssSmall : Dp = 7.dp,
//    val smSmall : Dp = 8.dp,
//    val medium: Dp = 9.dp,
//    val mStandard: Dp = 10.dp,
//    val standard: Dp = 12.dp,
//    val xStandard: Dp = 13.dp,
//    val lStandard: Dp = 14.dp,
//    val large: Dp = 16.dp,
//    val smLarge: Dp = 18.dp,
//    val ssmLarge: Dp = 19.dp,
//    val xLarge: Dp = 20.dp,
//    val sLarge: Dp = 24.dp,
//    val lLarge: Dp = 22.dp,
//    val xxLarge: Dp = 26.dp,
//    val xxmLarge: Dp = 28.dp,
//    val mLarge: Dp = 30.dp,
//    val mSLarge: Dp = 37.dp,
//    val xxxLarge: Dp = 32.dp,
//    val largeMax1: Dp = 40.dp,
//    val largeMax2: Dp = 45.dp,
//    val largeMax3: Dp = 50.dp,
//    val largeMax4: Dp = 56.dp,
//    val largeMaxV4: Dp = 69.dp,
//    val largeMaxLV4: Dp = 70.dp,
//    val largeMax5: Dp = 83.dp,
//    val largeMax6 : Dp = 96.dp
//)


data class Spacing(
    val windowSizeClass: WindowSizeClass
) {
    val xxxSmall: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 1.dp else 2.dp
    val xxSmall: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 2.dp else 4.dp
    val xSmall: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 3.dp else 6.dp
    val mSmall: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 4.dp else 8.dp
    val small: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 6.dp else 12.dp
    val ssSmall: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 7.dp else 14.dp
    val smSmall: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 8.dp else 16.dp
    val medium: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 9.dp else 18.dp
    val mStandard: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 10.dp else 20.dp
    val standard: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 12.dp else 24.dp
    val xStandard: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 13.dp else 26.dp
    val lStandard: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 14.dp else 28.dp
    val large: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 16.dp else 37.dp
    val xlarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 17.dp else 34.dp
    val smLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 18.dp else 36.dp
    val ssmLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 19.dp else 38.dp
    val xLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 20.dp else 40.dp
    val sLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 24.dp else 48.dp
    val lmLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 21.dp else 42.dp
    val lLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 22.dp else 44.dp
    val xxLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 26.dp else 52.dp
    val xxmLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 28.dp else 56.dp
    val mLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 30.dp else 60.dp
    val mxLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 35.dp else 70.dp
    val mSLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 37.dp else 74.dp
    val xxxLarge: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 32.dp else 64.dp
    val largeMax1: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 40.dp else 80.dp
    val largeMaxM1: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 42.dp else 84.dp
    val largeMax2: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 45.dp else 90.dp
    val largeMax3: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 50.dp else 100.dp
    val largeMaxM3: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 53.dp else 106.dp
    val largeMax4: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 56.dp else 112.dp
    val largeMaxm4: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 60.dp else 120.dp
    val largeMaxV4: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 69.dp else 138.dp
    val largeMaxLV4: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 70.dp else 140.dp
    val largeMax5: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 83.dp else 166.dp
    val largeMax6: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 96.dp else 192.dp
    val largeMax7: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 120.dp else 220.dp
    val sheetScaffold: Dp =
        if (windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact) 600.dp else 800.dp
}

@ReadOnlyComposable
fun LocalSpacing(calculateWindowSizeClass: WindowSizeClass) =
    compositionLocalOf { Spacing(calculateWindowSizeClass) }

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
val MaterialTheme.spacing: Spacing
    @Composable
    get() = LocalSpacing(calculateWindowSizeClass()).current
