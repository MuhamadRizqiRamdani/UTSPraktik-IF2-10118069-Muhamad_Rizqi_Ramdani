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
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_Selanjutnya(View view) {
        Intent intent = new Intent(this, CekDataActivity.class);
        startActivity(intent);

    }

}