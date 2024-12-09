import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.simplecontactlistinjetpackcompose.ui.theme.model.Contact

@Composable
fun CustomDialog(contact: Contact, onDismissRequest: () -> Unit) {
    Box(modifier = Modifier) {
        Card {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(375.dp)
                    .padding(16.dp)
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
            ) {


                AsyncImage(
                    model = contact.imageUrl,
                    contentDescription = "Sample Image",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .padding(10.dp),
                    contentScale = ContentScale.Crop

                )

                Text(
                    text = contact.name,
                    modifier = Modifier.padding(16.dp)
                )
                Text(
                    text = contact.phone,
                    modifier = Modifier.padding(16.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    TextButton(
                        onClick = { onDismissRequest() },
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color.Red, shape = RoundedCornerShape(16.dp)),
                    ) {
                        Text("Dismiss")
                    }
                    TextButton(
                        onClick = { onConfirmation() },
                        modifier = Modifier
                            .padding(8.dp)
                            .background(Color.Green, shape = RoundedCornerShape(16.dp)),
                    ) {
                        Text("Confirm")
                    }
                }
            }
        }
    }
}

fun onConfirmation() {

}
