package com.example.udemymovieapp.navagation


enum class MovieScreen {
    HomeScreen,
    DetailsScreen;
    companion object {
        fun fromRoute(route: String?) : MovieScreen
        = when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw java.lang.IllegalArgumentException("Route $route is not recognize ")
        }
    }
}