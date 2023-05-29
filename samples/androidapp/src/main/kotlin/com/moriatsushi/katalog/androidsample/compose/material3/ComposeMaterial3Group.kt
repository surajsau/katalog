package com.moriatsushi.katalog.androidsample.compose.material3

import com.moriatsushi.katalog.group

val composeMaterial3Group = group("Compose Material 3") {
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
