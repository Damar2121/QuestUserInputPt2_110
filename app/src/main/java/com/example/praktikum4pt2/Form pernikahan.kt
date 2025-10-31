package com.example.praktikum4pt2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*

@Composable
fun FormPendaftaranScreen(modifier: Modifier = Modifier) {
    // State untuk inputan
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }
}