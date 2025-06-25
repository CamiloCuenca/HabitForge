import androidx.compose.material3.TextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf

@Composable
fun CustomTextField(
    textState: String,
    label: String,
    onTextChange: (String) -> Unit
) {
    TextField(
        value = textState,
        onValueChange = onTextChange,
        label = { Text(label ) }
    )
}