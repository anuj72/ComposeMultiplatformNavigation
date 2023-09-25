package navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue


@Composable
fun Screen2(txt:String,onBack:()->Unit) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Box(modifier = Modifier.fillMaxSize().background(Color.Green.copy(0.3f)), contentAlignment = Alignment.Center) {

        Column {
            Text(txt)

            Button(onClick = {
                onBack.invoke()
            }){
                Text("GO Back")
            }
        }


    }


}