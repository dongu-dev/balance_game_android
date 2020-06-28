package com.example.balance.money;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.MainActivity;
import com.example.balance.R;
import com.example.balance.friends.FriendsActivity_two;

public class MoneyActivity_eight extends AppCompatActivity {

    private ImageButton imageButton_money15;
    private ImageButton imageButton_money16;
    private int voteResult_money15;
    private int voteResult_money16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_eight);

        imageButton_money15 = findViewById(R.id.imageButton_money15);
        imageButton_money16 = findViewById(R.id.imageButton_money16);

        imageButton_money15.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money15 = pref.getInt("voteResult_money15_res",0);

                if(voteResult_money15 == 0) {
                    voteResult_money15 = 1;
                } else {
                    voteResult_money15 ++;
                }
                // -- 득표수 계산 로직 끝 --

                // 득표 수 저장하기
                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money15_res", voteResult_money15);
                ed.commit();

                imageButton_money15.setImageResource(R.drawable.money15_color);

                Toast.makeText(getApplicationContext(), "투표가 끝났으므로 메인으로 이동합니다.",Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_eight.this , MainActivity.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton_money15.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                // 득표수 계산 로직(이미지버튼 클릭시 값 1씩 증가)
                voteResult_money15 = pref.getInt("voteResult_money15_res",0);

                if(voteResult_money15 == 0) {
                    voteResult_money15 = 1;
                } else {
                    voteResult_money15 ++;
                }
                // -- 득표수 계산 로직 끝 --

                SharedPreferences.Editor ed = pref.edit();
                ed.putInt("voteResult_money15_res", voteResult_money15);
                ed.commit();

                imageButton_money15.setImageResource(R.drawable.money15_color);

                Toast.makeText(getApplicationContext(), "투표가 끝났으므로 메인으로 이동합니다.",Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(MoneyActivity_eight.this , MainActivity.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
