package co.edu.unab.me.joseelias.tarea


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScreen()
        }
    }
}

@Composable
fun MyScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween, // 👈
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Encabezado",
            fontSize = 20.sp,
            modifier = Modifier
                .background(Color(0xFF90CAF9))
                .padding(12.dp)
        )


        Row(
            modifier = Modifier
                .background(Color(0xFFA5D6A7))
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Item 1",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color(0xFFFFF59D))
                    .padding(8.dp)
            )
            Text(
                text = "Item 2",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color(0xFFFFCC80))
                    .padding(8.dp)
            )
            Text(
                text = "Item 3",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color(0xFFCE93D8))
                    .padding(8.dp)
            )
        }


        Text(
            text = "Pie de página",
            fontSize = 18.sp,
            modifier = Modifier
                .background(Color(0xFFEF9A9A))
                .padding(12.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyScreen() {
    MyScreen()
}