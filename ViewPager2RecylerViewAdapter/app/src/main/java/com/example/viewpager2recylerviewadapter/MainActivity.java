package com.example.viewpager2recylerviewadapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> viewPagerDatas;
    ViewPager2 viewPager2Land;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPagerDatas = new getDataForViewPager();
        viewPager2Land = findViewById(R.id.vp2Land);
        landScapeAdapter = new LandScapeAdapter(this,viewPagerDatas,)
    }
    ArrayList<LandScape> getDataForViewPager(){
        ArrayList<LandScape> dsData = new ArrayList<>();
        LandScape landScape = new LandScape("des","Ảnh đẹp 4k");
        dsData.add(landScape);
        dsData.add(new LandScape("anh1","Ảnh đẹp 4k"));
        dsData.add(new LandScape("anh2","Ảnh đẹp 4k"));
        dsData.add(new LandScape("anh3","Ảnh đẹp 4k"));
        return dsData;
    }
}