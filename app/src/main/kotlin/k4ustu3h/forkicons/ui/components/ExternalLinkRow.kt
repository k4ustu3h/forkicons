package k4ustu3h.forkicons.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import k4ustu3h.forkicons.ui.components.core.SimpleListRow
import k4ustu3h.forkicons.ui.theme.LawniconsTheme
import k4ustu3h.forkicons.ui.util.PreviewLawnicons
import k4ustu3h.forkicons.ui.util.visitUrl

@Composable
fun ExternalLinkRow(
    name: String,
    url: String,
    modifier: Modifier = Modifier,
    divider: Boolean = true,
    background: Boolean = false,
    first: Boolean = false,
    last: Boolean = false,
    startIcon: @Composable (() -> Unit)? = null,
) {
    val context = LocalContext.current

    SimpleListRow(
        modifier = modifier,
        background = background,
        first = first,
        last = last,
        divider = divider,
        label = name,
        onClick = { context.visitUrl(url) },
        startIcon = startIcon,
    )
}

@PreviewLawnicons
@Composable
private fun ExternalLinkRowPreview() {
    LawniconsTheme {
        ExternalLinkRow(
            name = "User",
            url = "https://lawnchair.app/",
        )
    }
}
