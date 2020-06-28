package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_five extends AppCompatActivity {

    private ImageButton imageButton_friends9;
    private ImageButton imageButton_friends10;
    private int voteResult_friends9;
    private int voteResult_friends10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_five);

        imageButton_friends9 = findViewById(R.id.imageButton_friends9);
        imageButton_friends10 = findViewById(R.id.imageButton_friends10);

        imageButton_friends9.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends9 = pref.getInt("voteResult_friends9_res",0);

                if(voteResult_friends9 == 0) {
                    voteResult_friends9 = 1;
                } else {
                    voteResult_friends9 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends9_res", voteResult_friends9);
                ed.commit();

                imageButton_friends9.setImageResource(R.drawable.friends9_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_five.this , FriendsActivity_six.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_friends10.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends10 = pref.getInt("voteResult_friends10_res",0);

                if(voteResult_friends10 == 0) {
                    voteResult_friends10 = 1;
                } else {
                    voteResult_friends10 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends10_res", voteResult_friends10);
                ed.commit();

                imageButton_friends10.setImageResource(R.drawable.friends10_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_five.this , FriendsActivity_six.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
