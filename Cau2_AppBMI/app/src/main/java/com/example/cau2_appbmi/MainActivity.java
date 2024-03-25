package com.example.cau2_appbmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

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
        TextView txtKetQua = findViewById(R.id.txtKetQua);
        TextView txtNhanXet = findViewById(R.id.txtNhanXet);
        RadioButton rbnam = findViewById(R.id.rb_Nam);
        RadioButton rbnu = findViewById(R.id.rb_Nu);
        Button danhgia = findViewById(R.id.btnDanhGia);

        danhgia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(edtChieuCao.getText().toString())/100; //rut gon
                double w = Double.parseDouble(edtCanNang.getText().toString());
                double chiso = Math.round((w/Math.pow(h,2))*10)/10.0;
                if(rbnam.isChecked()){
                    if(chiso < 18.5){
                        txtKetQua.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn cần bồi bổ thêm!");
                    }
                    else if(chiso >= 18.5 && chiso <= 24.9){
                        txtKetQua.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn có chỉ số");
                    }
                    else if(chiso == 25) {
                        txtKetQua.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn cần bồi bổ thêm!");
                    }
                    else if(chiso > 25 && chiso <= 29.9){
                        txtKetQua.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn cần bồi bổ thêm!");
                    }
                    else if(chiso >= 30 && chiso <= 34.9){
                        txtKetQua.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn cần bồi bổ thêm!");
                    }
                    else if(chiso >=35 && chiso <= 39.9){
                        txtKetQua.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn cần bồi bổ thêm!");
                    }
                    else if(chiso == 40){
                        txtKetQua.setText(String.valueOf(chiso));
                        txtNhanXet.setText("Bạn cần bồi bổ thêm!");
                    }
                }
            }
        });



    }
}