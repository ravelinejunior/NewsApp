package com.raveline.newsapp.presentation.screen.bookmark

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.presentation.common.ArticleList
import com.raveline.newsapp.presentation.navigation.Route
import com.raveline.newsapp.presentation.screen.bookmark.components.BookmarkState
import com.raveline.newsapp.ui.theme.Dimens
import com.raveline.newsapp.ui.theme.Dimens.MediumPadding1

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun BookmarkScreen(
    state: BookmarkState,
    navigateToDetails: (ArticleModel) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
    ) {
        Column(
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(MediumPadding1)
                .statusBarsPadding()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = Dimens.MediumPadding2),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Bookmark",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onBackground,
                    maxLines = 1,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Monospace,
                    overflow = TextOverflow.Ellipsis
                )
            }

            Spacer(modifier = Modifier.height(MediumPadding1))

            ArticleList(
                articles = state.articleList,
                onClick = { article ->
                    navigateToDetails(article)
                }
            )
        }
    }
}
















