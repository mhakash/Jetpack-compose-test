package com.example.mycomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Article()
        }
    }
}

@Preview
@Composable
fun Article(){
    Column(
        modifier = Modifier
            .padding(16.dp)
            .verticalScroll(
                rememberScrollState(0),
                true,
            )
    ){
        Image(
            painter = painterResource(id = R.drawable.cat_image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(6.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "A day wandering through the sandhills " +
                "in Shark Fin Cove, and a few of the " +
                "sights I saw",
            style = typography.h6,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis)

        Text("Davenport, California",
            style = typography.body2)
        Text("December 2018",
            style = typography.body2)
    }
}

