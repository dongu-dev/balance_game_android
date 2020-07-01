package com.example.balance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.friends.FriendsActivity_res1st;
import com.example.balance.love.LoveActivity_res;
import com.example.balance.money.MoneyActivity_res1st;
import com.example.balance.subject.SubjectActivity_res1st;

public class StatisticsActivity extends AppCompatActivity {

    private Button btn_sa;
    private Button btn_sa2;
    private Button btn_sa3;
    private Button btn_sa4;
    private Button btn_sa5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        // activity_statistics.xml 의 Button 의 btn_sa 를 찾아와라
        btn_sa = findViewById(R.id.btn_sa);
        btn_sa2 = findViewById(R.id.btn_sa2);
        btn_sa3 = findViewById(R.id.btn_sa3);
        btn_sa4 = findViewById(R.id.btn_sa4);
        btn_sa5 = findViewById(R.id.btn_sa5);

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sa.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatisticsActivity.this , LoveActivity_res.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sa2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatisticsActivity.this , FriendsActivity_res1st.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sa3.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatisticsActivity.this , MoneyActivity_res1st.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sa4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatisticsActivity.this , LoveActivity_res.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sa5.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StatisticsActivity.this , SubjectActivity_res1st.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}