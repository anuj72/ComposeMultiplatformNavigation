import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import navigation.Nav
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.surface) {
            Nav()
        }

    }
}

expect fun getPlatformName(): String