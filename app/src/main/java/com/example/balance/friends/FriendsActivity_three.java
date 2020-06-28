package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_three extends AppCompatActivity {

    private ImageButton imageButton_friends5;
    private ImageButton imageButton_friends6;
    private int voteResult_friends5;
    private int voteResult_friends6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_three);

        imageButton_friends5 = findViewById(R.id.imageButton_friends5);
        imageButton_friends6 = findViewById(R.id.imageButton_friends6);

        imageButton_friends5.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends5 = pref.getInt("voteResult_friends5_res",0);

                if(voteResult_friends5 == 0) {
                    voteResult_friends5 = 1;
                } else {
                    voteResult_friends5 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends5_res", voteResult_friends5);
                ed.commit();

                imageButton_friends5.setImageResource(R.drawable.friends5_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_three.this , FriendsActivity_four.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_friends6.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends6 = pref.getInt("voteResult_friends6_res",0);

                if(voteResult_friends6 == 0) {
                    voteResult_friends6 = 1;
                } else {
                    voteResult_friends6 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends6_res", voteResult_friends6);
                ed.commit();

                imageButton_friends6.setImageResource(R.drawable.friends6_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_three.this , FriendsActivity_four.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
