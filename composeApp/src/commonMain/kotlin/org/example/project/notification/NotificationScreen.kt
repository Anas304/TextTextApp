package org.example.project.notification

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import org.example.project.fontSize
import texttextapp.composeapp.generated.resources.Res
import texttextapp.composeapp.generated.resources.car_box


@Composable
fun NotificationScreen() {
    LazyColumn {
        items(12) {
            EventNotificationItem()
        }
    }
}




@Composable
fun EventNotificationItem(
    title: String = "Booking Successful!",
    actionDate: String = "22 Jan, 2025",
    time: String = "12:00 PM",
    onItemClick: () -> Unit = {},
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 16.dp,
                vertical = 12.dp
            )
            .clickable { onItemClick() },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .wrapContentSize(),
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(Res.drawable.car_box),
                contentDescription = null,
                tint = Color.Unspecified
            )
            Column(
                modifier = Modifier
                    .wrapContentSize(),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                DefaultText(
                    text = title,
                    style = MaterialTheme.typography.displayLarge.copy(fontWeight = FontWeight.SemiBold)
                )
                DefaultText(
                    text = actionDate,
                    maxLines = 1,
                    style = MaterialTheme.typography.bodySmall.copy(fontSize = MaterialTheme.fontSize.large),
                    color = Color.Black.copy(alpha = 0.5f)
                )
            }
        }
        Column(
            modifier = Modifier
                .wrapContentSize(),
            verticalArrangement = Arrangement.spacedBy(6.dp),
            horizontalAlignment = Alignment.End
        ) {
            DefaultText(
                text = time,
                maxLines = 1,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = MaterialTheme.fontSize.large),
                color = Color.Black.copy(alpha = 0.5f)
            )
            NotificationTag()
        }
    }
}



@Composable
fun DefaultText(
    text: String,
    color: Color = MaterialTheme.colorScheme.onBackground,
    textAlign: TextAlign = TextAlign.Start,
    modifier: Modifier = Modifier,
    maxLines: Int = Int.MAX_VALUE,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = if (maxLines == 1) TextOverflow.Ellipsis else TextOverflow.Clip,
    style: TextStyle = MaterialTheme.typography.bodyMedium,
    textDecoration: TextDecoration = TextDecoration.None
) {
    Text(
        text = text,
        color = color,
        textAlign = textAlign,
        modifier = modifier,
        style = style,
        maxLines = maxLines,
        overflow = overflow,
        textDecoration = textDecoration,
        lineHeight = lineHeight
    )
}
@Composable
fun NotificationTag(
    title: String = "New",
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
) {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .clip(RoundedCornerShape(16.dp))
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        DefaultText(
            text = title,
            style = MaterialTheme.typography.displaySmall.copy(fontSize = MaterialTheme.fontSize.lStandard),
            color = MaterialTheme.colorScheme.background,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    vertical = 6.dp,
                    horizontal = 10.dp
                )
        )
    }
}