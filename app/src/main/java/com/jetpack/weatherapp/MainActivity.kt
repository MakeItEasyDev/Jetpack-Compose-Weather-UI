package com.jetpack.weatherapp

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.weatherapp.ui.theme.Orange
import com.jetpack.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Full view screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContent {
            WeatherAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Weather()
                }
            }
        }
    }
}

@Composable
fun Weather() {
    val pathEffect = PathEffect.dashPathEffect(floatArrayOf(20f, 20f), 0f)

    Image(
        painter = painterResource(id = R.drawable.weather),
        contentDescription = "background",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_notes_24),
                contentDescription = "Menu",
                modifier = Modifier.size(25.dp)
            )

            Text(
                text = "Weatherman",
                color = Color.White,
                fontSize = 18.sp,
                style = TextStyle(
                    fontFamily = FontFamily.Serif
                )
            )

            Image(
                painter = painterResource(id = R.drawable.ic_baseline_add_location_24),
                contentDescription = "Location",
                modifier = Modifier.size(25.dp)
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Hyderabad",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontFamily = FontFamily.Serif
            )
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Thursday, October 28, 2021",
            color = Color.White,
            fontSize = 15.sp,
            fontWeight = FontWeight.Normal,
            style = TextStyle(
                fontFamily = FontFamily.Serif
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "14°c", //symbol(°) -> just alt+0176
            color = Color.White,
            fontSize = 100.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontFamily = FontFamily.Serif
            )
        )

        Canvas(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .height(1.dp)
        ) {
            drawLine(
                color = Color.White,
                start = Offset(0f, 0f),
                end = Offset(size.width, 0f),
                pathEffect = pathEffect,
                strokeWidth = 8f
            )
        }

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Cloudy",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontFamily = FontFamily.Serif
            )
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "14°c / 3°c",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                fontFamily = FontFamily.Serif
            )
        )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = stringResource(id = R.string.weather),
            color = Color.White,
            fontSize = 15.sp,
            style = TextStyle(
                fontFamily = FontFamily.Serif,
                textAlign = TextAlign.Center,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )
        )

        Spacer(modifier = Modifier.height(70.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(60.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_cloud_24),
                    contentDescription = "Today",
                    modifier = Modifier.size(40.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "14°c / 3°c",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif
                    )
                )

                Text(
                    text = "Today",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif
                    )
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_cloud_sync_24),
                    contentDescription = "Today",
                    modifier = Modifier.size(40.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "14°c",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif
                    )
                )

                Text(
                    text = "Friday",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif
                    )
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_cloud_circle_24),
                    contentDescription = "Saturday",
                    modifier = Modifier.size(40.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "3°c",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif
                    )
                )

                Text(
                    text = "Saturday",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif
                    )
                )
            }
        }
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                .width(80.dp)
                .height(20.dp)
                .background(Orange),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_keyboard_arrow_up_24),
                contentDescription = "Up Arrow",
                modifier = Modifier.size(20.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}




















