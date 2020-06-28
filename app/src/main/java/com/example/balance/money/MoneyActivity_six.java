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

public class MoneyActivity_six extends AppCompatActivity {

    private ImageButton imageButton_money11;
    private ImageButton imageButton_money12;
    private int voteResult_money11;
    private int voteResult_money12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_six);

        imageButton_money11 = findViewById(R.id.imageButton_money11);
        imageButton_money12 = findViewById(R.id.imageButton_money12);

        imageButton_money11.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money11 = pref.getInt("voteResult_money11_res",0);

                if(voteResult_money11 == 0) {
                    voteResult_money11 = 1;
                } else {
                    voteResult_money11 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money11_res", voteResult_money11);
                ed.commit();

                imageButton_money11.setImageResource(R.drawable.money11_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_six.this , MoneyActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_money12.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money12 = pref.getInt("voteResult_money12_res",0);

                if(voteResult_money12 == 0) {
                    voteResult_money12 = 1;
                } else {
                    voteResult_money12 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money12_res", voteResult_money12);
                ed.commit();

                imageButton_money12.setImageResource(R.drawable.money12_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_six.this , MoneyActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
