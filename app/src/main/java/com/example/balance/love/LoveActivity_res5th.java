package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_res5th extends AppCompatActivity {

    private TextView res_textView11;
    private TextView res_textView12;
    private int voteResult11_res;
    private int voteResult12_res;
    private Button res_button10;
    private Button res_button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res5th);

        setTitle("결과");

        res_textView11 = findViewById(R.id.textView11);
        res_textView12 = findViewById(R.id.textView12);
        res_button10 = findViewById(R.id.res_button10);
        res_button11 = findViewById(R.id.res_button11);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult11_res = pref.getInt("voteResult11_res", 0);
        voteResult12_res = pref.getInt("voteResult12_res", 0);

        res_textView11.setText(voteResult11_res + "표");
        res_textView12.setText(voteResult12_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button10.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res5th.this , LoveActivity_res6th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button11.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res5th.this , LoveActivity_res6th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
