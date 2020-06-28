package com.example.balance.money;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.friends.FriendsActivity_two;

public class MoneyActivity_three extends AppCompatActivity {

    private ImageButton imageButton_money5;
    private ImageButton imageButton_money6;
    private int voteResult_money5;
    private int voteResult_money6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_three);

        imageButton_money5 = findViewById(R.id.imageButton_money5);
        imageButton_money6 = findViewById(R.id.imageButton_money6);

        imageButton_money5.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money5 = pref.getInt("voteResult_money5_res",0);

                if(voteResult_money5 == 0) {
                    voteResult_money5 = 1;
                } else {
                    voteResult_money5 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money5_res", voteResult_money5);
                ed.commit();

                imageButton_money5.setImageResource(R.drawable.money5_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_three.this , MoneyActivity_four.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_money6.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money5 = pref.getInt("voteResult_money6_res",0);

                if(voteResult_money5 == 0) {
                    voteResult_money5 = 1;
                } else {
                    voteResult_money5 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money6_res", voteResult_money6);
                ed.commit();

                imageButton_money6.setImageResource(R.drawable.money6_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_three.this , MoneyActivity_four.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
