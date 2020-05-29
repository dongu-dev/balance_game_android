package com.example.balance.love;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.content.SharedPreferences;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity extends AppCompatActivity {

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private int voteResult1;
    private int voteResult2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult1 = pref.getInt("voteResult1_res",0);

                if(voteResult1 == 0) {
                    voteResult1 = 1;
                } else {
                    voteResult1 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult1_res", voteResult1);
                ed.commit();

                imageButton1.setImageResource(R.drawable.love1_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity.this , LoveActivity_one.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult2 = pref.getInt("voteResult2_res",0);

                if(voteResult2 == 0) {
                    voteResult2 = 1;
                } else {
                    voteResult2 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult2_res", voteResult2);
                ed.commit();

                imageButton2.setImageResource(R.drawable.love2_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity.this , LoveActivity_one.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
