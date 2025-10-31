package com.example.praktikum4pt2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

val PurpleHeader = Color(0xFF6A00C9)
val LightPurpleBackground = Color(0xFFF0E6FF)
val PurpleButton = Color(0xFF7B1FA2)

@Composable
fun FormPendaftaranScreen(modifier: Modifier = Modifier) {
    // State untuk inputan
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }
}