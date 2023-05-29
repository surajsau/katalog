package com.moriatsushi.katalog.androidsample.compose.material3

import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SampleFilledTonalButton() {
    FilledTonalButton(onClick = { /* doSomething() */ }) {
        Text("Filled Tonal Button")
    }
}
