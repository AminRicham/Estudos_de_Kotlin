package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnTogether("Esse é o titulo","Jetpack Compose is a modern toolkit for building" +
                            " native Android UI. Compose simplifies and accelerates" +
                            " UI development on Android with less code, powerful tools, and " +
                            "intuitive Kotlin APIs.","In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what " +
                            "elements you want and the Compose compiler does the rest." +
                            " Compose is built around Composable functions. These functions let you define your app\\'s" +
                            " UI programmatically because they let you describe how it should look and provide data dependencies," +
                            " rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent." +
                            " To create a Composable function, you add the @Composable annotation to the function name.")
                }
            }
        }
    }
}

@Composable
fun LearnTogether(titulo:String, paragrafo1: String, paragrafo2: String, modifier: Modifier = Modifier){
    Column{
        Image(
            painter = painterResource(id = R.drawable.jetpackcompose),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = titulo,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = paragrafo1,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = paragrafo2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}


@Preview(showBackground = true)
@Composable
fun PreviewLearnTogether() {
    LearnTogetherTheme {
        LearnTogether("Jetpack Compose tutorial","Jetpack Compose is a modern toolkit for building" +
                " native Android UI. Compose simplifies and accelerates" +
                " UI development on Android with less code, powerful tools, and " +
                "intuitive Kotlin APIs.", "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what " +
                "elements you want and the Compose compiler does the rest." +
                " Compose is built around Composable functions. These functions let you define your app\\'s" +
                " UI programmatically because they let you describe how it should look and provide data dependencies," +
                " rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent." +
                " To create a Composable function, you add the @Composable annotation to the function name.")

    }
}