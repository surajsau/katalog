package com.moriatsushi.katalog.androidsample.compose.material3

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SampleOutlinedButton() {
    OutlinedButton(onClick = { /* doSomething() */ }) {
        Text("Outlined Button")
    }
}
