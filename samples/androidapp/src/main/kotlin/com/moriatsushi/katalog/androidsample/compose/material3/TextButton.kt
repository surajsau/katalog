package com.moriatsushi.katalog.androidsample.compose.material3

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun SampleTextButton() {
    TextButton(onClick = { /* doSomething() */ }) {
        Text("Text Button")
    }
}
