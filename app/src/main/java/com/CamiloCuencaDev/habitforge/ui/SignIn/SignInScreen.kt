package com.CamiloCuencaDev.habitforge.ui.SignIn

import CustomButtonTertiary
import CustomTextField
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.CamiloCuencaDev.habitforge.R
import com.CamiloCuencaDev.habitforge.ui.common.ScreenTitle


@Composable
@Preview(showBackground = true)
fun SignInPreview() {
    SignIn(navController = null)
}

@Composable
fun SignIn(navController: NavHostController?){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        ScreenTitle(title = "Inicio de Sesión")

        ImageSignIn()

       CustomTextField(
            textState = "Ingrese su email",
            label = "Email",
            onTextChange = { newText -> /* lógica para manejar el cambio de texto */ }
       )

        CustomButtonTertiary(
            text = "Continuar",
            onClick = { navController?.navigate("Home") }
        )
    }

}

@Composable
fun ImageSignIn(){
    val imageModifier = Modifier
        .size(250.dp)
    Image(
        painter = painterResource(id = R.drawable.img_login),
        contentDescription = null,
        alignment = Alignment.Center,
        modifier = imageModifier,
    )
}


