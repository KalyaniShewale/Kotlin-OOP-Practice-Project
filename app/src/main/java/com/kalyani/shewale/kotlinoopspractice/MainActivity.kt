package com.kalyani.shewale.kotlinoopspractice

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kalyani.shewale.kotlinoopspractice.model.runLibrarySystem
import com.kalyani.shewale.kotlinoopspractice.model.runSectionA
import com.kalyani.shewale.kotlinoopspractice.model.runSectionB
import com.kalyani.shewale.kotlinoopspractice.model.runSectionC
import com.kalyani.shewale.kotlinoopspractice.model.runSectionD
import com.kalyani.shewale.kotlinoopspractice.model.runSectionE
import com.kalyani.shewale.kotlinoopspractice.ui.theme.KotlinOopsPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        runSectionA()
        runSectionB()
        runSectionC()
        runSectionD()
        runSectionE()
        runLibrarySystem()






        setContent {
            KotlinOopsPracticeTheme {
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
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinOopsPracticeTheme {
        Greeting("Android")
    }
}