package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class SubjectActivity_seven extends AppCompatActivity {

    private ImageButton imageButton_subject13;
    private ImageButton imageButton_subject14;
    private int voteResult_subject13;
    private int voteResult_subject14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_seven);

        imageButton_subject13 = findViewById(R.id.imageButton_subject13);
        imageButton_subject14 = findViewById(R.id.imageButton_subject14);

        imageButton_subject13.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject13 = pref.getInt("voteResult_subject13_res",0);

                if(voteResult_subject13 == 0) {
                    voteResult_subject13 = 1;
                } else {
                    voteResult_subject13 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject13_res", voteResult_subject13);
                ed.commit();

                imageButton_subject13.setImageResource(R.drawable.subject13_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_seven.this , SubjectActivity_eight.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_subject14.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject14 = pref.getInt("voteResult_subject14_res",0);

                if(voteResult_subject14 == 0) {
                    voteResult_subject14 = 1;
                } else {
                    voteResult_subject14 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject14_res", voteResult_subject14);
                ed.commit();

                imageButton_subject14.setImageResource(R.drawable.subject14_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_seven.this , SubjectActivity_eight.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });
    }
}