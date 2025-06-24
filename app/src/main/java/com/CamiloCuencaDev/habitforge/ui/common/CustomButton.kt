import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.CamiloCuencaDev.habitforge.ui.theme.GreenPrimary

@Composable
fun CustomButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            containerColor = GreenPrimary
        )
    ) {
        Text(text)
    }
}
@Composable
fun CustomButtonSecondary(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    OutlinedButton( // Cambia Button por OutlinedButton
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            // Para OutlinedButton, el containerColor suele ser transparente por defecto.
            // Puedes ajustarlo si necesitas un fondo ligeramente diferente al de la superficie.
            // containerColor = Color.Transparent, // Puedes omitirlo o ajustarlo
            contentColor = GreenPrimary // Color del texto y el icono (si lo tuviera)
        ),
        border = BorderStroke(ButtonDefaults.outlinedButtonBorder.width, GreenPrimary) // Define el borde
        // Alternativamente, para un borde más simple:
        // border = BorderStroke(1.dp, GreenPrimary)
    ) {
        Text(text)
    }
}