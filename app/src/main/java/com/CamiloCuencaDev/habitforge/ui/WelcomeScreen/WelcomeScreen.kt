package com.CamiloCuencaDev.habitforge.ui.WelcomeScreen

import CustomButton
import androidx.compose.foundation.Image
import CustomButtonSecondary
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.CamiloCuencaDev.habitforge.R


@Composable
fun Welcome(navController: NavHostController, onButtonClick: () -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ImageWelcome()

        Spacer(modifier = Modifier.height(32.dp))

        WelcomeText()

        Spacer(modifier = Modifier.height(48.dp))

        // Fila para los botones
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center

        ) {
            CustomButton(
                text = "Iniciar Sesión",
                onClick = {navController.navigate("SignIn")},
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(16.dp))

            CustomButtonSecondary(
                text = "Registrarse",
                onClick = onButtonClick,
                modifier = Modifier.weight(1f)
            )
        }


    }
}


@Composable
fun WelcomeText() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Bienvenido a HabitForge",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Transforma tus hábitos",
            fontWeight = FontWeight.Light,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ImageWelcome(){
    val imageModifier = Modifier
        .size(350.dp)

    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = null,
        alignment = Alignment.Center,
        modifier = imageModifier,
    )
}