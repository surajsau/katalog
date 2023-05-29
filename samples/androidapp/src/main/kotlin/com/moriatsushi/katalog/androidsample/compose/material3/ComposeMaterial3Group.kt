package com.moriatsushi.katalog.androidsample.compose.material3

import com.moriatsushi.katalog.group

val composeMaterial3Group = group("Compose Material 3") {
    group("Button") {
        compose("ElevatedButton") {
            SampleElevatedButton()
        }
        compose("FilledButton") {
            SampleFilledButton()
        }
        compose("FilledTonalButton") {
            SampleFilledTonalButton()
        }
        compose("OutlinedButton") {
            SampleOutlinedButton()
        }
        compose("TextButton") {
            SampleTextButton()
        }
    }
    compose("Switch") {
        SampleSwitch()
    }
    group("TopAppBar") {
        compose("CenterAlignedTopAppBar") {
            SampleCenterAlignedTopAppBar()
        }
        compose("SmallTopAppBar") {
            SampleTopAppBar()
        }
        compose("MediumTopAppBar") {
            SampleMediumTopAppBar()
        }
        compose("LargeTopAppBar") {
            SampleLargeTopAppBar()
        }
    }
}
