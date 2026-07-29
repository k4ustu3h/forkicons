/*
 * Copyright 2026 Lawnchair Launcher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package k4ustu3h.monocons.ui.theme.icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Monocons.IconDashboard: ImageVector
    get() {
        if (_IconDashboard != null) {
            return _IconDashboard!!
        }
        _IconDashboard = ImageVector.Builder(
            name = "IconDashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 21f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                reflectiveQuadTo(3f, 19f)
                lineTo(3f, 5f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                reflectiveQuadTo(5f, 3f)
                horizontalLineToRelative(14f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                reflectiveQuadTo(21f, 5f)
                verticalLineToRelative(14f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                reflectiveQuadTo(19f, 21f)
                close()
                moveTo(11f, 15f)
                lineTo(5f, 15f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                close()
                moveTo(13f, 15f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4f)
                close()
                moveTo(11f, 13f)
                lineTo(11f, 9f)
                lineTo(5f, 9f)
                verticalLineToRelative(4f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(6f)
                lineTo(19f, 9f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(14f)
                lineTo(19f, 5f)
                lineTo(5f, 5f)
                close()
            }
        }.build()

        return _IconDashboard!!
    }

@Suppress("ObjectPropertyName")
private var _IconDashboard: ImageVector? = null
