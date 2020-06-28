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

public class MoneyActivity_one extends AppCompatActivity {

    private ImageButton imageButton_money1;
    private ImageButton imageButton_money2;
    private int voteResult_money1;
    private int voteResult_money2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_one);

        imageButton_money1 = findViewById(R.id.imageButton_money1);
        imageButton_money2 = findViewById(R.id.imageButton_money2);

        imageButton_money1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money1 = pref.getInt("voteResult_money1_res",0);

                if(voteResult_money1 == 0) {
                    voteResult_money1 = 1;
                } else {
                    voteResult_money1 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money1_res", voteResult_money1);
                ed.commit();

                imageButton_money1.setImageResource(R.drawable.money1_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_one.this , MoneyActivity_two.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_money2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money2 = pref.getInt("voteResult_money2_res",0);

                if(voteResult_money2 == 0) {
                    voteResult_money2 = 1;
                } else {
                    voteResult_money2 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money2_res", voteResult_money2);
                ed.commit();

                imageButton_money2.setImageResource(R.drawable.money2_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_one.this , MoneyActivity_two.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
