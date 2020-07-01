package com.example.balance;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.friends.FriendsActivity_one;
import com.example.balance.love.LoveActivity;
import com.example.balance.money.MoneyActivity_one;
import com.example.balance.subject.SubjectActivity_one;

public class SubActivity extends AppCompatActivity {

    private Button btn_sub;
    private Button btn_sub1;
    private Button btn_sub2;
    private Button btn_sub3;
    private Button btn_sub4;


    //처음 서브화면이 나오게되면 자동적으로 onCreate 가 실행된다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn_sub = findViewById(R.id.btn_sub);
        btn_sub1 = findViewById(R.id.btn_sub1);
        btn_sub2 = findViewById(R.id.btn_sub2);
        btn_sub3 = findViewById(R.id.btn_sub3);
        btn_sub4 = findViewById(R.id.btn_sub4);

        // btn_move 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sub.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, LoveActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_move 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sub1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, FriendsActivity_one.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_move 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sub2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, MoneyActivity_one.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_move 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sub3.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, LoveActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_move 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sub4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, SubjectActivity_one.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}