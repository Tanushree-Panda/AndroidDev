package com.example.androiddev


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddev.ui.theme.AndroidDevTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            var value by remember{ mutableFloatStateOf(0f) }
//            var checked by remember{ mutable(0) }
            AndroidDevTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
                Column (
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxSize(),
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center
                ){
                    Button(
                        onClick = { println("Button is Clicked") }, //1
//                        shape = RectangleShape,
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(Color.Red),
                        modifier = Modifier
                            .size(width = 300.dp, height = 50.dp)) {
                        Text(text = "Add to Cart", color = Color.White)
                        Icon(
                            Icons.Rounded.ShoppingCart,
                            contentDescription = stringResource(id = R.string.shopping_cart_content_desc)
                        )
                    }

                    FilledTonalButton(onClick = {println("Button is Clicked") //2
                    }) {
                        Text(text = "Add to Cart")
                    }
                    OutlinedButton(onClick = {println("Button is Clicked") //3
                    }) {
                        Text(text = "Add to Cart")

                    }
                    ElevatedButton(onClick = {println("Button is Clicked") //3
                    }) {
                        Text(text = "Add to Cart")

                    }
                    FloatingActionButton(onClick = { TODO() }, //4
                        containerColor = colorResource(id = R.color.flipkart),
                        contentColor = Color.Green
                    ) {
                        Icon(
                            Icons.Default.Add,
                            contentDescription = stringResource(id = R.string.shopping_cart_content_desc)
                        )
                    }
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color.Red, contentColor = Color.Green),
                        modifier = Modifier
                            .size(width = 100.dp, height = 200.dp)
                    ) {
                        Text(text = "Hello Card")
                        Text(text = "I am inside Card")
                    }
                    Slider(value = value, onValueChange = {value = it})
                    Text(text = value.toString())
//                   Switch(checked = checked, onCheckedChange = )
//                   (painter = painterResource(id = R.drawable.concert), contentDescription = "")


                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ComposeComponentTheme {
//        Greeting("Android")
//    }
//}








