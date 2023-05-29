package com.moriatsushi.katalog.androidsample.compose.material3

import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SampleElevatedButton() {
    ElevatedButton(onClick = { /* doSomething() */ }) {
        Text("Elevated Button")
    }
}
