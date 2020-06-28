package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class SubjectActivity_two extends AppCompatActivity {

    private ImageButton imageButton_subject3;
    private ImageButton imageButton_subject4;
    private int voteResult_subject3;
    private int voteResult_subject4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_two);

        imageButton_subject3 = findViewById(R.id.imageButton_subject3);
        imageButton_subject4 = findViewById(R.id.imageButton_subject4);

        imageButton_subject3.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject3 = pref.getInt("voteResult_subject3_res",0);

                if(voteResult_subject3 == 0) {
                    voteResult_subject3 = 1;
                } else {
                    voteResult_subject3 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject3_res", voteResult_subject3);
                ed.commit();

                imageButton_subject3.setImageResource(R.drawable.subject3_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_two.this , SubjectActivity_three.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_subject4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_subject4 = pref.getInt("voteResult_subject4_res",0);

                if(voteResult_subject4 == 0) {
                    voteResult_subject4 = 1;
                } else {
                    voteResult_subject4 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_subject4_res", voteResult_subject4);
                ed.commit();

                imageButton_subject4.setImageResource(R.drawable.subject4_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(SubjectActivity_two.this , SubjectActivity_three.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
