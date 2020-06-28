package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class SubjectActivity_three extends AppCompatActivity {

    private ImageButton imageButton_subject5;
    private ImageButton imageButton_subject6;
    private int voteResult_subject5;
    private int voteResult_subject6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_three);

        imageButton_subject5 = findViewById(R.id.imageButton_subject5);
        imageButton_subject6 = findViewById(R.id.imageButton_subject6);

        imageButton_subject5.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject5 = pref.getInt("voteResult_subject5_res",0);

                if(voteResult_subject5 == 0) {
                    voteResult_subject5 = 1;
                } else {
                    voteResult_subject5 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject5_res", voteResult_subject5);
                ed.commit();

                imageButton_subject5.setImageResource(R.drawable.subject5_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_three.this , SubjectActivity_four.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_subject6.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject6 = pref.getInt("voteResult_subject6_res",0);

                if(voteResult_subject6 == 0) {
                    voteResult_subject6 = 1;
                } else {
                    voteResult_subject6 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject6_res", voteResult_subject6);
                ed.commit();

                imageButton_subject6.setImageResource(R.drawable.subject6_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_three.this , SubjectActivity_four.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
