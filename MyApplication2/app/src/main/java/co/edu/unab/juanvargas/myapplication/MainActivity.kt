package co.edu.unab.plantilla

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import co.edu.unab.juanvargas.myapplication.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                // Pasa innerPadding al ProductCard
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding) // Aseguramos que innerPadding no se trunque
                        .padding(16.dp) // Relleno general para toda la columna
                ) {
                    // Coloca la tarjeta de producto
                    ProductCard()

                    // Botones fuera del recuadro
                    Spacer(modifier = Modifier.height(16.dp)) // Espaciado entre la tarjeta y los botones
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Button(onClick = { /* Acción Editar */ }, colors = ButtonDefaults.buttonColors(Color.Blue)) {
                            Text("Editar", color = Color.White)
                        }
                        Button(onClick = { /* Acción Eliminar */ }, colors = ButtonDefaults.buttonColors(Color.Red)) {
                            Text("Eliminar", color = Color.White)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ProductCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .border(1.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.img1),
                contentDescription = "Producto",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Nombre del Producto",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Text(
                text = "$99.99",
                color = Color.Green,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            Text(
                text = "Descripción del producto con detalles importantes, características y beneficios.",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductCardPreview() {
    ProductCard() // Vista previa del ProductCard
}
