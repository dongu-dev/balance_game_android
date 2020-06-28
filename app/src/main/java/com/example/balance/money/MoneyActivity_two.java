package com.example.balance.money;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.friends.FriendsActivity_three;
import com.example.balance.friends.FriendsActivity_two;

public class MoneyActivity_two extends AppCompatActivity {

    private ImageButton imageButton_money3;
    private ImageButton imageButton_money4;
    private int voteResult_money3;
    private int voteResult_money4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_two);

        imageButton_money3 = findViewById(R.id.imageButton_money3);
        imageButton_money4 = findViewById(R.id.imageButton_money4);

        imageButton_money3.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money3 = pref.getInt("voteResult_money3_res",0);

                if(voteResult_money3 == 0) {
                    voteResult_money3 = 1;
                } else {
                    voteResult_money3 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money3_res", voteResult_money3);
                ed.commit();

                imageButton_money3.setImageResource(R.drawable.money3_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_two.this , MoneyActivity_three.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_money4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money4 = pref.getInt("voteResult_money4_res",0);

                if(voteResult_money4 == 0) {
                    voteResult_money4 = 1;
                } else {
                    voteResult_money4 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money4_res", voteResult_money4);
                ed.commit();

                imageButton_money4.setImageResource(R.drawable.money4_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_two.this , MoneyActivity_three.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
