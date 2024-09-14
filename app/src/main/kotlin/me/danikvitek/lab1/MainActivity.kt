package me.danikvitek.lab1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
data object RouteActivity1

@Serializable
data class RouteActivity2(val text: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        Log.d(MainActivity::class.simpleName, "onCreate")

        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = RouteActivity1,
            ) {
                composable<RouteActivity1> {
                    it.destination.label = stringResource(R.string.title_activity_1)
                    Activity1(onNavigateToActivity2 = { text ->
                        navController.navigate(route = RouteActivity2(text = text))
                    })
                }
                composable<RouteActivity2> {
                    it.destination.label = stringResource(R.string.title_activity_2)
                    Activity2(it.toRoute<RouteActivity2>().text)
                }
            }
        }
    }
}
