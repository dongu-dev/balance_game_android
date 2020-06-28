package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.MainActivity;
import com.example.balance.R;

public class SubjectActivity_eight extends AppCompatActivity {

    private ImageButton imageButton_subject15;
    private ImageButton imageButton_subject16;
    private int voteResult_subject15;
    private int voteResult_subject16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_eight);

        imageButton_subject15 = findViewById(R.id.imageButton_subject15);
        imageButton_subject16 = findViewById(R.id.imageButton_subject16);

        imageButton_subject15.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject15 = pref.getInt("voteResult_subject15_res",0);

                if(voteResult_subject15 == 0) {
                    voteResult_subject15 = 1;
                } else {
                    voteResult_subject15 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject15_res", voteResult_subject15);
                ed.commit();

                imageButton_subject15.setImageResource(R.drawable.subject15_color);

                Toast.makeText(getApplicationContext(), "투표가 끝났으므로 메인으로 이동합니다.",Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_eight.this , MainActivity.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_subject16.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject16 = pref.getInt("voteResult_subject16_res",0);

                if(voteResult_subject16 == 0) {
                    voteResult_subject16 = 1;
                } else {
                    voteResult_subject16 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject16_res", voteResult_subject16);
                ed.commit();

                imageButton_subject16.setImageResource(R.drawable.subject16_color);

                Toast.makeText(getApplicationContext(), "투표가 끝났으므로 메인으로 이동합니다.",Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_eight.this , MainActivity.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });
    }
}