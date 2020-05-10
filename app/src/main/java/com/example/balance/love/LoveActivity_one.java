package com.example.balance.love;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_one extends AppCompatActivity {

    private ImageButton imageButton3;
    private ImageButton imageButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_one);

        imageButton3 = findViewById(R.id.imageButton3);
        imageButton4 = findViewById(R.id.imageButton4);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                imageButton3.setImageResource(R.drawable.love3_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_one.this , LoveActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                imageButton4.setImageResource(R.drawable.love4_color);

                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        //여기에 딜레이 후 시작할 작업들을 입력
                        Intent intent = new Intent(LoveActivity_one.this , LoveActivity_seven.class);
                        startActivity(intent); // 액티비티 이동하는 구문이다.
                    }
                }, 2000);// 2초 정도 딜레이를 준 후 시작
            }
        });
    }
}
