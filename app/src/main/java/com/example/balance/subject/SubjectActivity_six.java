package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class SubjectActivity_six extends AppCompatActivity {

    private ImageButton imageButton_subject11;
    private ImageButton imageButton_subject12;
    private int voteResult_subject11;
    private int voteResult_subject12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_six);

        imageButton_subject11 = findViewById(R.id.imageButton_subject11);
        imageButton_subject12 = findViewById(R.id.imageButton_subject12);

        imageButton_subject11.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject11 = pref.getInt("voteResult_subject11_res",0);

                if(voteResult_subject11 == 0) {
                    voteResult_subject11 = 1;
                } else {
                    voteResult_subject11 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject11_res", voteResult_subject11);
                ed.commit();

                imageButton_subject11.setImageResource(R.drawable.subject11_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_six.this , SubjectActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_subject12.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject12 = pref.getInt("voteResult_subject12_res",0);

                if(voteResult_subject12 == 0) {
                    voteResult_subject12 = 1;
                } else {
                    voteResult_subject12 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject12_res", voteResult_subject12);
                ed.commit();

                imageButton_subject12.setImageResource(R.drawable.subject12_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_six.this , SubjectActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });
    }
}