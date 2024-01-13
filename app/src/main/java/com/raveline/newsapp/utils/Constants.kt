package com.raveline.newsapp.utils

object Constants {
    const val USER_SETTINGS_STORE_KEY = "USER_SETTINGS_STORE_KEY"
    const val APP_ENTRY_STORE_KEY = "NEWS_APP"
    const val API_NEWS_KEY = "067ec196fca944f69bd5bccfd29d3820"
    const val NEWS_API_BASE_URL = "https://newsapi.org/v2/"
    val SourcesApiQueryList =  listOf("bbc-news", "abc-news", "google-news", "the-verge", "business-insider")
}

object RouteConstants {
    const val onBoardingScreenRoute = "onBoardingScreenRoute"
    const val homeScreenRoute = "homeScreenRoute"
    const val searchScreenRoute = "searchScreenRoute"
    const val bookmarkScreenRoute = "bookmarkScreenRoute"
    const val detailsScreenRoute = "detailsScreenRoute"
    const val appStartNavigationRoute = "appStartNavigationRoute"
    const val newsNavigatorScreenRoute = "newsNavigatorScreenRoute"
    const val newsNavigationRoute = "newsNavigationRoute"
}