package k4ustu3h.forkicons.ui.destination

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import k4ustu3h.forkicons.BuildConfig
import k4ustu3h.forkicons.R
import k4ustu3h.forkicons.ui.components.ContributorRow
import k4ustu3h.forkicons.ui.components.IconLink
import k4ustu3h.forkicons.ui.components.core.Card
import k4ustu3h.forkicons.ui.components.core.LawniconsScaffold
import k4ustu3h.forkicons.ui.components.core.SimpleListRow
import k4ustu3h.forkicons.ui.theme.LawniconsTheme
import k4ustu3h.forkicons.ui.util.Constants
import k4ustu3h.forkicons.ui.util.Contributor
import k4ustu3h.forkicons.ui.util.ExternalLink
import k4ustu3h.forkicons.ui.util.PreviewLawnicons
import k4ustu3h.forkicons.util.appIcon
import kotlinx.serialization.Serializable

@Serializable
data object About

fun NavGraphBuilder.aboutDestination(
    onBack: () -> Unit,
    onNavigateToContributors: () -> Unit,
    onNavigateToAcknowledgements: () -> Unit,
    isExpandedScreen: Boolean,
) {
    composable<About> {
        About(
            onBack = onBack,
            onNavigateToContributors = onNavigateToContributors,
            onNavigateToAcknowledgements = onNavigateToAcknowledgements,
            isExpandedScreen = isExpandedScreen,
        )
    }
}

@Composable
private fun About(
    onBack: () -> Unit,
    onNavigateToContributors: () -> Unit,
    onNavigateToAcknowledgements: () -> Unit,
    isExpandedScreen: Boolean,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current

    LawniconsScaffold(
        modifier = modifier,
        title = stringResource(id = R.string.about),
        onBack = onBack,
        isExpandedScreen = isExpandedScreen,
    ) { paddingValues ->
        val layoutDirection = LocalLayoutDirection.current
        val verticalListPadding = 8.dp
        LazyColumn(
            contentPadding = PaddingValues(
                start = paddingValues.calculateStartPadding(layoutDirection),
                top = paddingValues.calculateTopPadding() + verticalListPadding,
                end = paddingValues.calculateEndPadding(layoutDirection),
                bottom = paddingValues.calculateBottomPadding() + verticalListPadding,
            ),
        ) {
            item {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 8.dp,
                            bottom = 32.dp,
                        ),
                ) {
                    if (LocalInspectionMode.current) {
                        Icon(
                            Icons.Rounded.Star,
                            contentDescription = null,
                            modifier = Modifier.size(72.dp),
                        )
                    } else {
                        Image(
                            bitmap = context.appIcon().asImageBitmap(),
                            contentDescription = stringResource(id = R.string.app_name),
                            modifier = Modifier
                                .size(72.dp)
                                .clip(CircleShape),
                        )
                    }
                    Text(
                        text = stringResource(id = R.string.app_name),
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier.padding(top = 12.dp),
                    )
                    Text(
                        text = stringResource(id = R.string.version_x, BuildConfig.VERSION_NAME),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ) {
                    externalLinks.forEach {
                        IconLink(
                            iconResId = it.iconResId,
                            label = stringResource(id = it.name),
                            url = it.url,
                        )
                    }
                }
            }
            item {
                Card(
                    label = stringResource(id = R.string.core_contributors),
                    modifier = Modifier.padding(top = 16.dp),
                ) {
                    coreContributors.mapIndexed { index, it ->
                        ContributorRow(
                            name = it.name,
                            photoUrl = it.photoUrl,
                            profileUrl = it.socialUrl,
                            divider = index != coreContributors.lastIndex,
                            description = it.descriptionRes?.let { stringResource(id = it) },
                        )
                    }
                }
            }
            item {
                Card(
                    label = stringResource(id = R.string.app_name) + " " + stringResource(id = R.string.core_contributors).lowercase(),
                    modifier = Modifier.padding(top = 16.dp),
                ) {
                    forkiconsContributors.mapIndexed { index, it ->
                        ContributorRow(
                            name = it.name,
                            photoUrl = it.photoUrl,
                            profileUrl = it.socialUrl,
                            divider = index != forkiconsContributors.lastIndex,
                            description = it.descriptionRes?.let { stringResource(id = it) },
                        )
                    }
                }
            }
            item {
                Card(modifier = Modifier.padding(top = 16.dp)) {
                    SimpleListRow(
                        onClick = onNavigateToContributors,
                        label = stringResource(id = R.string.see_all_contributors),
                        divider = false,
                    )
                }
            }
            item {
                Card(
                    label = stringResource(id = R.string.special_thanks),
                    modifier = Modifier.padding(top = 16.dp),
                ) {
                    specialThanks.mapIndexed { index, it ->
                        ContributorRow(
                            name = it.name,
                            photoUrl = it.photoUrl,
                            profileUrl = it.username?.let { "https://github.com/$it" },
                            description = it.descriptionRes?.let { stringResource(id = it) },
                            divider = index != specialThanks.lastIndex,
                            socialUrl = it.socialUrl,
                        )
                    }
                }
            }
            item {
                Card(modifier = Modifier.padding(top = 16.dp)) {
                    SimpleListRow(
                        onClick = onNavigateToAcknowledgements,
                        label = stringResource(id = R.string.acknowledgements),
                        divider = false,
                    )
                }
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = stringResource(R.string.lawnicons) + " " + stringResource(
                            id = R.string.version_x,
                            Constants.LAWNICONS_VERSION,
                        ).lowercase(),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
        }
    }
}

