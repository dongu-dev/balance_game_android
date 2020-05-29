package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_four extends AppCompatActivity {

    private ImageButton imageButton9;
    private ImageButton imageButton10;
    private int voteResult9;
    private int voteResult10;
    private String str_voteResult9;
    private String str_voteResult10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_four);

        imageButton9 = findViewById(R.id.imageButton9);
        imageButton10 = findViewById(R.id.imageButton10);
        voteResult9 = 0;
        voteResult10 = 0;

        imageButton9.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult9; i++) {
                    voteResult9 = voteResult9 + 1;
                }

                str_voteResult9 = Integer.toString(voteResult9);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult9", str_voteResult9);
                ed.commit();

                imageButton9.setImageResource(R.drawable.love9_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_four.this , LoveActivity_five.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton10.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult10; i++) {
                    voteResult10 = voteResult10 + 1;
                }

                str_voteResult10 = Integer.toString(voteResult10);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult10", str_voteResult10);
                ed.commit();

                imageButton10.setImageResource(R.drawable.love10_color);


                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_four.this , LoveActivity_five.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });
    }
}
