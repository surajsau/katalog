package com.moriatsushi.katalog.androidsample.compose.material3

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SampleFilledButton() {
    Button(onClick = { /* doSomething() */ }) {
        Text("Filled Button")
    }
}
