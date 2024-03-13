package com.example.ex3_simplesumapp;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // gắn Layout tương ứng với file này
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
    // đây là bộ lắng nghe và xử lí sự kiện click lên nút "Tính Tổng"
    public void XuLyCong(View view){
    // tìm, tham chiếu đến điều khiển trên tệp XML, maping sang java file
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
    //lấy dữ liệu về ở điều khiển số A
        String strA = editTextSoA.getText().toString();
    //lấy dữ liệu về ở điều khiển số A
        String strB = editTextSoB.getText().toString();
    // chuyển dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
    // tính toán theo yêu cầu
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong); // chuyển sang dạng chuỗi
    // hiện ra màn hình
    editTextKetQua.setText(strTong);

    }


}