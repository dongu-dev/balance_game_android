package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.money.MoneyActivity_two;

public class SubjectActivity_one extends AppCompatActivity {

    private ImageButton imageButton_subject1;
    private ImageButton imageButton_subject2;
    private int voteResult_subject1;
    private int voteResult_subject2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_one);

        imageButton_subject1 = findViewById(R.id.imageButton_subject1);
        imageButton_subject2 = findViewById(R.id.imageButton_subject2);

        imageButton_subject1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject1 = pref.getInt("voteResult_subject1_res",0);

                if(voteResult_subject1 == 0) {
                    voteResult_subject1 = 1;
                } else {
                    voteResult_subject1 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject1_res", voteResult_subject1);
                ed.commit();

                imageButton_subject1.setImageResource(R.drawable.subject1_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_one.this , SubjectActivity_two.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_subject2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject2 = pref.getInt("voteResult_subject2_res",0);

                if(voteResult_subject2 == 0) {
                    voteResult_subject2 = 1;
                } else {
                    voteResult_subject2 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject2_res", voteResult_subject2);
                ed.commit();

                imageButton_subject2.setImageResource(R.drawable.subject2_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_one.this , SubjectActivity_two.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
