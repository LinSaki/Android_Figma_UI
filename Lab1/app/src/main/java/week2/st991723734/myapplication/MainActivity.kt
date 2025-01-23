package week2.st991723734.myapplication

import android.content.res.Configuration
import android.graphics.Paint.Align
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import week2.st991723734.myapplication.ui.theme.Lab1Theme
//PROG38448 - Android Application Development - Lab 1 - Kaitlin Saqui - 991723734
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Lab(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Lab(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .background(Color(0xffe7e2e8))
        .fillMaxHeight()
        .padding(top = 60.dp)
        ) {
            Image(painter = painterResource(R.drawable.bagbackgroundedit),
                contentDescription= "Brown Leather Bag",
                modifier = Modifier
                    .height(505.dp)
                    .width(415.dp)
                    .padding(top = 50.dp)
        )
        Row(modifier = Modifier
            .height(30.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(painter = painterResource(R.drawable.left_chevron),
                     contentDescription= "Left Arrow",
                     modifier = Modifier
                         .height(20.dp)
                         .padding(start = 20.dp)
                 )
            Text(
                text = "Detail Product", fontSize = 20.sp, modifier = Modifier
                    .padding(top = 5.dp),
                fontWeight = FontWeight.SemiBold
            )
            Image(painter = painterResource(R.drawable.shopping),
                contentDescription= "Shopping Bag",
                modifier = Modifier
                    .height(25.dp)
                    .padding(end = 20.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))

        Box(modifier = Modifier
            .clip(RoundedCornerShape(topStart = 50.dp))
            .clip(RoundedCornerShape(topEnd = 50.dp))
            .align(Alignment.BottomCenter)
            .fillMaxWidth()
            .height(500.dp)
            .background(Color.White) //Color last to round corners
            .padding(start = 30.dp, top = 30.dp, end = 30.dp)
        ) {
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            text = "Box Bag Linar 1883",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 20.dp)
                        )
                        Row {
                            Image(
                                painter = painterResource(R.drawable.star),
                                contentDescription = "Brown Leather Bag",
                                modifier = Modifier
                                    .height(25.dp)
                                    .padding(end = 10.dp)
                            )
                            Text(
                                text = "4.8", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                                modifier = Modifier
                            )
                            Text(
                                text = "(320 Review)", color = Color.LightGray, fontSize = 15.sp,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )
                        }
                    }
                    Column(modifier = Modifier) {
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .width(100.dp)
                                .height(30.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .background(Color(0xfff3f3f3)),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Surface(
                                    shape = CircleShape, color = Color.White,
                                    modifier = Modifier
                                        .width(25.dp)
                                        .height(25.dp)
                                        .padding(top = 3.dp, start = 1.dp)
                                ) {
                                    Text(
                                        text = "-",
                                        modifier = Modifier.padding(all = 2.dp),
                                        style = MaterialTheme.typography.bodyMedium,
                                        textAlign = TextAlign.Center
                                    )
                                }
                                Text(
                                    text = "3",
                                    modifier = Modifier.padding(all = 4.dp),
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold
                                )
                                Surface(
                                    shape = CircleShape, color = Color.White,
                                    modifier = Modifier
                                        .width(25.dp)
                                        .height(25.dp)
                                        .padding(top = 3.dp, end = 1.dp)
                                ) {
                                    Text(
                                        text = "+",
                                        modifier = Modifier.padding(all = 2.dp),
                                        style = MaterialTheme.typography.bodyMedium,
                                        textAlign = TextAlign.Center,
                                    )
                                }
                            }
                        }
                        Text(
                            text = "Available in Stock",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 13.sp,
                            modifier = Modifier.padding(top = 5.dp, start=20.dp)
                        )
                    }
                }
                Column() {
                    Text(text = "Color",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 30.dp, bottom = 10.dp))
                    Row {
                        Surface(
                            shape = CircleShape, color = Color(0xff9e6b67),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                        ) {}
                        Spacer(modifier = Modifier.width(21.dp))
                        Surface(
                            shape = CircleShape, color = Color.Black,
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                        ) {}
                        Spacer(modifier = Modifier.width(21.dp))
                        Surface(
                            shape = CircleShape, color = Color(0xff53aabb),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                        ) {}
                        Spacer(modifier = Modifier.width(21.dp))
                        Surface(
                            shape = CircleShape, color = Color(0xff5fcf69),
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                        ) {}
                    }
                    Text(text = "Description",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 30.dp, bottom = 10.dp))
                    Text(
                        buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.LightGray)) {
                                append("Lorem ipsum dolor sit amet. Ut velit adipisci qui quae maiores vel pariatur corporis est repudiandae numquam nam error placeat et galisum repellat est fugit magni? Sed voluptatem nihil est placeat similique ad nesciunt sit voluptate ")
                            }
                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color(0xff9390d8), fontSize = 15.sp)) {
                                append("Read More")
                            }
                        }
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween) {
                        Text(
                            buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color(0xFF6e6db3),
                                        fontSize = 40.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                ) {
                                    append("$")
                                }
                                withStyle(
                                    style = SpanStyle(
                                        fontWeight = FontWeight.SemiBold,
                                        fontSize = 40.sp
                                    )
                                ) {
                                    append("35.25")
                                }
                            }
                        )
                        val context = LocalContext.current
                        Button(modifier = Modifier
                            .width(200.dp),
                            onClick = {
                                Toast.makeText(
                                    context,
                                    "Added to cart!",
                                    Toast.LENGTH_LONG)
                                    .show()
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff504eaf))
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Image(painter = painterResource(R.drawable.shopping_bag_white),
                                    contentDescription= "Shopping Bag",
                                    modifier = Modifier
                                        .height(27.dp)
                                )
                                Text(
                                    text = "Add to Cart",
                                    modifier = Modifier.padding(all = 7.dp),
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    fontSize = 15.sp
                                )
                            }
                        }
                    }

                }
            }
        }
        
    }
}

@Preview(name = "Light Mode")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES,
         showBackground = true,
         name = "Dark Mode")
@Composable
fun LabPreview() {
    Lab1Theme {
        Lab()
    }
}