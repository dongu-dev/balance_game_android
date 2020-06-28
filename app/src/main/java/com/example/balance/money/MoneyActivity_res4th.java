package com.example.balance.money;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class MoneyActivity_res4th extends AppCompatActivity {

    private TextView res_textView_money7;
    private TextView res_textView_money8;
    private int voteResult_money7_res;
    private int voteResult_money8_res;
    private Button res_button_money6;
    private Button res_button_money7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_res4th);

        setTitle("결과");

        res_textView_money7 = findViewById(R.id.textView_money7);
        res_textView_money8 = findViewById(R.id.textView_money8);
        res_button_money6 = findViewById(R.id.res_button_money6);
        res_button_money7 = findViewById(R.id.res_button_money7);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_money7_res = pref.getInt("voteResult_money7_res", 0);
        voteResult_money8_res = pref.getInt("voteResult_money8_res", 0);

        res_textView_money7.setText(voteResult_money7_res + "표");
        res_textView_money8.setText(voteResult_money8_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_money6.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity_res4th.this , MoneyActivity_res5th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        res_button_money7.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity_res4th.this , MoneyActivity_res5th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
