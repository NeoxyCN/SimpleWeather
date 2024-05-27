package io.github.simpleweather

import android.content.Context
import android.icu.text.SimpleDateFormat
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.simpleweather.ui.theme.SimpleWeatherTheme
import io.github.simpleweather.weather.FetchCity
import java.util.Locale

class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
//        getAsync("https://www.baidu.com") { responseBody ->
//            Log.d("Net", responseBody)
//        }



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleWeatherTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.primary,
                            ),
                            title = {
                                Text("Simple Weather")
                            }
                        )
                    },
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                            ),
                            modifier = Modifier
                                .size(width = 400.dp, height = 100.dp)
                        ) {
                            Text(
                                text = GetSlogan(LocalContext.current),
                                modifier = Modifier
                                    .padding(16.dp),
                                textAlign = TextAlign.Center
                            )
                        }
                        Text(text = "Hello!")

//                        Greeting(
//                            name = "Android",
//                            modifier = Modifier.padding(innerPadding)
//                        )

                    }
                }
            }
        }
    }
}

fun GetSlogan(context: Context): String {
    FetchCity(context,"Beijing")

    val time = System.currentTimeMillis()
    val dateFormat = SimpleDateFormat("HH", Locale.getDefault())
    val currentHour = dateFormat.format(time).toInt()
    Log.d("NowTime", "hour" + currentHour)
    var slogan: String
    when (currentHour) {
        in 0..6 ->
            slogan = context.getString(R.string.slogan_midnight)
        in 6..12 ->
            slogan = context.getString(R.string.slogan_morning)

        in 12..18 ->
            slogan = context.getString(R.string.slogan_afternoon)

        in 18..24 ->
            slogan = context.getString(R.string.slogan_evening)

        else ->
            slogan = context.getString(R.string.slogan_default)
    }
    return slogan
}