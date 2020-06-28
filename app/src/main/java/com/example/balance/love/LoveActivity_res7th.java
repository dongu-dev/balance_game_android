package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.MainActivity;
import com.example.balance.R;
import com.example.balance.StatisticsActivity;

public class LoveActivity_res7th extends AppCompatActivity {

    private TextView res_textView15;
    private TextView res_textView16;
    private int voteResult15_res;
    private int voteResult16_res;
    private Button res_button14;
    private Button res_button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res7th);

        setTitle("결과");

        res_textView15 = findViewById(R.id.textView15);
        res_textView16 = findViewById(R.id.textView16);
        res_button14 = findViewById(R.id.res_button14);
        res_button15 = findViewById(R.id.res_button15);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult15_res = pref.getInt("voteResult15_res", 0);
        voteResult16_res = pref.getInt("voteResult16_res", 0);

        res_textView15.setText(voteResult15_res + "표");
        res_textView16.setText(voteResult16_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button14.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res7th.this , MainActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button15.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res7th.this , MainActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
