package com.CamiloCuencaDev.habitforge.ui.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.CamiloCuencaDev.habitforge.ui.theme.GreenPrimary


@Composable
fun CustomHyperlink(text: String, onClick: () -> Unit) {
    Box {
        Text(
            text = text,
            color = GreenPrimary,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(4.dp)
        )
    }
}