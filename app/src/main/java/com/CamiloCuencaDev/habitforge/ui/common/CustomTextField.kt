import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import com.CamiloCuencaDev.habitforge.ui.theme.BlueSecondary
import com.CamiloCuencaDev.habitforge.ui.theme.GreenDark
import com.CamiloCuencaDev.habitforge.ui.theme.GreenPrimary
import com.CamiloCuencaDev.habitforge.ui.theme.GreenPrimaryLight
import com.CamiloCuencaDev.habitforge.ui.theme.Grey80
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.ui.Modifier

@Composable
fun CustomTextField(
    textState: String,
    label: String,
    onTextChange: (String) -> Unit,
    placeholder: String,
) {
    TextField(
        value = textState,
        onValueChange = onTextChange,
        placeholder = { Text(placeholder) },
        label = { Text(label) },
        colors = androidx.compose.material3.TextFieldDefaults.colors(
            cursorColor = GreenPrimary,
            focusedIndicatorColor = GreenPrimary,
            unfocusedIndicatorColor = BlueSecondary,
            disabledIndicatorColor = GreenPrimaryLight,
            focusedLabelColor = GreenPrimary,
            unfocusedLabelColor = BlueSecondary,
            disabledLabelColor = GreenPrimaryLight,
            focusedContainerColor = Grey80,
            unfocusedContainerColor = Grey80,
            disabledContainerColor = GreenPrimaryLight,
            focusedTextColor = GreenDark,
            disabledTextColor = GreenPrimaryLight
        )
    )
}

@Composable
fun CustomPasswordField(
    password: String,
    label: String,
    onPasswordChange: (String) -> Unit,
    placeholder: String,
) {
    var passwordVisible = androidx.compose.runtime.remember { androidx.compose.runtime.mutableStateOf(false) }

    TextField(
        value = password,
        onValueChange = onPasswordChange,
        placeholder = { Text(placeholder) },
        label = { Text(label) },
        visualTransformation = if (passwordVisible.value) androidx.compose.ui.text.input.VisualTransformation.None
        else androidx.compose.ui.text.input.PasswordVisualTransformation(),
        trailingIcon = {
            val image = if (passwordVisible.value)
                androidx.compose.material.icons.Icons.Filled.Visibility
            else
                androidx.compose.material.icons.Icons.Filled.VisibilityOff

            androidx.compose.material3.IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                androidx.compose.material3.Icon(imageVector = image, contentDescription = null)
            }
        },
        colors = androidx.compose.material3.TextFieldDefaults.colors(
            cursorColor = GreenPrimary,
            focusedIndicatorColor = GreenPrimary,
            unfocusedIndicatorColor = BlueSecondary,
            disabledIndicatorColor = GreenPrimaryLight,
            focusedLabelColor = GreenPrimary,
            unfocusedLabelColor = BlueSecondary,
            disabledLabelColor = GreenPrimaryLight,
            focusedContainerColor = Grey80,
            unfocusedContainerColor = Grey80,
            disabledContainerColor = GreenPrimaryLight,
            focusedTextColor = GreenDark,
            disabledTextColor = GreenPrimaryLight
        )
    )
}

@Composable
fun SearchTextField(
    query: String,
    onQueryChange: (String) -> Unit,
    placeholder: String = "Buscar..."
) {
    TextField(
        value = query,
        onValueChange = onQueryChange,
        placeholder = {Text(placeholder)},
        trailingIcon = {
            androidx.compose.material3.IconButton(onClick = {}) {
                androidx.compose.material3.Icon(
                    imageVector = androidx.compose.material.icons.Icons.Filled.Search,
                    contentDescription = null
                )
            }
        }

    )
}