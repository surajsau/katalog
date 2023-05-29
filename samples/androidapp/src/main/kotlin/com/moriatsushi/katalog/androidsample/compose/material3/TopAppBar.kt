package com.moriatsushi.katalog.androidsample.compose.material3

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Attachment
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Pin
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleCenterAlignedTopAppBar() {
    CenterAlignedTopAppBar(
        title = { Text("CenterAlignedTopAppBar") },
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Menu, contentDescription = null)
            }
        },
        actions = {
            // RowScope here, so these icons will be placed horizontally
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Person, contentDescription = "Localized description")
            }
        },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleTopAppBar() {
    TopAppBar(
        title = { Text("TopAppBar") },
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = null)
            }
        },
        actions = {
            // RowScope here, so these icons will be placed horizontally
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Attachment, contentDescription = "Localized description")
            }
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.CalendarMonth, contentDescription = "Localized description")
            }
        },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleMediumTopAppBar() {
    MediumTopAppBar(
        title = { Text("MediumTopAppBAr") },
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = null)
            }
        },
        actions = {
            // RowScope here, so these icons will be placed horizontally
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Attachment, contentDescription = "Localized description")
            }
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.CalendarMonth, contentDescription = "Localized description")
            }
        },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleLargeTopAppBar() {
    LargeTopAppBar(
        title = { Text("LargeTopAppBAr") },
        navigationIcon = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = null)
            }
        },
        actions = {
            // RowScope here, so these icons will be placed horizontally
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Attachment, contentDescription = "Localized description")
            }
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.CalendarMonth, contentDescription = "Localized description")
            }
        },
    )
}
