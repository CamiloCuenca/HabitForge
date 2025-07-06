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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.CamiloCuencaDev.habitforge.ui.common.ScreenTitle
import com.CamiloCuencaDev.habitforge.ui.common.TopAppBar

@Composable
fun Home(navController: NavHostController) {



    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

    ){
        TopAppBar("Home")

        Box(
            modifier = Modifier.fillMaxWidth().padding(start = 30.dp , top = 15.dp),
            contentAlignment = Alignment.CenterStart


        ){
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(text = "Busca tu hiabito", fontSize = 20.sp)

                SearchTextField(
                    query = "",
                    onQueryChange = { /* TODO: Handle query change */ },
                    placeholder = "Buscar..."
                )
            }
        }




    }
}

