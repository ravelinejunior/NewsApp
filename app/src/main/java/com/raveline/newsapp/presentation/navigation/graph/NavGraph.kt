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
import com.raveline.newsapp.presentation.screen.onboarding.OnBoardingViewModel
import com.raveline.newsapp.presentation.screen.search.SearchScreen
import com.raveline.newsapp.presentation.screen.search.components.SearchViewModel

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