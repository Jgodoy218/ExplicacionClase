package co.edu.unab.me.jeisonsalcedo.elias

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import co.edu.unab.me.jeisonsalcedo.elias.ui.theme.ELIASTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Myscreen(){
    Column (content = ){
        Text(text = "Jose elias cruz ", fontSize = 50.sp)
        Text(text = "soy ingeniero de sistemas", fontSize = 35.sp)
        Image(
            painter = painterResource()
            contentDescription = "imagen de usuario"
        )
        Row (content = ){
            Text(text = "java", fontSize = 35.sp)
            Text(text = "Phyton", fontSize = 35.sp)
            Text(text = "c#", fontSize = 35.sp)
            Text(text = "php", fontSize = 35.sp)
        })
    })
}
