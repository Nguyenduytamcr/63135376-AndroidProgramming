package com.example.bt_nav;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

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
        // Bước 1. tạo CSDL
        SQLiteDatabase dbBook;
        dbBook = openOrCreateDatabase("QLSach.db",MODE_PRIVATE,null);
        // chạy thử và xem CSDL được tạo ra chưa
        // Bước 2. tạo bảng
        String sqlXoaBangNeuDaCo = " DROP TABLE IF EXISTS abc;";
        dbBook.execSQL(sqlXoaBangNeuDaCo);
        String sqlTaoBang = "CREATE TABLE BOOKS(BookID integer PRIMARY KEY," +
                                                " BookName text,\n" +
                                                " Page integer, Price Float," +
                                                " Description text);\n";
        dbBook.execSQL(sqlTaoBang);
    }
}