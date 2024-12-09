package com.example.simplecontactlistinjetpackcompose

import CardContact
import com.example.simplecontactlistinjetpackcompose.ui.theme.model.Contact
import CustomDialog
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.simplecontactlistinjetpackcompose.ui.theme.SimpleContactListInJetpackComposeTheme
import com.example.simplecontactlistinjetpackcompose.ui.theme.model.contact


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
    val showDialog = remember {
        mutableStateOf(false)
    }
    val selectedContact = remember {
        mutableStateOf<Contact?>(null)
    }

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(contacts) { contact ->
            CardContact(contact){
                selectedContact.value = contact
                showDialog.value = true
            }
        }
    }


        if (showDialog.value && selectedContact.value != null) {
            CustomDialog(
                contact = selectedContact.value!!,
                onDismissRequest = { showDialog.value = false }
            )
        }
    }















