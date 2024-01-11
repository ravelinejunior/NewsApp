package com.raveline.newsapp.presentation.navigation

import com.raveline.newsapp.utils.RouteConstants.appStartNavigationRoute
import com.raveline.newsapp.utils.RouteConstants.bookmarkScreenRoute
import com.raveline.newsapp.utils.RouteConstants.detailsScreenRoute
import com.raveline.newsapp.utils.RouteConstants.homeScreenRoute
import com.raveline.newsapp.utils.RouteConstants.newsNavigationRoute
import com.raveline.newsapp.utils.RouteConstants.newsNavigatorScreenRoute
import com.raveline.newsapp.utils.RouteConstants.onBoardingScreenRoute
import com.raveline.newsapp.utils.RouteConstants.searchScreenRoute

sealed class Route(
    val route: String
) {
    object OnBoardingScreenRoute : Route(route = onBoardingScreenRoute)
    object HomeScreenRoute : Route(route = homeScreenRoute)
    object SearchScreenRoute : Route(route = searchScreenRoute)
    object BookmarkScreenRoute : Route(route = bookmarkScreenRoute)
    object DetailsScreenRoute : Route(route = detailsScreenRoute)
    object AppStartNavigation : Route(route = appStartNavigationRoute)
    object NewsNavigationRoute : Route(route = newsNavigationRoute)
    object NewsNavigatorScreenRoute : Route(route = newsNavigatorScreenRoute)
}