package com.example.countingapp

import android.os.Bundle
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.unit.dp
import com.example.countingapp.ui.theme.CountingappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CountingappTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(4.dp)
            ) {
        val counting = remember { mutableIntStateOf(0) }
        Row (
            modifier = Modifier.align(Alignment.CenterHorizontally))
        {

        }
        Row {
            Text(
                text = "Counting: ${counting.intValue} ",
                color = Color.Black,
                modifier = modifier
            )
        }
        Row {
            Button(onClick = { counting.intValue++ }) {
                Text(
                    text = "+",
                    modifier = modifier
                )
            }
            Button(onClick = { counting.intValue-- }) {
                Text(
                    text = "-",
                    modifier = modifier
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CountingappTheme {
        Greeting("Android")
    }
}