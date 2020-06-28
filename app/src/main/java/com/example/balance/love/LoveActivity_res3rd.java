package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_res3rd extends AppCompatActivity {

    private TextView res_textView7;
    private TextView res_textView8;
    private int voteResult7_res;
    private int voteResult8_res;
    private Button res_button6;
    private Button res_button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res3rd);

        setTitle("결과");

        res_textView7 = findViewById(R.id.textView7);
        res_textView8 = findViewById(R.id.textView8);
        res_button6 = findViewById(R.id.res_button6);
        res_button7 = findViewById(R.id.res_button7);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult7_res = pref.getInt("voteResult7_res", 0);
        voteResult8_res = pref.getInt("voteResult8_res", 0);

        res_textView7.setText(voteResult7_res + "표");
        res_textView8.setText(voteResult8_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button6.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res3rd.this , LoveActivity_res4th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button7.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res3rd.this , LoveActivity_res4th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
