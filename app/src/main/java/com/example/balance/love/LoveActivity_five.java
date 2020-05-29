package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_five extends AppCompatActivity {

    private ImageButton imageButton11;
    private ImageButton imageButton12;
    private int voteResult11;
    private int voteResult12;
    private String str_voteResult11;
    private String str_voteResult12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_five);

        imageButton11 = findViewById(R.id.imageButton11);
        imageButton12 = findViewById(R.id.imageButton12);
        voteResult11 = 0;
        voteResult12 = 0;

        imageButton11.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult11; i++) {
                    voteResult11 = voteResult11 + 1;
                }

                str_voteResult11 = Integer.toString(voteResult11);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult11", str_voteResult11);
                ed.commit();

                imageButton11.setImageResource(R.drawable.love11_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_five.this , LoveActivity_six.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton12.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult12; i++) {
                    voteResult12 = voteResult12 + 1;
                }

                str_voteResult12 = Integer.toString(voteResult12);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult12", str_voteResult12);
                ed.commit();

                imageButton12.setImageResource(R.drawable.love12_color);


                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_five.this , LoveActivity_six.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });
    }
}
