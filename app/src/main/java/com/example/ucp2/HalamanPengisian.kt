package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanPengisian(
    onSubmitButtonClicked: (MutableList<String>) ->Unit,
){

    var namaMahasiswa by rememberSaveable { mutableStateOf("") }
    var nim by rememberSaveable{ mutableStateOf("")}
    var konsentrasi by rememberSaveable{ mutableStateOf("") }
    var judulSkripsi by rememberSaveable { mutableStateOf("") }
    var listData: MutableList<String> = mutableListOf(namaMahasiswa,nim,konsentrasi,judulSkripsi)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){

        OutlinedTextField(
            value = namaMahasiswa,
            onValueChange = {namaMahasiswa= it},
            label = { Text(text = "Nama Mahasiswa")})
        OutlinedTextField(
            value = nim,
            onValueChange = {nim= it},
            label = { Text(text = "NIM")})
        OutlinedTextField(
            value = konsentrasi,
            onValueChange = {konsentrasi= it},
            label = { Text(text = "Konsentrasi")})
        OutlinedTextField(
            value = judulSkripsi,
            onValueChange = {judulSkripsi= it},
            label = { Text(text = "Judul Skripsi")})
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {onSubmitButtonClicked(listData) }){
            Text(text = stringResource(id = R.string.btn_submit))
        }

    }

}