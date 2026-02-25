package co.edu.unab.juanvargas.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.unab.juanvargas.myapplication.ui.theme.MyApplicationTheme

@Preview( showBackground = true, showSystemUi = true)
@Composable
fun ElevatedCardExample() {
    Column(
        modifier = Modifier
            .fillMaxSize().padding(all = 16.dp)
    ) {
        Card(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp
            ),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth().height(500.dp)
        ) {
            Column(modifier = Modifier.padding(10.dp)){
                val painter= painterResource(R.drawable.img1)
                Image(painter=painter, contentDescription = "", modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth())

                Text(
                    text = "Computador",
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    modifier = Modifier.padding(top=10.dp, bottom = 5.dp)

                )

                Text(
                    text = "$6.200.000",
                    fontWeight = FontWeight.Bold,
                    color = Color.Red,
                    fontSize = 30.sp,
                    modifier = Modifier.padding(bottom = 10.dp)

                )
                HorizontalDivider()
                Text(
                    text = "esto es un equipo de alto rendimiento cuenta con un procesador rápido, tarjeta gráfica potente, 16 GB de RAM y SSD, ideal para juegos a altas resoluciones y tasas de refresco.",



                    modifier = Modifier.padding(top = 10.dp)

                )





            }
        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp,), horizontalArrangement = Arrangement.SpaceBetween){


            Button(
                onClick = { },

                ){
                Icon(Icons.Default.Edit, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Editar")
            }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ){
                Icon(Icons.Default.Delete, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Eliminar")


            }

        }


    }

}