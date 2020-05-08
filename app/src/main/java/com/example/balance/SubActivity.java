package com.example.balance;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.love.LoveActivity;

public class SubActivity extends AppCompatActivity {

    private Button btn_sub;

    //처음 서브화면이 나오게되면 자동적으로 onCreate 가 실행된다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn_sub = findViewById(R.id.btn_sub);

        // btn_move 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        btn_sub.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, LoveActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
