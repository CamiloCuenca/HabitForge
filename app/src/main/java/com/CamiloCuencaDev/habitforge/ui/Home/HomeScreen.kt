package com.CamiloCuencaDev.habitforge.ui.Home

import SearchTextField
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.CamiloCuencaDev.habitforge.ui.common.ScreenTitle
import com.CamiloCuencaDev.habitforge.ui.common.TopAppBar

@Composable
fun Home(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        TopAppBar("Home")

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp),
            contentAlignment = Alignment.TopStart


        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "Busca tu hiabito", fontSize = 20.sp)

                var search by remember { mutableStateOf("") }
                SearchTextField(
                    query = search,
                    onQueryChange = { newText -> search = newText },
                    placeholder = "Buscar.."
                )
            }
        }

    }
}

