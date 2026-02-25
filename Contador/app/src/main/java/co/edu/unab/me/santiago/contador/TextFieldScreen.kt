package co.edu.unab.me.santiago.contador

import android.widget.Switch
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.room.util.copy
import androidx.test.espresso.base.Default




@Composable
fun TextFieldScreen() {
    val context= LocalContext.current
    var inputCantidadACalcular by remember {mutableStateOf("")}
    var inputPorcentajeACalcular by remember {mutableStateOf("")}
    var cantidad=inputCantidadACalcular.toDoubleOrNull() ?:0.0
    var porcentaje=inputPorcentajeACalcular.toDoubleOrNull()?:0.0
    var redondeoResultado by remember { mutableStateOf(false) }
    var result=(cantidad*porcentaje)/100
    if (redondeoResultado) {
        result = kotlin.math.ceil(result)
    }


    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)
            .padding(16.dp)) {

            Text(
                text = "Calculos de impuestos",
                color = Color.Red,
                fontSize = 25.sp,
                modifier = Modifier.padding(top = 50.dp, bottom = 16.dp)
            )
            Text(
                text = "Cantidad:$cantidad",
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Porcentaje:$inputPorcentajeACalcular",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            TextField(
                label = { Text("Cantidad a calcular") },
                value = inputCantidadACalcular,
                onValueChange = { text-> inputCantidadACalcular=text.filter { it.isDigit() }
                }
                ,
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType= KeyboardType.Decimal
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            TextField(
                label = { Text("Porcentaje") },
                value = inputPorcentajeACalcular,
                onValueChange = {text-> inputPorcentajeACalcular=text.filter { it.isDigit()}},
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType= KeyboardType.Decimal
                )
            )
            Spacer(modifier = Modifier.height(16.dp))

            Row(verticalAlignment = Alignment.CenterVertically){
                Text("Redondear Resultado",
                    modifier=Modifier.weight(1f))
                Switch(checked = redondeoResultado,
                    onCheckedChange = { redondeoResultado = it })
            }

            Text(text="Resultado:$result", fontSize = 25.sp)
        }
    }
}