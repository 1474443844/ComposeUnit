package com.toly1994.composeunit.widgets.Row

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.toly1994.composeunit.R
import com.toly1994.composeunit.widgets.Image.ImageContentScaleItem

// "widgetId": 4,
// "name": "行的竖直对齐模式",
// "subtitle":
//     【verticalAlignment】 : 竖直对齐  【Arrangement.Vertical】
@SuppressLint("SuspiciousIndentation")
@Composable
fun RowNode2() {
    val data = mapOf(
        Alignment.Top to "Top",
        Alignment.CenterVertically to "Center",
        Alignment.Bottom to "Bottom",
    )
    val keys = data.keys.toList()
    val values = data.values.toList()
    Column {
        for (index in data.keys.indices step 2) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                RowVAItem(keys[index],values[index])
                if(index<data.size-1)
                RowVAItem(keys[index+1],values[index+1])
            }
        }
    }
}
@Composable
fun RowVAItem(arrangement: Alignment.Vertical, info: String) {
    val colors = arrayOf(Color.Red, Color.Blue, Color.Green,)
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            Modifier.width(150.dp).height(80.dp).background(Color(0xffEFEFEF)),
            verticalAlignment = arrangement
        ) {
            colors.forEach {
                Spacer(modifier = Modifier.width(30.dp).height(30.dp).background(it))
            }
        }
        Text(text = info, color = Color.Gray, fontSize = 12.sp)
        Spacer(modifier = Modifier.height(5.dp))
    }
}

@Preview
@Composable
fun RowNode2Preview() {
    RowNode2()
}