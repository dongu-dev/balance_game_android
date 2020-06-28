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

public class MoneyActivity_five extends AppCompatActivity {

    private ImageButton imageButton_money9;
    private ImageButton imageButton_money10;
    private int voteResult_money9;
    private int voteResult_money10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_five);

        imageButton_money9 = findViewById(R.id.imageButton_money9);
        imageButton_money10 = findViewById(R.id.imageButton_money10);

        imageButton_money9.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money9 = pref.getInt("voteResult_money9_res",0);

                if(voteResult_money9 == 0) {
                    voteResult_money9 = 1;
                } else {
                    voteResult_money9 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money9_res", voteResult_money9);
                ed.commit();

                imageButton_money9.setImageResource(R.drawable.money9_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_five.this , MoneyActivity_six.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_money10.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money10 = pref.getInt("voteResult_money10_res",0);

                if(voteResult_money10 == 0) {
                    voteResult_money10 = 1;
                } else {
                    voteResult_money10 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money10_res", voteResult_money10);
                ed.commit();

                imageButton_money10.setImageResource(R.drawable.money10_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_five.this , MoneyActivity_six.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
