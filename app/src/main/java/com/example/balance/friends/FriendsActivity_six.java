package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_six extends AppCompatActivity {

    private ImageButton imageButton_friends11;
    private ImageButton imageButton_friends12;
    private int voteResult_friends11;
    private int voteResult_friends12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_six);

        imageButton_friends11 = findViewById(R.id.imageButton_friends11);
        imageButton_friends12 = findViewById(R.id.imageButton_friends12);

        imageButton_friends11.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends11 = pref.getInt("voteResult_friends11_res",0);

                if(voteResult_friends11 == 0) {
                    voteResult_friends11 = 1;
                } else {
                    voteResult_friends11 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends11_res", voteResult_friends11);
                ed.commit();

                imageButton_friends11.setImageResource(R.drawable.friends11_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_six.this , FriendsActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_friends12.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends12 = pref.getInt("voteResult_friends12_res",0);

                if(voteResult_friends12 == 0) {
                    voteResult_friends12 = 1;
                } else {
                    voteResult_friends12 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends12_res", voteResult_friends12);
                ed.commit();

                imageButton_friends12.setImageResource(R.drawable.friends12_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_six.this , FriendsActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
