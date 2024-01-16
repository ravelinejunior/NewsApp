package com.raveline.newsapp.presentation.common

import android.content.res.Configuration
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.CachePolicy
import coil.request.ImageRequest
import com.raveline.newsapp.R
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.domain.model.SourceModel
import com.raveline.newsapp.ui.theme.Dimens.ArticleCardSize
import com.raveline.newsapp.ui.theme.Dimens.ExtraSmallPadding
import com.raveline.newsapp.ui.theme.Dimens.ExtraSmallPadding2
import com.raveline.newsapp.ui.theme.NewsAppTheme
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ArticleCard(
    modifier: Modifier = Modifier,
    article: ArticleModel,
    onClick: () -> Unit
) {
    val context = LocalContext.current

    Row(
        modifier = modifier.clickable {
            onClick()
        }
    ) {
        AsyncImage(
            modifier = modifier
                .size(ArticleCardSize)
                .clip(RoundedCornerShape(16.dp)),
            model = ImageRequest
                .Builder(context = context)
                .data(article.urlToImage)
                .crossfade(true)
                .allowHardware(true)
                .error(R.drawable.ic_network_error)
                .memoryCachePolicy(CachePolicy.ENABLED)
                .placeholder(R.drawable.baseline_newspaper_24)
                .build(),
            contentDescription = "Image Article Description",
            contentScale = ContentScale.Crop
        )

        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .padding(horizontal = ExtraSmallPadding)
                .height(ArticleCardSize)
        ) {
            Text(
                text = article.title, style = MaterialTheme.typography.bodyMedium,
                color = colorResource(
                    id = R.color.text_title
                ),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.width(ExtraSmallPadding2))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_time),
                    contentDescription = "Icon Article Description",
                    tint = colorResource(id = R.color.body)
                )

                Spacer(modifier = Modifier.width(ExtraSmallPadding2))

                val odt = OffsetDateTime.parse(article.publishedAt)
                val dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:ss", Locale.getDefault())
                val formattedDate = "At:${dtf.format(odt)}"

                Text(
                    text = formattedDate,
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold),
                    color = colorResource(
                        id = R.color.body
                    )
                )
            }
        }

    }
}

@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ArticleCardPreview() {
    NewsAppTheme {
        ArticleCard(
            article = ArticleModel(
                author = "",
                content = "",
                description = "",
                publishedAt = "2 Hours",
                source = SourceModel(id = "", "BBC"),
                title = "Test to break",
                urlToImage = "https://thechive.com/wp-content/uploads/2024/01/4cd53628-dd44-42c2-a6d6-8322b0c7d0b4.jpg?attachment_cache_bust=4602418&quality=85&strip=info&w=600",
                url = "https://thechive.com/wp-content/uploads/2024/01/4cd53628-dd44-42c2-a6d6-8322b0c7d0b4.jpg?attachment_cache_bust=4602418&quality=85&strip=info&w=600",
            )
        ) {

        }
    }
}