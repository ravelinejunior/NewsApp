package com.raveline.newsapp.presentation.screen.details.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.raveline.newsapp.R
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.ui.theme.NewsAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsTopBar(
    articleModel: ArticleModel?,
    onBrowsingClick: () -> Unit,
    onShareClick: () -> Unit,
    onBookmarkClick: () -> Unit,
    onBackClick: () -> Unit,
) {

    val isBookmarkSelected: MutableState<Boolean> = remember { mutableStateOf(articleModel!!.isStored) }

    TopAppBar(
        title = {
            Text(
                text = articleModel?.title.toString(),
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        },
        modifier = Modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.Transparent,
            actionIconContentColor = colorResource(id = R.color.body),
            navigationIconContentColor = colorResource(id = R.color.body)
        ),
        navigationIcon = {
            IconButton(onClick = onBackClick) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_back_arrow),
                    contentDescription = "Back Details TopBar"
                )
            }
        },
        actions = {

            IconButton(onClick = {
                isBookmarkSelected.value = !isBookmarkSelected.value
                onBookmarkClick()
            }) {
                if (isBookmarkSelected.value) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_bookmark_added_24),
                        contentDescription = "Bookmark Details TopBar",
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bookmark),
                        contentDescription = "Bookmark Details TopBar",
                    )
                }
            }
            IconButton(onClick = onShareClick) {
                Icon(
                    imageVector = Icons.Rounded.Share,
                    contentDescription = "Share Details TopBar"
                )
            }
            IconButton(onClick = onBrowsingClick) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_network),
                    contentDescription = "Browsing Details TopBar"
                )
            }
        }
    )

}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DetailsTopBarPreview() {
    NewsAppTheme {
        Box(modifier = Modifier.background(MaterialTheme.colorScheme.background)) {
            DetailsTopBar(
                articleModel = null,
                onBrowsingClick = { /*TODO*/ },
                onShareClick = { /*TODO*/ },
                onBookmarkClick = { /*TODO*/ },
                onBackClick = {},
            )
        }
    }
}