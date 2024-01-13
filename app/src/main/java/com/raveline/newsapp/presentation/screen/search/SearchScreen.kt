package com.raveline.newsapp.presentation.screen.search

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.compose.collectAsLazyPagingItems
import com.raveline.newsapp.presentation.common.ArticleList
import com.raveline.newsapp.presentation.common.SearchBar
import com.raveline.newsapp.presentation.navigation.Route
import com.raveline.newsapp.presentation.screen.search.components.SearchEvents
import com.raveline.newsapp.presentation.screen.search.components.SearchState
import com.raveline.newsapp.ui.theme.Dimens.MediumPadding1
import com.raveline.newsapp.ui.theme.Dimens.SmallPadding

/**
 * `SearchScreen` is a composable function that represents the search screen in the application.
 * This function is responsible for displaying the search bar and the list of articles based on the search query.
 *
 * @param state An instance of `SearchState` which represents the current state of the search screen.
 * @param events A function that takes an instance of `SearchEvents` and performs actions based on the event.
 * @param navigate A function that takes a route as a `String` and navigates to the corresponding screen.
 *
 * @function SearchBar This is a composable function that displays the search bar. It takes in the current query, a boolean to indicate if the search bar is read-only, a function to handle value changes, and a function to handle search action.
 * @function ArticleList This is a composable function that displays the list of articles. It takes in the list of articles and a function to handle click events on the articles.
 */
@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun SearchScreen(
    state: SearchState,
    events: (SearchEvents) -> Unit,
    navigate: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(SmallPadding)
                .statusBarsPadding()

        ) {
            SearchBar(
                text = state.query,
                readOnly = false,
                onValueChanged = {
                    events(SearchEvents.UpdateSearchQuery(it))
                },
                onSearch = {
                    events(SearchEvents.SearchNews)
                },
            )

            Spacer(modifier = Modifier.height(MediumPadding1))
            state.articles?.let { data ->
                val articles = data.collectAsLazyPagingItems()
                ArticleList(
                    articles = articles,
                    onClick = {
                        navigate(Route.DetailsScreenRoute.route)
                    },
                )

            }
        }
    }
}












