package co.edu.unab.me.joseelias.josecruzejercicio1




import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialScreen()
        }
    }
}

@Composable
fun TutorialScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.ejercicio1),
            contentDescription = "Imagen encabezado",
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            contentScale = ContentScale.Crop
        )


        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )



        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                    "It simplifies and accelerates UI development on Android with less code, " +
                    "powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )



        Text(
            text = "In this tutorial, you’ll build a simple UI component with declarative functions. " +
                    "You’ll call Compose functions to say what elements you want and the Compose compiler " +
                    "will do the rest. Compose is built to make UI development easier and faster.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTutorialScreen() {
    TutorialScreen()
}
