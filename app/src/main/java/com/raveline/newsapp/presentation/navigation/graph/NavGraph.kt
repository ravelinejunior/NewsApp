package com.raveline.newsapp.presentation.navigation.graph

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import androidx.paging.compose.collectAsLazyPagingItems
import com.raveline.newsapp.presentation.navigation.Route
import com.raveline.newsapp.presentation.screen.home.HomeScreen
import com.raveline.newsapp.presentation.screen.home.HomeViewModel
import com.raveline.newsapp.presentation.screen.onboarding.OnBoardingScreen
import com.raveline.newsapp.presentation.screen.onboarding.components.OnBoardingViewModel
import com.raveline.newsapp.presentation.screen.search.SearchScreen
import com.raveline.newsapp.presentation.screen.search.components.SearchViewModel

/**
 * `NavGraph` is a composable function that represents the navigation graph of the application.
 * This function is responsible for managing the navigation between different screens in the application.
 *
 * @param startDestination A `String` that represents the start destination of the navigation graph.
 *
 * @function NavHost This function creates a navigation host that hosts the navigation graph.
 * @param navController An instance of `NavController` which is used to navigate between different composables.
 * @param startDestination A `String` that represents the start destination of the `NavHost`.
 *
 * @function navigation This function creates a navigation graph within the `NavHost`.
 * @param route A `String` that represents the route of the navigation graph.
 * @param startDestination A `String` that represents the start destination of the navigation graph.
 *
 * @function composable This function creates a composable destination within the navigation graph.
 * @param route A `String` that represents the route of the composable destination.
 */
@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {

        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreenRoute.route
        ) {
            composable(
                route = Route.OnBoardingScreenRoute.route
            ) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(event = viewModel::onEvent)
            }
        }


        navigation(
            route = Route.NewsNavigationRoute.route,
            startDestination = Route.NewsNavigatorScreenRoute.route
        ) {
            composable(route = Route.NewsNavigatorScreenRoute.route) {
                val homeViewModel: HomeViewModel = hiltViewModel()
                val articles = homeViewModel.getNews.collectAsLazyPagingItems()
                HomeScreen(articles = articles, navigate = { route ->
                    navController.navigate(route)
                })
            }
        }

        navigation(
            route = Route.DetailsScreenRoute.route,
            startDestination = Route.SearchScreenRoute.route
        ) {
            composable(route = Route.SearchScreenRoute.route) {
                val searchViewModel: SearchViewModel = hiltViewModel()

                SearchScreen(
                    state = searchViewModel.state.value,
                    events = searchViewModel::onEvent,
                    navigate = {

                    }
                )
            }
        }
    }
}