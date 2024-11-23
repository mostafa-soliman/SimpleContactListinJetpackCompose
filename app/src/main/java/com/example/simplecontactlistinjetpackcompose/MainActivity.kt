package com.example.simplecontactlistinjetpackcompose

import CardContact
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.simplecontactlistinjetpackcompose.ui.theme.SimpleContactListInJetpackComposeTheme


data class Contact(val name: String, val phone: String, val address: String, val imageUrl: String)

val contact = listOf(
    Contact(
        "Ahmed",
        "0123456789",
        "23rd Street",
        "https://cdn3.iconfinder.com/data/icons/animals-and-nature-flat/60/Mushroom-food-grow-natural-512.png"
    ),
    Contact(
        "Mohamed",
        "9876543210",
        "45th Street",
        "https://cdn2.iconfinder.com/data/icons/kitchen-and-cooking-flat/60/Herbal-Mixing-Bowl-herbs-natural-512.png"
    ),
    Contact(
        "Sarah",
        "1234567890",
        "67th Street",
        "https://cdn3.iconfinder.com/data/icons/animals-and-nature-flat/60/Forest-woods-trees-tree-natural-512.png"
    ),
    Contact(
        "Laila",
        "1112223334",
        "89th Street",
        "https://cdn3.iconfinder.com/data/icons/skincare-soothe-series/256/Natural-512.png"
    ),
    Contact(
        "Khaled",
        "5556667778",
        "10th Street",
        "https://cdn1.iconfinder.com/data/icons/brazilian-carnival-15/510/30_Pineapple_Fruit_Food_Organic_Natural-512.png"
    ),
    Contact(
        "Maryam",
        "9998887776",
        "12th Street",
        "https://cdn2.iconfinder.com/data/icons/apiary-element-11/496/honeycomb-sweet-ingredient-organic-natural-512.png"
    ),
    Contact(
        "Youssef",
        "2223334445",
        "14th Street",
        "https://cdn2.iconfinder.com/data/icons/apiary-element-15/496/honey-jar-syrup-ingredient-natural-512.png"
    ),
    Contact(
        "Mona",
        "6667778889",
        "16th Street",
        "https://www.freepnglogos.com/uploads/512x512-logo-png/512x512-logo-github-icon-35.png"
    )
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {

            SimpleContactListInJetpackComposeTheme {
               ContactList(contact)

            }
        }
    }
}

@Composable
fun ContactList(contacts: List<Contact>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(contacts) { contact ->
            CardContact(contact)
        }
    }
}







