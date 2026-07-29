package k4ustu3h.monocons.ui.theme.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Monocons.GithubSponsors: ImageVector
    get() {
        if (_GithubSponsors != null) {
            return _GithubSponsors!!
        }
        _GithubSponsors = ImageVector.Builder(
            name = "GithubSponsors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.687f, 3.25f)
                curveToRelative(-1.933f, 0f, -3.628f, 1.002f, -4.688f, 2.524f)
                curveTo(10.94f, 4.252f, 9.244f, 3.25f, 7.311f, 3.25f)
                curveTo(4.606f, 3.25f, 2f, 5.544f, 2f, 8.874f)
                curveToRelative(0f, 3.563f, 2.555f, 6.54f, 4.855f, 8.523f)
                arcToRelative(
                    27.6f,
                    27.6f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    4.68f,
                    3.23f,
                )
                lineToRelative(0.024f, 0.015f)
                lineToRelative(0.007f, 0.002f)
                verticalLineToRelative(0.003f)
                arcToRelative(
                    0.9f,
                    0.9f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    0.433f,
                    0.103f,
                )
                arcToRelative(
                    0.9f,
                    0.9f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    0.435f,
                    -0.103f,
                )
                verticalLineToRelative(-0.003f)
                lineToRelative(0.005f, -0.002f)
                lineToRelative(0.024f, -0.015f)
                arcToRelative(
                    27.6f,
                    27.6f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    4.68f,
                    -3.23f,
                )
                curveTo(19.444f, 15.414f, 22f, 12.437f, 22f, 8.874f)
                curveToRelative(0f, -3.33f, -2.608f, -5.625f, -5.313f, -5.625f)
                moveToRelative(-0.767f, 12.73f)
                arcToRelative(
                    26f,
                    26f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -3.918f,
                    2.764f,
                )
                lineTo(12f, 18.741f)
                lineToRelative(-0.003f, 0.002f)
                arcToRelative(
                    26f,
                    26f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -3.92f,
                    -2.763f,
                )
                curveToRelative(-2.23f, -1.923f, -4.206f, -4.416f, -4.206f, -7.104f)
                curveToRelative(0f, -2.295f, 1.768f, -3.75f, 3.438f, -3.75f)
                curveToRelative(1.717f, 0f, 3.261f, 1.233f, 3.787f, 3.07f)
                arcToRelative(
                    0.93f,
                    0.93f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    0.904f,
                    0.663f,
                )
                arcToRelative(
                    0.92f,
                    0.92f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    0.905f,
                    -0.663f,
                )
                curveToRelative(0.525f, -1.837f, 2.07f, -3.07f, 3.787f, -3.07f)
                curveToRelative(1.67f, 0f, 3.438f, 1.455f, 3.438f, 3.75f)
                curveToRelative(0f, 2.688f, -1.975f, 5.18f, -4.207f, 7.103f)
            }
        }.build()

        return _GithubSponsors!!
    }

@Suppress("ObjectPropertyName")
private var _GithubSponsors: ImageVector? = null
