package com.example.utspraktik_if2_10118069_muhamad_rizqi_ramdani;
/*
    NIM             : 10118069
    Nama            : Muhamad Rizqi Ramdani
    Kelas           : IF2
    TGl Pengerjaan  : 5 juni 2021
  */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CekDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_data);

    }
    public void btn_Selanjutnya_Cek(View view) {
        Intent intent = new Intent(this, BerhasilSimpanActivity.class);
        startActivity(intent);

    }
}