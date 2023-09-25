import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeWindowHolder

actual fun getPlatformName(): String = "web"

@Composable
fun MainView() =  App()