package com.example.balance.love;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageButton;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity extends AppCompatActivity {

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private int voteResult1=0;
    private int voteResult2=0;
    private String str_voteResult1;
    private String str_voteResult2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult1; i++) {
                    voteResult1 = voteResult1 + 1;
                }

                str_voteResult1 = Integer.toString(voteResult1);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult1", str_voteResult1);
                ed.commit();

                imageButton1.setImageResource(R.drawable.love1_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity.this , LoveActivity_one.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult2; i++) {
                    voteResult2 = voteResult2 + 1;
                }

                str_voteResult2 = Integer.toString(voteResult2);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult2", str_voteResult2);
                ed.commit();

                imageButton2.setImageResource(R.drawable.love2_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity.this , LoveActivity_one.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });


    }
}
