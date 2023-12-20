package com.example.jetprofile

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    
                   Column(
                       horizontalAlignment = Alignment.CenterHorizontally,
                       modifier = Modifier.padding(20.dp)
                   ) {
                       Image(
                           painter = painterResource(id = R.drawable.image_profile),
                           contentDescription = "Profile image",
                           modifier = Modifier
                               .height(200.dp)
                               .width(200.dp)
                               .clip(CircleShape),
                           contentScale = ContentScale.Crop
                       )
                       Spacer(modifier = Modifier.height(20.dp))
                       Text(
                           text = "中平 陽菜",
                           color = Color.Gray,
                           fontWeight = FontWeight.ExtraBold,
                           fontSize = 26.sp
                       )

                       Spacer(modifier = Modifier.height(20.dp))

                       Text(
                           text = "Androidエンジニア",
                           color = Color.Gray,
                           fontSize = 16.sp,

                           )
                       Spacer(modifier = Modifier.height(20.dp))

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

                           Row(verticalAlignment = Alignment.CenterVertically) {
                               Icon(
                                   imageVector = Icons.Default.Email,
                                   contentDescription = "email"
                               )
                               Spacer(modifier = Modifier.width(10.dp))

                               Text(
                                   "Email",
                                   fontWeight = FontWeight.Bold,
                                   fontSize = 16.sp
                               )

                           }

                           Spacer(modifier = Modifier.height(10.dp))

                           Text(text = "soleil.colza@icloud.com", fontSize = 16.sp)

                           Spacer(modifier = Modifier.height(10.dp))

                           Divider(
                               thickness = 1.dp,
                               modifier = Modifier
                                   .clip(RoundedCornerShape(1000.dp)),
                           )
                       }
                       Spacer(modifier = Modifier.height(20.dp))

                       // 詳細表示ボタン
                       Button(
                           onClick = {},
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(40.dp),
                           colors = ButtonDefaults.buttonColors(
                               backgroundColor = Color(0xfff85f6a)
                           ),
                       ){
                           Text(text = "詳細を表示", color = Color.White)
                       }
                       Spacer(modifier = Modifier.height(20.dp))

                       //趣味と居住地
                       Column(
                           modifier = Modifier
                               .fillMaxWidth()
                               .clip(RoundedCornerShape(10.dp))
                               .background(Color.LightGray.copy(alpha = 0.3f))
                               .padding(horizontal = 10.dp, vertical = 20.dp)
                       ) {
                       }
                   }
                }
            }
        }
    }
}

@Composable
fun label(icon: ImageVector, text: String, color : Color = MaterialTheme.colors.onBackground){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = "null"
        )
        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )

    }
}