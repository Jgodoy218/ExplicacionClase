package co.edu.unab.me.davidguerrero.elementosadicionales

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Preview(showBackground = true)
@Composable
fun MainContent() {
    Column (
        modifier = Modifier.padding(all = 12.dp)
    ) {

        Row {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                "Icon Account",
                modifier = Modifier.size(size = 56.dp)


            )
            Column {
                Text("tarjeta de perfil")
                Text("descripcion del perfil")

            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = null
                )
            }
        }
        OutlinedTextField(
            value = "valor inicial",
            onValueChange = {},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search

                )
            }
        )

    }
}