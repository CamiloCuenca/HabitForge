package com.CamiloCuencaDev.habitforge.ui.SignIn

import CustomButtonTertiary
import CustomPasswordField
import CustomTextField
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.CamiloCuencaDev.habitforge.ui.common.CustomHyperlink
import com.CamiloCuencaDev.habitforge.ui.common.ScreenTitle


@Composable
fun SignIn(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        ScreenTitle(title = "Inicio de Sesión")
        Spacer(modifier = Modifier.height(20.dp))


        ImageSignIn()

        var email by remember { mutableStateOf("") }
        CustomTextField(
            textState =  email,
            placeholder = "Ingrese su email",
            label = "Email",
            onTextChange = { newText -> email = newText }
        )

        Spacer(modifier = Modifier.height(15.dp))

       var password by remember { mutableStateOf("") }
        CustomPasswordField(
            password = password,
            label = "password",
            onPasswordChange = { newText -> password = newText },
            placeholder = "Ingrese su contraseña",
       )

        Box(
            modifier = Modifier.fillMaxWidth().padding(end = 35.dp),
            contentAlignment = Alignment.CenterEnd
        ) {
            CustomHyperlink("Olvidé mi contraseña") { navController.navigate("ForgotPassword") }
        }

        CustomButtonTertiary(
            text = "Continuar",
            onClick = { navController.navigate("Home") }
        )
    }
}

@Composable
fun ImageSignIn(){
    val imageModifier = Modifier
        .size(350.dp)
    Image(
        painter = painterResource(id = R.drawable.img_login),
        contentDescription = null,
        alignment = Alignment.Center,
        modifier = imageModifier,
    )
}


