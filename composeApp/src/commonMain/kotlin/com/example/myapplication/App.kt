package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .safeContentPadding(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Halo, Memory Simanjuntak")
            Text("NIM: 123140095")
            Text("Platform: ${getPlatform().name}")
        }
    }
}
