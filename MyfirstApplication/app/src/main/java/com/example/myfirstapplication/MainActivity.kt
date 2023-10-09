package com.example.myfirstapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstapplication.ui.theme.MyFirstApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("world")


                }
            }
                Surface(modifier = Modifier
                    .padding(start = 100.dp, top = 250.dp,)
                    .size(200.dp)
                    .clip(
                        CircleShape
                    )
                    , color = MaterialTheme.colorScheme.secondaryContainer) {

                    Text(
                        text = "Hello Ukraine ! I am studying in Kharkiv",
                        modifier = Modifier
                            .offset(x = 0.dp, y = 0.dp)
                            .requiredSize(100.dp)
                    )

                }
            Surface(modifier = Modifier
                .padding(start = 10.dp, top = 200.dp, bottom = 100.dp, end = 300.dp,)
                .clip(RectangleShape)
                , color = MaterialTheme.colorScheme.tertiaryContainer ) {

                Text(
                    text = "Hello Morocco ! I am studying at 6 AM",
                    modifier = Modifier
                        .offset(x = 0.dp, y = 0.dp)
                        .requiredSize(70.dp)
                )


            }
            Surface(modifier = Modifier
                .padding(start = 250.dp, top = 500.dp,)
                .size(150.dp)
                .clip(shape = CutCornerShape(20.dp))
                , color = MaterialTheme.colorScheme.error) {

                Text(
                    text = "Hello my friends glad to see you again ",
                    modifier = Modifier
                        .offset(x = 0.dp, y = 0.dp)
                        .requiredSize(100.dp)
                )

            }




    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstApplicationTheme {
        Greeting("Android")
    }
}