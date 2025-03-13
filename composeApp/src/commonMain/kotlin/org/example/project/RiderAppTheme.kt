@file:OptIn(ExperimentalMaterial3WindowSizeClassApi::class)

package org.example.project

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.Font
import texttextapp.composeapp.generated.resources.Res
import texttextapp.composeapp.generated.resources.aeonikbold
import texttextapp.composeapp.generated.resources.aeonikregular

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun FeresAppTheme(
    content: @Composable () -> Unit,
) {
    val lightColors = lightColorScheme(
        primary = md_theme_light_primary,//md_theme_light_primary,
        onPrimary = md_theme_light_onPrimary,
        primaryContainer = md_theme_light_primaryContainer,
        onPrimaryContainer = md_theme_light_onPrimaryContainer,
        secondary = md_theme_light_secondary,
        onSecondary = md_theme_light_onSecondary,
        secondaryContainer = md_theme_light_secondaryContainer,
        onSecondaryContainer = md_theme_light_onSecondaryContainer,
        tertiary = md_theme_light_tertiary,
        onTertiary = md_theme_light_onTertiary,
        tertiaryContainer = md_theme_light_tertiaryContainer,
        onTertiaryContainer = md_theme_light_onTertiaryContainer,
        error = md_theme_light_error,
        onError = md_theme_light_onError,
        errorContainer = md_theme_light_errorContainer,
        onErrorContainer = md_theme_light_onErrorContainer,
        outline = md_theme_light_outline,
        background = md_theme_light_background,
        onBackground = md_theme_light_onBackground,
        surface = md_theme_light_surface,
        onSurface = md_theme_light_onSurface,
        surfaceVariant = md_theme_light_surfaceVariant,
        onSurfaceVariant = md_theme_light_onSurfaceVariant,
        inverseSurface = md_theme_light_inverseSurface,
        inverseOnSurface = md_theme_light_inverseOnSurface,
        inversePrimary = md_theme_light_inversePrimary,
        surfaceTint = md_theme_light_surfaceTint,
        outlineVariant = md_theme_light_outlineVariant,
        scrim = md_theme_light_scrim,
    )

    val fontRegularFamily = FontFamily(
        Font(
            Res.font.aeonikregular,
            weight = FontWeight.Normal
        )
    )
    val fontBoldFamily = FontFamily(
        Font(
            Res.font.aeonikbold,
            weight = FontWeight.Bold
        )
    )

    val typography = Typography(
        displaySmall = TextStyle(
            fontFamily = fontRegularFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 14.nonScaledSp
        ),
        displayMedium = TextStyle(
            fontFamily = fontRegularFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 14.nonScaledSp
        ),
        displayLarge = TextStyle(
            fontFamily = fontRegularFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 18.nonScaledSp
        ),
        headlineSmall = TextStyle(
            fontFamily = fontRegularFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 24.nonScaledSp
        ),
        headlineMedium = TextStyle(
            fontFamily = fontRegularFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 26.nonScaledSp
        ),
        headlineLarge = TextStyle(
            fontFamily = fontBoldFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 26.nonScaledSp
        ),
        bodySmall = TextStyle(
            fontFamily = fontRegularFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 16.nonScaledSp
        ),
        bodyMedium = TextStyle(
            fontFamily = fontRegularFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 16.nonScaledSp
        ),
        bodyLarge = TextStyle(
            fontFamily = fontBoldFamily,
            fontWeight = FontWeight.W500,
            fontSize = 18.nonScaledSp
        ),
        labelSmall = TextStyle(
            fontFamily = fontRegularFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 12.nonScaledSp
        ),
        labelMedium = TextStyle(
            fontFamily = fontRegularFamily,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.nonScaledSp
        ),
        labelLarge = TextStyle(
            fontFamily = fontBoldFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 12.nonScaledSp
        ),
    )


    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(8.dp),
        large = RoundedCornerShape(13.dp),
        extraLarge = RoundedCornerShape(40.dp),
    )


    val windowSize = calculateWindowSizeClass()
    CompositionLocalProvider(
        LocalSpacing(windowSize) provides Spacing(windowSize),
        LocalWindowSizeClass provides windowSize.widthSizeClass,
    ) {
        MaterialTheme(
            colorScheme = lightColors,
            typography = typography,
            shapes = shapes,
            content = content
        )
    }
}

@Composable
fun textFieldStyle(): TextStyle = TextStyle(
    textAlign = TextAlign.Start,
    fontWeight = FontWeight.W400,
    fontSize = 16.nonScaledSp,
    fontFamily = FontFamily(Font(Res.font.aeonikregular)),
)

@Composable
fun textFieldErrorStyle(): TextStyle = TextStyle(
    textAlign = TextAlign.Start,
    fontWeight = FontWeight.W400,
    fontSize = 12.nonScaledSp,
    color = MaterialTheme.colorScheme.error
)

@Composable
fun textFieldPlaceholderStyle(): TextStyle = TextStyle(
    textAlign = TextAlign.Start,
    fontWeight = FontWeight.W400,
    fontSize = 16.nonScaledSp,
    fontFamily = FontFamily(Font(Res.font.aeonikregular)),
    color = MaterialTheme.colorScheme.tertiary
)
