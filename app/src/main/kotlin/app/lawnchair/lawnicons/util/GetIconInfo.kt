package app.lawnchair.lawnicons.util

import android.annotation.SuppressLint
import android.content.Context
import app.lawnchair.lawnicons.R
import app.lawnchair.lawnicons.model.IconInfo
import org.xmlpull.v1.XmlPullParser

@SuppressLint("DiscouragedApi")
fun Context.getIconInfo(): List<IconInfo> {
    val iconInfo = mutableListOf<IconInfo>()

    val componentInfoPrefixLength = "ComponentInfo{".length

    try {
        val xmlId = R.xml.appfilter
        if (xmlId != 0) {
            val parser = resources.getXml(xmlId)
            val depth = parser.depth
            var type: Int
            while (
                (
                    parser.next()
                        .also { type = it } != XmlPullParser.END_TAG || parser.depth > depth
                    ) &&
                type != XmlPullParser.END_DOCUMENT
            ) {
                if (type != XmlPullParser.START_TAG) continue
                if ("item" == parser.name) {
                    val component = parser.getAttributeValue(null, "component")
                    val iconName = parser.getAttributeValue(null, "name")

                    val initialIconId = parser.getAttributeValue(null, "drawable")
                    val iconId = "${initialIconId}_foreground"
                    val iconDrawable = resources.getIdentifier(iconId, "drawable", packageName)

                    var actualComponent = ""

                    val parsedComponent =
                        component.substring(componentInfoPrefixLength, component.length - 1)

                    if (parsedComponent.isNotEmpty() && !parsedComponent.startsWith("/") &&
                        !parsedComponent.endsWith("/")
                    ) {
                        actualComponent = parsedComponent
                    }

                    iconInfo.add(IconInfo(iconName, iconId, actualComponent, iconDrawable))
                }
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }

    return iconInfo
}
