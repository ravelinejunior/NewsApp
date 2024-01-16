package com.raveline.newsapp.presentation.screen.details

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import coil.request.CachePolicy
import coil.request.ImageRequest
import com.raveline.newsapp.R
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.model.SourceModel
import com.raveline.newsapp.presentation.screen.details.components.DetailsEvent
import com.raveline.newsapp.presentation.screen.details.components.DetailsTopBar
import com.raveline.newsapp.ui.theme.Dimens
import com.raveline.newsapp.ui.theme.NewsAppTheme
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale


/**
 * This is a `DetailsScreen` function in Kotlin, which is a part of the Jetpack Compose UI toolkit.
 * It's annotated with `@Composable`, indicating that it's a composable function that describes part of the UI.
 *
 * @param article This is the article object that the screen will display.
 * @param event This is a function type parameter that takes a `DetailsEvent` and returns `Unit`.
 * It's used to handle events in the `DetailsScreen`.
 * @param navigateUp This is a function type parameter that takes no arguments and returns `Unit`.
 * It's used to navigate up in the navigation stack.
 */
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun DetailsScreen(
    article: ArticleModel,
    event: (DetailsEvent) -> Unit,
    navigateUp: () -> Unit
) {
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
        ) {
            DetailsTopBar(
                isSelected = article.isStored,
                onBrowsingClick = {
                    Intent(Intent.ACTION_VIEW).also {
                        it.data = Uri.parse(article.url)
                        if (it.resolveActivity(context.packageManager) != null) {
                            context.startActivity(it)
                        }
                    }
                },
                onShareClick = {
                    Intent(Intent.ACTION_SEND).also {
                        it.putExtra(Intent.EXTRA_TEXT, article.url)
                        it.type = "text/plain"
                        if (it.resolveActivity(context.packageManager) != null) {
                            context.startActivity(it)
                        }
                    }
                },
                onBookmarkClick = {
                    event(DetailsEvent.UpsertArticle(article = article))
                },
                onBackClick = navigateUp,
            )

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth(),
                contentPadding = PaddingValues(Dimens.MediumPadding1),
            ) {
                item {
                    AsyncImage(
                        model = ImageRequest
                            .Builder(context = context)
                            .data(article.urlToImage)
                            .crossfade(true)
                            .crossfade(500)
                            .allowHardware(true)
                            .error(R.drawable.ic_network_error)
                            .memoryCachePolicy(CachePolicy.ENABLED)
                            .placeholder(R.drawable.baseline_newspaper_24)
                            .build(),
                        contentDescription = "Image Details Screen LazyColumn",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(Dimens.ArticleImageHeight)
                            .clip(MaterialTheme.shapes.medium),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(Dimens.SmallPadding))

                    Text(
                        text = article.title,
                        style = MaterialTheme.typography.displaySmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground,
                        maxLines = 3
                    )

                    Text(
                        text = article.description,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onBackground,
                        maxLines = 30
                    )

                    Spacer(modifier = Modifier.height(Dimens.MediumPadding1))

                    val author =
                        if (article.author.isNullOrEmpty()) "By: Unknown Author" else "By ${article.author}"

                    val odt = OffsetDateTime.parse(article.publishedAt);
                    val dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:ss", Locale.getDefault())
                    val formattedDate = "At:${dtf.format(odt)}"

                    Text(
                        text = author,
                        fontFamily = FontFamily.Monospace,
                        fontSize = MaterialTheme.typography.bodySmall.fontSize,
                        color = colorResource(id = R.color.body),
                        maxLines = 2
                    )

                    Spacer(modifier = Modifier.height(Dimens.SmallPadding))

                    Text(
                        text = formattedDate,
                        fontFamily = FontFamily.Monospace,
                        fontSize = MaterialTheme.typography.bodySmall.fontSize,
                        color = colorResource(id = R.color.body),
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1
                    )

                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true, showSystemUi = true)
@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DetailsScreenPreview() {
    NewsAppTheme {
        DetailsScreen(
            article = ArticleModel(
                id = 0,
                source = SourceModel("", ""),
                "Nanan",
                "Jnsldnlasn",
                "sdasdasdas dasdasdasdasda dssssdasdadasdasdasdasd adas",
                "", "", "22-03-2022", ""
            ),
            event = {},
        ) {

        }
    }
}










