package com.CamiloCuencaDev.habitforge.ui.SignIn

import CustomButtonTertiary
import CustomPasswordField
import CustomTextField
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.CamiloCuencaDev.habitforge.R
import com.CamiloCuencaDev.habitforge.ui.common.ScreenTitle
import com.CamiloCuencaDev.habitforge.ui.common.TopAppBar


@Composable
fun ForgotPassword(navController: NavHostController){
    TopAppBar("Recuperación de contraseña")


    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        ImageForgotPassword()

        var code by remember { mutableStateOf("") }
        CustomTextField(textState = "Código",
            placeholder = "Ingrese el código",
            label = "Codigo de Verificación",
            onTextChange = { nexText -> code = nexText})
        Spacer(modifier = Modifier.height(15.dp))

        var password by remember { mutableStateOf("") }
        CustomPasswordField(
            password = password,
            label = "password",
            onPasswordChange = { newText -> password = newText },
            placeholder = "Ingrese su nueva contraseña",
        )
        Spacer(modifier = Modifier.height(15.dp))


        var password2 by remember { mutableStateOf("") }

        CustomPasswordField(
            password = password,
            label = "password",
            onPasswordChange = { newText -> password2 = newText },
            placeholder = "Ingrese su nueva contraseña",
        )
        Spacer(modifier = Modifier.height(15.dp))

        CustomButtonTertiary(text="Confirmar",onClick = {navController.navigate("SignIn")})
    }
}

@Composable
fun ImageForgotPassword(){
    val imageModifier = Modifier
        .size(350.dp)
    Image(
        painter = painterResource(id = R.drawable.img_login),
        contentDescription = null,
        alignment = Alignment.Center,
        modifier = imageModifier,
    )
}