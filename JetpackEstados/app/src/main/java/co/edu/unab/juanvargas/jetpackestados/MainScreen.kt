package co.edu.unab.juanvargas.jetpackestados

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MainScreen() {


    var number by remember { mutableStateOf(0) };
    var numImagen:Int =R.drawable.dice_1
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lanzar Dado App") },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer)

            )
        }
    ) { innerpading ->
        Column(
            modifier = Modifier
                .padding(innerpading)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val painter1= painterResource(id=numImagen)

            Image(painter =painter1, contentDescription = "")
            Spacer(modifier = Modifier.height(10.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {
                number=(1..6).random()
                if(number==1){
                    numImagen=R.drawable.dice_1

                }
                else if(number==2){
                    numImagen=R.drawable.dice_2

                }
                else if(number==3){
                    numImagen=R.drawable.dice_3

                }
                else if(number==4){
                    numImagen=R.drawable.dice_4

                }
                else if(number==5){
                    numImagen=R.drawable.dice_5

                }
                else if(number==6){
                    numImagen=R.drawable.dice_6

                }
            }) {
                Icon(Icons.Default.Add, contentDescription = "")
                Spacer(modifier = Modifier.width(10.dp))
                Text("Lanzar Dado")
            }
        }

    }

}