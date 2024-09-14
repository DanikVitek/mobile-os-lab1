package me.danikvitek.lab1

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import me.danikvitek.lab1.ui.theme.Lab1Theme

@Composable
fun Activity1(onNavigateToActivity2: (text: String) -> Unit) {
    Log.d(MainActivity::class.simpleName, "setContent of Activity1")
    Lab1Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Screen(
                onNavigateToActivity2 = onNavigateToActivity2,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
private fun Screen(
    onNavigateToActivity2: (text: String) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Button(
            onClick = { onNavigateToActivity2("Вітковський") },
        ) {
            Text(
                text = stringResource(R.string.btn1_text)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ScreenPreview() {
    Lab1Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Screen(
                onNavigateToActivity2 = {},
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}