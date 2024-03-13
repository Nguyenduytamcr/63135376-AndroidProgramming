package com.example.ex4_addsubmuldiv_onclick;

import android.os.Bundle;
import android.view.View;
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
    }
    //hàm xử lí cộng
    public void HamXuLyCong(View view){
        // tìm, tham chiếu đến điều khiển trên tệp XML, maping sang java file
        EditText editTextSo1 = findViewById(R.id.edtso1);
        EditText editTextSo2 = findViewById(R.id.edtso2);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //lấy dữ liệu về ở điều khiển số A
        String str1 = editTextSo1.getText().toString();
        //lấy dữ liệu về ở điều khiển số A
        String str2 = editTextSo2.getText().toString();
        // chuyển dữ liệu sang dạng số
        int so_1 = Integer.parseInt(str1);
        int so_2 = Integer.parseInt(str2);
        // tính toán theo yêu cầu
        int tong = so_1 + so_2;
        String strTong = String.valueOf(tong); // chuyển sang dạng chuỗi
        // hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
    //hàm xử lí trừ
    public void HamXuLyTru(View view){
        // tìm, tham chiếu đến điều khiển trên tệp XML, maping sang java file
        EditText editTextSo1 = findViewById(R.id.edtso1);
        EditText editTextSo2 = findViewById(R.id.edtso2);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //lấy dữ liệu về ở điều khiển số A
        String str1 = editTextSo1.getText().toString();
        //lấy dữ liệu về ở điều khiển số A
        String str2 = editTextSo2.getText().toString();
        // chuyển dữ liệu sang dạng số
        int so_1 = Integer.parseInt(str1);
        int so_2 = Integer.parseInt(str2);
        // tính toán theo yêu cầu
        int hieu = so_1 - so_2;
        String strHieu = String.valueOf(hieu); // chuyển sang dạng chuỗi
        // hiện ra màn hình
        editTextKetQua.setText(strHieu);
    }
    //hàm xử lí nhân
    public void HamXuLyNhan(View view){
        // tìm, tham chiếu đến điều khiển trên tệp XML, maping sang java file
        EditText editTextSo1 = findViewById(R.id.edtso1);
        EditText editTextSo2 = findViewById(R.id.edtso2);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //lấy dữ liệu về ở điều khiển số A
        String str1 = editTextSo1.getText().toString();
        //lấy dữ liệu về ở điều khiển số A
        String str2 = editTextSo2.getText().toString();
        // chuyển dữ liệu sang dạng số
        int so_1 = Integer.parseInt(str1);
        int so_2 = Integer.parseInt(str2);
        // tính toán theo yêu cầu
        int tich = so_1 * so_2;
        String strTich = String.valueOf(tich); // chuyển sang dạng chuỗi
        // hiện ra màn hình
        editTextKetQua.setText(strTich);
    }
    //hàm xử lí chia
    public void HamXuLyChia(View view){
        // tìm, tham chiếu đến điều khiển trên tệp XML, maping sang java file
        EditText editTextSo1 = findViewById(R.id.edtso1);
        EditText editTextSo2 = findViewById(R.id.edtso2);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //lấy dữ liệu về ở điều khiển số A
        String str1 = editTextSo1.getText().toString();
        //lấy dữ liệu về ở điều khiển số A
        String str2 = editTextSo2.getText().toString();
        // chuyển dữ liệu sang dạng số
        int so_1 = Integer.parseInt(str1);
        int so_2 = Integer.parseInt(str2);
        // tính toán theo yêu cầu
        int thuong = so_1 / so_2;
        String strThuong = String.valueOf(thuong); // chuyển sang dạng chuỗi
        // hiện ra màn hình
        editTextKetQua.setText(strThuong);
    }
}