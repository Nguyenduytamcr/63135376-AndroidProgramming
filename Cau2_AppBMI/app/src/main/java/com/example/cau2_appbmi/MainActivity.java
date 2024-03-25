package com.example.cau2_appbmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtChieuCao = findViewById(R.id.edtChieuCao);
        EditText edtCanNang = findViewById(R.id.edtCanNang);
        RadioButton rbnam = findViewById(R.id.rb_Nam);
        RadioButton rbnu = findViewById(R.id.rb_Nu);
        Button danhgia = findViewById(R.id.btnDanhGia);

    }
}