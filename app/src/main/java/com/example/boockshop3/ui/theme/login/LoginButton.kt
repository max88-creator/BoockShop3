package com.example.boockshop3.ui.theme.login

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.boockshop3.ui.theme.ButtonColor

@Composable
fun LoginButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = { onClick },
        modifier = Modifier.fillMaxWidth(0.75f)
            .height(55.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonColor))
        { Text(text = text) }
}