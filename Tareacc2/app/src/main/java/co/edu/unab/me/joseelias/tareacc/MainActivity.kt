package co.edu.unab.me.joseelias.tareacc

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
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Surface


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                Screen2()
            }
        }
    }
}
@Composable
fun Screen2() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(all = 15.dp)
            .background(Color.Gray)
            .fillMaxSize()
    ) {

        Row(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Inicio",
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(8.dp)
            )

            Text(
                text = "Perfil",
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(8.dp)
            )

            Text(
                text = "Configuración",
                fontSize = 20.sp,
                modifier = Modifier
                    .background(Color.Green)
                    .padding(8.dp)
            )

        }
        Spacer(modifier = Modifier.height(15.dp))


        Column(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Título Principal",
                fontSize = 24.sp,
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Descripción corta del contenido",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "Otro elemento de texto",
                fontSize = 18.sp,
                modifier = Modifier
                    .background(Color.Green)
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.height(15.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScreen2() {
    Screen2()
}