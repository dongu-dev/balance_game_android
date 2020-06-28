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

public class MoneyActivity_seven extends AppCompatActivity {

    private ImageButton imageButton_money13;
    private ImageButton imageButton_money14;
    private int voteResult_money13;
    private int voteResult_money14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_seven);

        imageButton_money13 = findViewById(R.id.imageButton_money13);
        imageButton_money14 = findViewById(R.id.imageButton_money14);

        imageButton_money13.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money13 = pref.getInt("voteResult_money13_res",0);

                if(voteResult_money13 == 0) {
                    voteResult_money13 = 1;
                } else {
                    voteResult_money13 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money13_res", voteResult_money13);
                ed.commit();

                imageButton_money13.setImageResource(R.drawable.money13_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_seven.this , MoneyActivity_eight.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_money14.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money14 = pref.getInt("voteResult_money14_res",0);

                if(voteResult_money14 == 0) {
                    voteResult_money14 = 1;
                } else {
                    voteResult_money14 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money14_res", voteResult_money14);
                ed.commit();

                imageButton_money14.setImageResource(R.drawable.money14_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_seven.this , MoneyActivity_eight.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
