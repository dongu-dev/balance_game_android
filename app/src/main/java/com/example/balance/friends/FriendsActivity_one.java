package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.love.LoveActivity_one;

public class FriendsActivity_one extends AppCompatActivity {

    private ImageButton imageButton_friends1;
    private ImageButton imageButton_friends2;
    private int voteResult_friends1;
    private int voteResult_friends2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_one);

        imageButton_friends1 = findViewById(R.id.imageButton_friends1);
        imageButton_friends2 = findViewById(R.id.imageButton_friends2);

        imageButton_friends1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends1 = pref.getInt("voteResult_friends1_res",0);

                if(voteResult_friends1 == 0) {
                    voteResult_friends1 = 1;
                } else {
                    voteResult_friends1 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends1_res", voteResult_friends1);
                ed.commit();

                imageButton_friends1.setImageResource(R.drawable.friends1_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_one.this , FriendsActivity_two.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_friends2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends2 = pref.getInt("voteResult_friends2_res",0);

                if(voteResult_friends2 == 0) {
                    voteResult_friends2 = 1;
                } else {
                    voteResult_friends2 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends2_res", voteResult_friends2);
                ed.commit();

                imageButton_friends2.setImageResource(R.drawable.friends2_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_one.this , FriendsActivity_two.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
