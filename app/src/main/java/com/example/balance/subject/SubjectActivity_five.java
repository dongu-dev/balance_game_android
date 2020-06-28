package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class SubjectActivity_five extends AppCompatActivity {

    private ImageButton imageButton_subject9;
    private ImageButton imageButton_subject10;
    private int voteResult_subject9;
    private int voteResult_subject10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_five);

        imageButton_subject9 = findViewById(R.id.imageButton_subject9);
        imageButton_subject10 = findViewById(R.id.imageButton_subject10);

        imageButton_subject9.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject9 = pref.getInt("voteResult_subject9_res",0);

                if(voteResult_subject9 == 0) {
                    voteResult_subject9 = 1;
                } else {
                    voteResult_subject9 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject9_res", voteResult_subject9);
                ed.commit();

                imageButton_subject9.setImageResource(R.drawable.subject9_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_five.this , SubjectActivity_six.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_subject10.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject10 = pref.getInt("voteResult_subject10_res",0);

                if(voteResult_subject10 == 0) {
                    voteResult_subject10 = 1;
                } else {
                    voteResult_subject10 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject10_res", voteResult_subject10);
                ed.commit();

                imageButton_subject10.setImageResource(R.drawable.subject10_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_five.this , SubjectActivity_six.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });
    }
}