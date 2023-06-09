package com.example.udemymovieapp.navagation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.udemymovieapp.screens.home.HomeScreen
import com.example.udemymovieapp.screens.details.DetailsScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreen.HomeScreen.name ) {

        composable(MovieScreen.HomeScreen.name) {
            HomeScreen(navController = navController)

        }
        //www.google.com/detail-screen/id =34
        composable(MovieScreen.DetailsScreen.name+"/{movie}",
        arguments = listOf(navArgument(name = "movie"){type = NavType.StringType}))
        { backStackEntry ->


           DetailsScreen(navController = navController,
               backStackEntry.arguments?.getString("movie"))
        }


    }
}