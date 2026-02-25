package co.edu.unab.me.santiago.contador

import android.icu.text.NumberingSystem
import android.util.Log
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun Taller(){

    var contador by remember { mutableStateOf(1) }

    Scaffold { innerPadding ->

        Column(modifier = Modifier.padding(paddingValues = innerPadding).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {




             Text(text = "Dado", fontSize = 46.sp)
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(id = getDiceImage(Numberi = contador )),
                contentDescription = "caras del dado",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(height = 20.dp))

            Button(onClick = {

                val diceNumber = Random.nextInt(1,7)

                Log.d(  "mi app",  "Estoy haciendo click")
                contador ++
            } ) {

                Text(text = "Lanzar el dado")
            }
        }
    }
}

fun getDiceImage(Numberi : Int): Int{

    return when (Numberi){

        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
}
