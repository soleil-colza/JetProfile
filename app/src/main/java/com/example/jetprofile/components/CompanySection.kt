package com.example.jetprofile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "関西学院大学",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "文学部文学言語学科",
            fontSize = 16.sp,
            color = Color.Gray
        )
        Text(
            text = "フランス文学フランス語学専修",
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(20.dp))

        Label(
            icon = Icons.Default.Email,
            text = "Email"
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "soleil.colza@icloud.com", fontSize = 16.sp)

        Spacer(modifier = Modifier.height(10.dp))

        Divider(
            thickness = 1.dp,
            modifier = Modifier
                .clip(RoundedCornerShape(1000.dp)),
        )
    }
}