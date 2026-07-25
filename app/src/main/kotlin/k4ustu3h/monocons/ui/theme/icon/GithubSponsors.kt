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
                moveTo(12.345f, 18.916f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, 0f)
                lineToRelative(-0.008f, -0.004f)
                lineToRelative(-0.018f, -0.01f)
                curveToRelative(-0.103f, -0.057f, -0.208f, -0.11f, -0.31f, -0.17f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.434f, -2.414f)
                curveTo(6.045f, 14.731f, 4f, 12.35f, 4f, 9.5f)
                curveTo(4f, 6.836f, 6.086f, 5f, 8.25f, 5f)
                curveToRelative(1.547f, 0f, 2.903f, 0.802f, 3.75f, 2.02f)
                curveTo(12.847f, 5.802f, 14.203f, 5f, 15.75f, 5f)
                curveTo(17.914f, 5f, 20f, 6.836f, 20f, 9.5f)
                curveToRelative(0f, 2.85f, -2.045f, 5.231f, -3.885f, 6.818f)
                arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.744f, 2.584f)
                lineToRelative(-0.018f, 0.01f)
                lineToRelative(-0.006f, 0.003f)
                moveTo(8.25f, 6.5f)
                curveToRelative(-1.336f, 0f, -2.75f, 1.164f, -2.75f, 3f)
                curveToRelative(0f, 2.15f, 1.58f, 4.144f, 3.365f, 5.682f)
                arcTo(20.6f, 20.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17.393f)
                arcToRelative(20.6f, 20.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.135f, -2.211f)
                curveTo(16.92f, 13.644f, 18.5f, 11.65f, 18.5f, 9.5f)
                curveToRelative(0f, -1.836f, -1.414f, -3f, -2.75f, -3f)
                curveToRelative(-1.373f, 0f, -2.609f, 0.986f, -3.029f, 2.456f)
                curveToRelative(-0.205f, 0.728f, -1.237f, 0.728f, -1.442f, 0f)
                curveTo(10.859f, 7.486f, 9.623f, 6.5f, 8.25f, 6.5f)
            }
        }.build()

        return _GithubSponsors!!
    }

@Suppress("ObjectPropertyName")
private var _GithubSponsors: ImageVector? = null