private val externalLinks = listOf(
    ExternalLink(
        iconResId = R.drawable.github_foreground,
        name = R.string.github,
        url = Constants.GITHUB,
    ),
    ExternalLink(
        iconResId = R.drawable.icon_request_app,
        name = R.string.request_form,
        url = Constants.ICON_REQUEST_FORM,
    ),
)

private val coreContributors = listOf(
    Contributor(
        name = "Suphon T.",
        username = "paphonb",
        photoUrl = "https://avatars.githubusercontent.com/u/8080853",
        socialUrl = "https://x.com/paphonb",
        descriptionRes = R.string.contribution_core,
    ),
    Contributor(
        name = "SuperDragonXD",
        username = "SuperDragonXD",
        photoUrl = "https://avatars.githubusercontent.com/u/70206496",
        socialUrl = "https://github.com/SuperDragonXD",
        descriptionRes = R.string.contribution_core,
    ),
    Contributor(
        name = "Patryk Radziszewski",
        username = "Chefski",
        photoUrl = "https://avatars.githubusercontent.com/u/100310118",
        socialUrl = "https://github.com/Chefski",
        descriptionRes = R.string.contribution_icons,
    ),
    Contributor(
        name = "Gleb",
        username = "x9136",
        photoUrl = "https://avatars.githubusercontent.com/u/60105060",
        socialUrl = "https://github.com/x9136",
        descriptionRes = R.string.contribution_icons,
    ),
    Contributor(
        name = "Grabster",
        username = "Grabstertv",
        photoUrl = "https://avatars.githubusercontent.com/u/49114212",
        socialUrl = "https://x.com/grabstertv",
        descriptionRes = R.string.contribution_icons,
    ),
    Contributor(
        name = "Zongle Wang",
        username = "Goooler",
        photoUrl = "https://avatars.githubusercontent.com/u/10363352",
        socialUrl = "https://androiddev.social/@Goooler",
        descriptionRes = R.string.contribution_infra,
    ),
)

private val forkiconsContributors = listOf(
    Contributor(
        name = "Kaustubh Ladiya",
        username = "k4ustu3h",
        photoUrl = "https://avatars.githubusercontent.com/u/49553711",
        socialUrl = "https://k4ustu3h.live/",
        descriptionRes = R.string.contribution_core,
    ),
)

private val specialThanks = listOf(
    Contributor(
        name = "Radek Bledowski",
        photoUrl = "https://avatars.githubusercontent.com/u/22264125",
        socialUrl = "https://x.com/rkbdi",
        descriptionRes = R.string.special_thanks_restoration,
    ),
)

@PreviewLawnicons
@Composable
private fun AboutPreview() {
    LawniconsTheme {
        About(
            {},
            {},
            {},
            false,
        )
    }
}

@PreviewLawnicons
@Composable
private fun AboutPreviewExpanded() {
    LawniconsTheme {
        About(
            {},
            {},
            {},
            true,
        )
    }
}
