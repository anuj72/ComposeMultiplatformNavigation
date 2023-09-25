package navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource


@OptIn(ExperimentalResourceApi::class)
@Composable
fun Screen1(onNext:(tex:String)->Unit) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }

    Box(modifier = Modifier.fillMaxSize().background(Color.Red.copy(0.3f)), contentAlignment = Alignment.Center) {

        Column {

            AnimatedVisibility(true) {
                Image(
                    painterResource("compose-multiplatform.xml",),
                    null,
                    modifier = Modifier.width(300.dp).height(100.dp)
                )
            }
            Spacer(Modifier.height(32.dp))
            TextField(
                value = email,
                onValueChange = { newText ->
                    email = newText
                },
                modifier = Modifier.width(300.dp)
            )
            Spacer(Modifier.height(32.dp))
            TextField(
                value = pass,
                onValueChange = { newText ->
                    pass = newText
                },
                modifier = Modifier.width(300.dp)
            )
         Spacer(Modifier.height(32.dp))
            Button(onClick = {
                if(email.text.isNotEmpty()){
                    onNext.invoke(email.text) }
            }, modifier = Modifier.width(300.dp).height(60.dp)){
                Text("Login")
            }
        }


    }


}