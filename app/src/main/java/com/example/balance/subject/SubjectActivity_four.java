package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class SubjectActivity_four extends AppCompatActivity {

    private ImageButton imageButton_subject7;
    private ImageButton imageButton_subject8;
    private int voteResult_subject7;
    private int voteResult_subject8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_four);

        imageButton_subject7 = findViewById(R.id.imageButton_subject7);
        imageButton_subject8 = findViewById(R.id.imageButton_subject8);

        imageButton_subject7.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject7 = pref.getInt("voteResult_subject7_res",0);

                if(voteResult_subject7 == 0) {
                    voteResult_subject7 = 1;
                } else {
                    voteResult_subject7 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject7_res", voteResult_subject7);
                ed.commit();

                imageButton_subject7.setImageResource(R.drawable.subject7_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_four.this , SubjectActivity_five.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_subject8.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject8 = pref.getInt("voteResult_subject8_res",0);

                if(voteResult_subject8 == 0) {
                    voteResult_subject8 = 1;
                } else {
                    voteResult_subject8 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject8_res", voteResult_subject8);
                ed.commit();

                imageButton_subject8.setImageResource(R.drawable.subject8_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_four.this , SubjectActivity_five.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
