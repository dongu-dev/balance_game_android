package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_six extends AppCompatActivity {

    private ImageButton imageButton13;
    private ImageButton imageButton14;
    private int voteResult13;
    private int voteResult14;
    private String str_voteResult13;
    private String str_voteResult14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_six);

        imageButton13 = findViewById(R.id.imageButton13);
        imageButton14 = findViewById(R.id.imageButton14);
        voteResult13 = 0;
        voteResult14 = 0;

        imageButton13.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult13; i++) {
                    voteResult13 = voteResult13 + 1;
                }

                str_voteResult13 = Integer.toString(voteResult13);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult13", str_voteResult13);
                ed.commit();

                imageButton13.setImageResource(R.drawable.love13_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_six.this , LoveActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton14.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                for(int i=0; i < voteResult14; i++) {
                    voteResult14 = voteResult14 + 1;
                }

                str_voteResult14 = Integer.toString(voteResult14);

                SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
                SharedPreferences.Editor ed = pref.edit();
                ed.putString("str_voteResult14", str_voteResult14);
                ed.commit();

                imageButton14.setImageResource(R.drawable.love14_color);


                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_six.this , LoveActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });
    }
}
