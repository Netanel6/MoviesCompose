package com.netanel.moviescompose.ui.components.uiComponents

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun HorizontalDottedProgressBar() {
    val color = MaterialTheme.colors.primary

    val infiniteTransition = rememberInfiniteTransition()
    val state = infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 6f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 700,
                easing = LinearEasing
            )
        )
    )

    DrawCanvas(state = state.value, radius = 15.dp, color = color)
}


@Composable
fun DrawCanvas(
    state: Float,
    radius: Dp,
    color: Color,
) {
    Canvas(
        modifier = Modifier
            .fillMaxSize(),
    ) {

        val radiusValue = radius.value
        val padding = (radiusValue + (radiusValue * 0.5f))

        for (i in 1..5) {
            if (i - 1 == state.toInt()) {
                drawCircle(
                    radius = radiusValue * 2,
                    brush = SolidColor(color),
                    center = Offset(
                        x = this.center.x + radiusValue * 2 * (i - 3) + padding * (i - 3),
                        y = this.center.y
                    )
                )
            } else {
                drawCircle(
                    radius = radiusValue,
                    brush = SolidColor(color),
                    center = Offset(
                        x = this.center.x + radiusValue * 2 * (i - 3) + padding * (i - 3),
                        y = this.center.y
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun ProgressBarPreview() {
    HorizontalDottedProgressBar()
}

