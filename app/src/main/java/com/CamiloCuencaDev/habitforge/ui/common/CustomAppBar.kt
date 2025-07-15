package com.CamiloCuencaDev.habitforge.ui.common

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.QueryStats
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.CamiloCuencaDev.habitforge.ui.theme.BlueSecondary
import com.CamiloCuencaDev.habitforge.ui.theme.GreenPrimary
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.QueryStats

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(title: String){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = GreenPrimary)

    )
}

@Composable
fun MyNavigationBar() {
    var selectedItem by remember { mutableStateOf(0) }

    NavigationBar(
        containerColor = GreenPrimary, // Fondo
        contentColor = Color.White           // Iconos y texto
    ) {
        NavigationBarItem(
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 },
            icon = { Icon(Icons.Default.Settings, contentDescription = "Ajustes" , modifier = Modifier.size(32.dp))  },
            label = { Text("Ajustes") }
        )

        NavigationBarItem(
            selected = selectedItem == 0,
            onClick = { selectedItem = 0 },
            icon = { Icon(Icons.Default.Home, contentDescription = "Inicio" , modifier = Modifier.size(32.dp)) },
            label = { Text("Inicio") }
        )

        NavigationBarItem(
            selected = selectedItem == 2,
            onClick = { selectedItem = 2 },
            icon = { Icon(Icons.Default.QueryStats, contentDescription = "Estadísticas" , modifier = Modifier.size(32.dp)) },
            label = { Text("Stats") }
        )
    }
}