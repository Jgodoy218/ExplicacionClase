
package co.edu.unab.me.santiago.contador

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.core.provider.FontsContractCompat

@Composable

fun MainScreen() {
    //var contador = 0
    var contador by remember { mutableStateOf(5) }


    Scaffold { innerPadding ->

        Column(modifier = Modifier.padding(paddingValues = innerPadding).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {

            Text(text = "Contador", fontSize = 50.sp)
            Text( contador.toString(), fontSize = 60.sp)
            Button(onClick = {

                Log.d(  "mi app",  "Estoy haciendo click")
                contador ++
            } ) {

                Text(text = "Sumar +1")
            }
        }
    }

}
