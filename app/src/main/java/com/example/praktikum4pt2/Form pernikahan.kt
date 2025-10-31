package com.example.praktikum4pt2

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField

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

    val genderOptions = listOf("Laki-laki", "Perempuan")
    val statusOptions = listOf("Janda", "Lajang", "Duda")

    Surface(
        modifier = modifier.fillMaxSize(),
        color = LightPurpleBackground
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(PurpleHeader)
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Formulir Pendaftaran",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Card(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 24.dp, vertical = 32.dp),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Column(
                            // ... (modifier)
                        ) {
                            // --- NAMA LENGKAP (Kode FormLabel di-inline) ---
                            Text(
                                text = "NAMA LENGKAP",
                                style = MaterialTheme.typography.labelMedium,
                                color = Color.DarkGray,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )
                            OutlinedTextField(
                                value = textNama,
                                onValueChange = { textNama = it },
                                placeholder = { Text("Isian nama lengkap") },
                                modifier = Modifier.fillMaxWidth(),
                                singleLine = true,
                                shape = RoundedCornerShape(8.dp)
                            )
                            Spacer(Modifier.height(16.dp))
                        }

                    }
                }
            }
        }

        }
    }



