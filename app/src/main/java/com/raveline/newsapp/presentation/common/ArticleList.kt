package com.raveline.newsapp.presentation.common

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.ui.theme.Dimens.ExtraSmallPadding2
import com.raveline.newsapp.ui.theme.Dimens.MediumPadding1

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun ArticleList(
    modifier: Modifier = Modifier,
    articles: LazyPagingItems<ArticleModel>,
    onClick: (ArticleModel) -> Unit
) {
    val handlingPagingResult = handlingPagingResult(articles = articles)

    if (handlingPagingResult) {
        LazyColumn(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(MediumPadding1),
            contentPadding = PaddingValues(all = ExtraSmallPadding2)
        ) {
            items(count = articles.itemCount) {
                articles[it]?.let { article ->
                    ArticleCard(article = article, onClick = { onClick(article) })
                }
            }
        }
    } else {
        EmptyScreen(
            error = null,
            articles = articles
        )
    }
}

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun ArticleList(
    modifier: Modifier = Modifier,
    articles: List<ArticleModel>,
    onClick: (ArticleModel) -> Unit
) {

    if (articles.isNotEmpty()) {
        LazyColumn(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(MediumPadding1),
            contentPadding = PaddingValues(all = ExtraSmallPadding2)
        ) {
            items(count = articles.size) {
                articles[it].let { article ->
                    ArticleCard(article = article, onClick = { onClick(article) })
                }
            }
        }
    } else {
        EmptyScreen(
            error = null,
            articles = null
        )
    }
}

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun handlingPagingResult(
    articles: LazyPagingItems<ArticleModel>
): Boolean {
    val loadState = articles.loadState

    val error = when {
        loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
        loadState.append is LoadState.Error -> loadState.append as LoadState.Error
        loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
        else -> null
    }

    return when {
        loadState.refresh is LoadState.Loading -> {
            ShimmerEffect()
            false
        }

        error != null -> {
            EmptyScreen(
                error = error,
                articles = articles
            )
            false
        }

        else -> true
    }
}

@Composable
private fun ShimmerEffect() {
    Column(verticalArrangement = Arrangement.spacedBy(MediumPadding1)) {
        repeat(10) {
            ArticleCardShimmerEffect(
                modifier = Modifier.padding(MediumPadding1)
            )
        }
    }
}