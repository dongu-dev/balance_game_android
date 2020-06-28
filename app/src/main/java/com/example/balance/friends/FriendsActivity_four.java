package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_four extends AppCompatActivity {

    private ImageButton imageButton_friends7;
    private ImageButton imageButton_friends8;
    private int voteResult_friends7;
    private int voteResult_friends8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_four);

        imageButton_friends7 = findViewById(R.id.imageButton_friends7);
        imageButton_friends8 = findViewById(R.id.imageButton_friends8);

        imageButton_friends7.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends7 = pref.getInt("voteResult_friends7_res",0);

                if(voteResult_friends7 == 0) {
                    voteResult_friends7 = 1;
                } else {
                    voteResult_friends7 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends7_res", voteResult_friends7);
                ed.commit();

                imageButton_friends7.setImageResource(R.drawable.friends7_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_four.this , FriendsActivity_five.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_friends8.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends8 = pref.getInt("voteResult_friends8_res",0);

                if(voteResult_friends8 == 0) {
                    voteResult_friends8 = 1;
                } else {
                    voteResult_friends8 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends8_res", voteResult_friends8);
                ed.commit();

                imageButton_friends8.setImageResource(R.drawable.friends8_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_four.this , FriendsActivity_five.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
