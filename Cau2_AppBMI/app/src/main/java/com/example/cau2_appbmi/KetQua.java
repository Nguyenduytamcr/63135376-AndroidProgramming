package com.example.cau2_appbmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KetQua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);

        Button btnTrove = findViewById(R.id.btnTroVe);
        TextView textView = findViewById(R.id.textview);
        Intent intent = getIntent();
        Double w = intent.getDoubleExtra("Cân Nặng",0);
        Double h = intent.getDoubleExtra("Chiều Cao",0);
        

    }
}