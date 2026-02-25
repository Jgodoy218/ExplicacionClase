package co.edu.unab.juanvargas.jetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.unab.juanvargas.jetcompose.ui.theme.JetcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            pantallaprincipal()
        }
    }
}

@Preview(
    name = "mi primer preview",
    showBackground = true,
    showSystemUi = true
)
@Composable
fun pantallaprincipal() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        Text(
            text = "Santiago Niño",
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, bottom = 30.dp),
            textAlign = TextAlign.Center
        )


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp),
            contentAlignment = Alignment.Center
        ) {
            val image = painterResource(id = R.drawable.closin)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .width(250.dp)
                    .clip(CircleShape)
            )
        }


        Text(
            text = stringResource(R.string.soy_ingeniero_de_sistemas),
            fontSize = 24.sp,
            lineHeight = 40.sp,
            modifier = Modifier.padding(bottom = 20.dp)
        )
        Text(
            text = "lenguajes de programación",
            color = Color.Red,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 20.dp)
        )


        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "java", fontSize = 30.sp)
            Text(text = "kotlin", fontSize = 30.sp)
            Text(text = "python", fontSize = 30.sp)
            Text(text = "C#", fontSize = 30.sp)
        }
    }
}


