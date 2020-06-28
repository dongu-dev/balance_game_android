package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_seven extends AppCompatActivity {

    private ImageButton imageButton_friends13;
    private ImageButton imageButton_friends14;
    private int voteResult_friends13;
    private int voteResult_friends14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_seven);

        imageButton_friends13 = findViewById(R.id.imageButton_friends13);
        imageButton_friends14 = findViewById(R.id.imageButton_friends14);

        imageButton_friends13.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends13 = pref.getInt("voteResult_friends13_res",0);

                if(voteResult_friends13 == 0) {
                    voteResult_friends13 = 1;
                } else {
                    voteResult_friends13 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends13_res", voteResult_friends13);
                ed.commit();

                imageButton_friends13.setImageResource(R.drawable.friends13_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_seven.this , FriendsActivity_eight.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_friends14.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends14 = pref.getInt("voteResult_friends8_res",0);

                if(voteResult_friends14 == 0) {
                    voteResult_friends14 = 1;
                } else {
                    voteResult_friends14 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends14_res", voteResult_friends14);
                ed.commit();

                imageButton_friends14.setImageResource(R.drawable.friends14_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_seven.this , FriendsActivity_eight.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
