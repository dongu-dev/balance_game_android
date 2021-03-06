package com.example.balance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class MainActivity extends AppCompatActivity {

    private Button btn_main;
    private Button btn_main1;
    private Button btn_main2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // activity_main.xml 의 Button 의 btn_main 를 찾아와라
        btn_main = findViewById(R.id.btn_main);
        btn_main1 = findViewById(R.id.btn_main1);
        btn_main2 = findViewById(R.id.btn_main2);

        // btn_main 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_main.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , SubActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_main1 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_main1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ExplainActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_main2 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_main2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , StatisticsActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
