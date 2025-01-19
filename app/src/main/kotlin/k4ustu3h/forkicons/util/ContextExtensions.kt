package k4ustu3h.forkicons.util

import android.content.Context
import android.graphics.Bitmap
import androidx.core.graphics.drawable.toBitmap
import k4ustu3h.forkicons.R

fun Context.appIcon(): Bitmap = (
    this.resources.getDrawable(R.mipmap.ic_launcher, this.theme)
        ?: packageManager.getApplicationIcon(packageName)
    )
    .toBitmap()
