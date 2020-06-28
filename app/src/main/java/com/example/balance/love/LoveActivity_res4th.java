package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_res4th extends AppCompatActivity {

    private TextView res_textView9;
    private TextView res_textView10;
    private int voteResult9_res;
    private int voteResult10_res;
    private Button res_button8;
    private Button res_button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res4th);

        setTitle("결과");

        res_textView9 = findViewById(R.id.textView9);
        res_textView10 = findViewById(R.id.textView10);
        res_button8 = findViewById(R.id.res_button8);
        res_button9 = findViewById(R.id.res_button9);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult9_res = pref.getInt("voteResult9_res", 0);
        voteResult10_res = pref.getInt("voteResult10_res", 0);

        res_textView9.setText(voteResult9_res + "표");
        res_textView10.setText(voteResult10_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button8.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res4th.this , LoveActivity_res5th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button9.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res4th.this , LoveActivity_res5th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
