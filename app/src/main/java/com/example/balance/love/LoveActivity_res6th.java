package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_res6th extends AppCompatActivity {

    private TextView res_textView13;
    private TextView res_textView14;
    private int voteResult13_res;
    private int voteResult14_res;
    private Button res_button12;
    private Button res_button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res6th);

        setTitle("결과");

        res_textView13 = findViewById(R.id.textView13);
        res_textView14 = findViewById(R.id.textView14);
        res_button12 = findViewById(R.id.res_button12);
        res_button13 = findViewById(R.id.res_button13);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult13_res = pref.getInt("voteResult13_res", 0);
        voteResult14_res = pref.getInt("voteResult14_res", 0);

        res_textView13.setText(voteResult13_res + "표");
        res_textView14.setText(voteResult14_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button12.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res6th.this , LoveActivity_res7th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button13.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res6th.this , LoveActivity_res7th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
