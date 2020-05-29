package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_two extends AppCompatActivity {

    private ImageButton imageButton5;
    private ImageButton imageButton6;
    private int voteResult5;
    private int voteResult6;
    private String str_voteResult5;
    private String str_voteResult6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_two);

        imageButton5 = findViewById(R.id.imageButton5);
        imageButton6 = findViewById(R.id.imageButton6);
        voteResult5 = 0;
        voteResult6 = 0;

        imageButton5.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult5; i++) {
                    voteResult5 = voteResult5 + 1;
                }

                str_voteResult5 = Integer.toString(voteResult5);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult5", str_voteResult5);
                ed.commit();

                imageButton5.setImageResource(R.drawable.love5_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_two.this , LoveActivity_three.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult6; i++) {
                    voteResult6 = voteResult6 + 1;
                }

                str_voteResult6 = Integer.toString(voteResult6);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult6", str_voteResult6);
                ed.commit();

                imageButton6.setImageResource(R.drawable.love6_color);


                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_two.this , LoveActivity_three.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });
    }
}
