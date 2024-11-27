package com.example.bussisnesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussisnesscard.ui.theme.BussisnessCardTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Phone
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.Share
import androidx.compose.material3.Icon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BussisnessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier) {
    Card(
        name = stringResource(R.string.name),
        title = stringResource(R.string.title),
        phone = stringResource(R.string.phone),
        email = stringResource(R.string.email),
        website = stringResource(R.string.website),
        logo = painterResource(R.drawable.profile),
        modifier = Modifier
    )
}

@Composable
fun Card(
    logo: Painter,
    name: String,
    title: String,
    phone: String,
    email: String,
    website: String,
    modifier: Modifier
)
    {
        Box (modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(R.drawable.bg),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .alpha(0.2f)
            )
            Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally){
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = logo,
                        contentDescription = "Logo de $name",
                        modifier = Modifier
                            .padding(16.dp)
                            .width(120.dp)
                            .height(120.dp)
                    )
                    Text(
                        text = name,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Thin,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(4.dp)
                    )
                    Text(
                        text = title,
                        fontSize = 20.sp,
                        color = Color(0xFF38D880),
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(4.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(24.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Row(
                        modifier = Modifier
                            .padding(4.dp)
                    )
                    {
                        Icon(
                            Icons.TwoTone.Phone,
                            contentDescription = "phone",
                            modifier = Modifier
                                .padding(8.dp)
                        )
                        Text(
                            text = phone,
                            modifier = Modifier
                                .padding(8.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(4.dp)
                    )
                    {
                        Icon(
                            Icons.TwoTone.Email,
                            contentDescription = "email",
                            modifier = Modifier
                                .padding(8.dp)
                        )
                        Text(
                            text = email,
                            modifier = Modifier
                                .padding(8.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(4.dp)
                    )
                    {
                        Icon(
                            Icons.TwoTone.Share,
                            contentDescription = "Site Web",
                            modifier = Modifier
                                .padding(8.dp)
                        )
                        Text(
                            text = website,
                            modifier = Modifier
                                .padding(8.dp)
                        )
                    }

                }
            }
        }
    }

