package com.example.balance.love;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_res1st extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res1st);

        setTitle("결과");

        //LoveActivity 화면에서 전달한 데이터 받기
        Intent intent = getIntent();
        int[] voteResult = intent.getIntArrayExtra("voteCount");
        String[] imageName = intent.getStringArrayExtra("imgName");

        //초기값 설정 ------------------------------------------------------
        TextView[] tv = new TextView[imageName.length];

        Integer[] tvID = {
        };
    }
}
