package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_res2nd extends AppCompatActivity {

    private TextView res_textView5;
    private TextView res_textView6;
    private int voteResult5_res;
    private int voteResult6_res;
    private Button res_button4;
    private Button res_button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res2nd);

        setTitle("결과");

        res_textView5 = findViewById(R.id.textView5);
        res_textView6 = findViewById(R.id.textView6);
        res_button4 = findViewById(R.id.res_button4);
        res_button5 = findViewById(R.id.res_button5);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult5_res = pref.getInt("voteResult5_res", 0);
        voteResult6_res = pref.getInt("voteResult6_res", 0);

        res_textView5.setText(voteResult5_res + "표");
        res_textView6.setText(voteResult6_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res2nd.this , LoveActivity_res3rd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button5.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res2nd.this , LoveActivity_res3rd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
