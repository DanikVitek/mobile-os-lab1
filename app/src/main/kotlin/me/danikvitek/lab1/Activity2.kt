package me.danikvitek.lab1

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import me.danikvitek.lab1.ui.theme.Lab1Theme

@Composable
fun Activity2(text: String) {
    Lab1Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Screen(
                text = text,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
private fun Screen(text: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Параметр: $text",
            fontSize = 24.sp,
            softWrap = true,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ScreenPreview() {
    Lab1Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Screen(
                text = "Preview Text",
                modifier = Modifier.padding(innerPadding),
            )
        }
    }
}