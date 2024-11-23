import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.simplecontactlistinjetpackcompose.Contact

@Composable
fun CardContact(contact: Contact) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(100.dp)
            .clip(RoundedCornerShape(16.dp))
            .border(BorderStroke(2.dp, Color.Gray),shape = RoundedCornerShape(16.dp))
            .padding(10.dp)
    ) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .background(Color.White)
                .align(Alignment.CenterVertically)
                .border(
                    BorderStroke(2.dp, Color.Gray),shape = CircleShape
                )

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

        }
        Column(
            modifier = Modifier
                .padding(start = 10.dp)
                .fillMaxHeight()
                .padding(3.dp)
                .weight(1f)
        ) {
            Text(
                text = contact.name,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = contact.phone,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = contact.address,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }

        Icon(
            Icons.Filled.Call, contentDescription = "call",
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp)
                .width(30.dp)

        )

    }
}
