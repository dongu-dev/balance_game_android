package com.example.balance.love;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.StatisticsActivity;

public class LoveActivity extends AppCompatActivity {

    private ImageButton imageButton1;
    private ImageButton imageButton2;

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

        // 투표카운트 초기값 설정
        final int[] voteCount = {0,0};
        ImageButton[] imageButton = new ImageButton[2];
        Integer[] imageID = {
                R.id.imageButton1, R.id.imageButton2
        };
        final String[] imgName = {
                "전 (남/여)친",
                "전 전(남/여)친"
        };

        // 각 이미지버튼에 ClickListener 정의
        for(int i = 0; i < imageID.length; i++) {
            final int idx = i; // icx 변수 값이 변하지 않도록 final 선언
            imageButton[i] = (ImageButton)findViewById(imageID[i]);
            imageButton[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //intent 선언
                    Intent intent = new Intent(getApplicationContext(), StatisticsActivity.class);
                    //데이터 설정
                    intent.putExtra("voteCount", voteCount);
                    intent.putExtra("imgName", imgName);
                }
            });
        }
    }
}
