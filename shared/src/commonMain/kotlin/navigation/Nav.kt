package navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import moe.tlaster.precompose.koin.koinViewModel
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.path
import moe.tlaster.precompose.navigation.rememberNavigator
import moe.tlaster.precompose.navigation.transition.NavTransition


@Composable
fun Nav() {
    val navigator = rememberNavigator()

    NavHost(
        navigator = navigator,
        navTransition = NavTransition(),
        initialRoute = "/screen1",
    ) {
        scene(
            route = "/screen1",
            navTransition = NavTransition(),
        ) {
            Screen1 {
               navigator.navigate("/screen2/$it")
           }
        }

        scene(route = "/screen2/{txt}?") { backStackEntry ->
           /* val vm = koinViewModel(CountriesViewModel::class)
            val code: String? = backStackEntry.path<String>("id")
            CountriesScreen(
                code = code,
                viewModel = vm,
                onCountryClick = {
                    navigator.navigate("/country/$it")
                },
                onBackPress = {
                    navigator.goBack()
                }
            )*/
            val txt: String = backStackEntry.path<String>("txt")?:""
            Screen2(txt){
                navigator.goBack()
            }
        }

        scene(
            route = "/country/{code}?",
            navTransition = NavTransition(),
        ) { backStackEntry ->

            Box(modifier = Modifier.fillMaxSize().background(color = Color.Blue)){

            }
           /* val vm = koinViewModel(CountryViewModel::class)
            val code: String? = backStackEntry.path<String>("code")
            CountryScreen(
                code = code,
                viewModel = vm,
                onBackPress = {
                    navigator.goBack()
                }
            )*/
        }
    }
}