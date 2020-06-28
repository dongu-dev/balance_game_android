package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_two extends AppCompatActivity {

    private ImageButton imageButton_friends3;
    private ImageButton imageButton_friends4;
    private int voteResult_friends3;
    private int voteResult_friends4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_two);

        imageButton_friends3 = findViewById(R.id.imageButton_friends3);
        imageButton_friends4 = findViewById(R.id.imageButton_friends4);

        imageButton_friends3.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends3 = pref.getInt("voteResult_friends3_res",0);

                if(voteResult_friends3 == 0) {
                    voteResult_friends3 = 1;
                } else {
                    voteResult_friends3 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends3_res", voteResult_friends3);
                ed.commit();

                imageButton_friends3.setImageResource(R.drawable.friends3_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_two.this , FriendsActivity_three.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_friends4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_friends4 = pref.getInt("voteResult_friends4_res",0);

                if(voteResult_friends4 == 0) {
                    voteResult_friends4 = 1;
                } else {
                    voteResult_friends4 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_friends4_res", voteResult_friends4);
                ed.commit();

                imageButton_friends4.setImageResource(R.drawable.friends4_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(FriendsActivity_two.this , FriendsActivity_three.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
