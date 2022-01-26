package com.marvel999.composeuniverse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.marvel999.composeuniverse.ui.theme.ComposeUniverseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUniverseTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val username = remember{ mutableStateOf("Hey")}
    Column {
        Text(text = "Hello $name!")
        Text(text = "Hello $name!")
        OutlinedTextField(value =username.value , onValueChange ={username.value = it} )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeUniverseTheme {
        Greeting("Android")
    }
}