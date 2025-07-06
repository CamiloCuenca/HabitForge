package com.CamiloCuencaDev.habitforge.ui.Home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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

      Text(text = "Busca tu hiabito")


    }
}

