package com.netanel.moviescompose.ui.components.uiComponents

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp


/**
 * Created by netanelamar on 26/08/2023.
 * NetanelCA2@gmail.com
 */


@Composable
fun AppText(
    modifier: Modifier,
    text: String,
    textSize: TextUnit = 16.sp,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Color.Black,
    overflow: TextOverflow = TextOverflow.Visible,
    maxLines: Int = 1,
    onClick: () -> Unit? = {},
) {
    Text(
        modifier = modifier.clickable {
            onClick
        },
        style = TextStyle(fontSize = textSize),
        text = text,
        textAlign = textAlign,
        color = color,
        fontFamily = FontFamily.Default,
        overflow = overflow,
        maxLines = maxLines
    )
}