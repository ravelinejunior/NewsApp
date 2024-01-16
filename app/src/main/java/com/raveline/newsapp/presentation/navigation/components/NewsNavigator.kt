package com.raveline.newsapp.presentation.navigation.components

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.paging.compose.collectAsLazyPagingItems
import com.raveline.newsapp.domain.model.ArticleModel
import com.raveline.newsapp.presentation.navigation.Route
import com.raveline.newsapp.presentation.screen.bookmark.BookmarkScreen
import com.raveline.newsapp.presentation.screen.bookmark.components.BookmarkViewModel
import com.raveline.newsapp.presentation.screen.details.DetailsScreen
import com.raveline.newsapp.presentation.screen.details.components.DetailsEvent
import com.raveline.newsapp.presentation.screen.details.components.DetailsViewModel
import com.raveline.newsapp.presentation.screen.home.HomeScreen
import com.raveline.newsapp.presentation.screen.home.HomeViewModel
import com.raveline.newsapp.presentation.screen.search.SearchScreen
import com.raveline.newsapp.presentation.screen.search.components.SearchViewModel
import com.raveline.newsapp.utils.Constants.NavBarItemsList

internal const val articleModelKey = "article"


/**
 * `NewsNavigator` is a composable function that manages the navigation of the news application.
 * It's annotated with `@Composable`, indicating that it's a composable function that describes part of the UI.
 *
 * @property bottomNavigationItems A list of items to be displayed in the bottom navigation bar.
 * @property navController A `NavController` that manages app navigation.
 * @property backStackState The current state of the navigation back stack.
 * @property selectedItem The index of the currently selected item in the bottom navigation bar.
 * @property isBottomBarVisible A boolean value that determines whether the bottom navigation bar should be visible.
 *
 * @method NewsNavigator This function sets up the navigation for the application.
 * @method Scaffold This function provides a framework that materializes the Material Design specification.
 * @method NavHost This function sets up a navigation graph within the application.
 */
@RequiresApi(Build.VERSION_CODES.O)
@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun NewsNavigator() {
    val bottomNavigationItems = remember {
        NavBarItemsList
    }

    val navController = rememberNavController()
    val backStackState = navController.currentBackStackEntryAsState().value
    var selectedItem by rememberSaveable {
        mutableIntStateOf(0)
    }

    selectedItem = remember(backStackState) {
        when (backStackState?.destination?.route) {
            Route.HomeScreenRoute.route -> 0
            Route.SearchScreenRoute.route -> 1
            Route.BookmarkScreenRoute.route -> 2

            else -> 0
        }
    }

    val isBottomBarVisible = remember(backStackState) {
        backStackState?.destination?.route == Route.HomeScreenRoute.route ||
                backStackState?.destination?.route == Route.SearchScreenRoute.route ||
                backStackState?.destination?.route == Route.BookmarkScreenRoute.route
    }



    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {

            if (isBottomBarVisible) {
                NewsBottomNavigation(
                    items = bottomNavigationItems,
                    selectedItem = selectedItem,
                    onSelectedItem = { index ->
                        when (index) {
                            0 -> {
                                navigateToTab(
                                    navController = navController,
                                    route = Route.HomeScreenRoute.route
                                )
                            }

                            1 -> {
                                navigateToTab(
                                    navController = navController,
                                    route = Route.SearchScreenRoute.route
                                )
                            }

                            2 -> {
                                navigateToTab(
                                    navController = navController,
                                    route = Route.BookmarkScreenRoute.route
                                )
                            }
                        }
                    }
                )

            }
        }
    ) { padding ->
        val bottomPadding = padding.calculateBottomPadding()
        NavHost(
            navController = navController,
            startDestination = Route.HomeScreenRoute.route,
            modifier = Modifier.padding(bottom = bottomPadding)
        ) {
            composable(
                route = Route.HomeScreenRoute.route
            ) {
                val viewModel: HomeViewModel = hiltViewModel()
                val articles = viewModel.getNews.collectAsLazyPagingItems()
                HomeScreen(articles = articles,
                    navigateToDetails = { article ->
                        navigateToDetails(
                            navController = navController,
                            articleModel = article
                        )
                    }
                )
            }

            composable(route = Route.SearchScreenRoute.route) {
                val viewModel: SearchViewModel = hiltViewModel()
                val state = viewModel.state.value
                SearchScreen(
                    state = state,
                    events = viewModel::onEvent,
                    navigateToDetails = { article ->
                        navigateToDetails(
                            navController = navController,
                            articleModel = article
                        )
                    }
                )
            }

            composable(route = Route.DetailsScreenRoute.route) {
                val context = LocalContext.current
                val viewModel: DetailsViewModel = hiltViewModel()

                if (viewModel.sideEffect != null) {
                    Toast.makeText(context, viewModel.sideEffect, Toast.LENGTH_SHORT).show()
                    viewModel.onEvent(DetailsEvent.RemoveSideEffect)
                }

                navController.previousBackStackEntry?.savedStateHandle?.get<ArticleModel>(
                    articleModelKey
                )?.let { selectedArticle ->
                    DetailsScreen(
                        article = selectedArticle,
                        event = viewModel::onEvent,
                        navigateUp = { navController.navigateUp() },
                    )
                }
            }

            composable(route = Route.BookmarkScreenRoute.route) {
                val viewModel: BookmarkViewModel = hiltViewModel()

                BookmarkScreen(
                    state = viewModel.state.value,
                    navigateToDetails = { articleModel ->
                        navigateToDetails(
                            navController = navController,
                            articleModel = articleModel
                        )
                    }
                )
            }
        }
    }
}

private fun navigateToTab(navController: NavController, route: String) {
    navController.navigate(route) {
        navController.graph.startDestinationRoute?.let { homeScreen ->
            popUpTo(homeScreen) {
                saveState = true
            }
            restoreState = true
            launchSingleTop = true
        }
    }
}

private fun navigateToDetails(navController: NavController, articleModel: ArticleModel) {
    navController.currentBackStackEntry?.savedStateHandle?.set(articleModelKey, articleModel)
    navController.navigate(
        route = Route.DetailsScreenRoute.route
    )
}













