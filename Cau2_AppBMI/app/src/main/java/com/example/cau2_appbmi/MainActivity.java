package com.example.cau2_appbmi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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

        EditText edtCanNang = findViewById(R.id.edtCanNang);
        EditText edtChieuCao = findViewById(R.id.edtChieuCao);
        Button btnDanhGia = findViewById(R.id.btnDanhGia);

    }
}