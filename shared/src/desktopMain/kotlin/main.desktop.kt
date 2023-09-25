import androidx.compose.runtime.Composable
import moe.tlaster.precompose.PreComposeWindow

actual fun getPlatformName(): String = "iOS"

@Composable
fun MainView() = App()