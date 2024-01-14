package com.raveline.newsapp.presentation.screen.details

import android.content.Intent
import android.content.res.Configuration
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
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
                    event(DetailsEvent.SaveArticle)
                },
                onBackClick = navigateUp
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
                            .crossfade(1000)
                            .allowHardware(true)
                            .error(R.drawable.placeholder)
                            .memoryCachePolicy(CachePolicy.ENABLED)
                            .placeholder(R.drawable.placeholder)
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
                        color = MaterialTheme.colorScheme.onBackground
                    )

                    Text(
                        text = article.description,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colorScheme.onBackground
                    )

                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(Dimens.MediumPadding1)
                    .weight(1f),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Text(
                    text = "By ${article.author}",
                    fontFamily = FontFamily.Monospace,
                    fontSize = MaterialTheme.typography.bodySmall.fontSize,
                    color = colorResource(id = R.color.body),
                    maxLines = 1
                )

                Spacer(modifier = Modifier.width(Dimens.SmallPadding))

                Text(
                    text = "At: ${article.publishedAt}",
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

@Preview(showBackground = true, showSystemUi = true)
@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DetailsScreenPreview() {
    NewsAppTheme {
        DetailsScreen(
            article = ArticleModel(
                source = SourceModel("", ""),
                "Nanan",
                "Jnsldnlasn",
                "sdasdasdas dasdasdasdasda dssssdasdadasdasdasdasd adas",
                "", "", "5 5ddd4asdasdd5 544s1da 54das", ""
            ),
            event = {},
        ) {

        }
    }
}










