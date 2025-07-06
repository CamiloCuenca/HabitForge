package com.CamiloCuencaDev.habitforge.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.CamiloCuencaDev.habitforge.ui.theme.GreenPrimary

@Composable
fun ScreenTitle(
    title: String,

){
    Box(
        modifier = Modifier.background(GreenPrimary)
            .fillMaxWidth()
            .padding(30.dp),
            contentAlignment = Alignment.BottomCenter
    ){
        Text(text=title,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            textAlign = TextAlign.Center)
    }
}