package com.example.balance.money;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class MoneyActivity_res3rd extends AppCompatActivity {

    private TextView res_textView_money5;
    private TextView res_textView_money6;
    private int voteResult_money5_res;
    private int voteResult_money6_res;
    private Button res_button_money4;
    private Button res_button_money5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_res3rd);

        setTitle("결과");

        res_textView_money5 = findViewById(R.id.textView_money5);
        res_textView_money6 = findViewById(R.id.textView_money6);
        res_button_money4 = findViewById(R.id.res_button_money4);
        res_button_money5 = findViewById(R.id.res_button_money5);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_money5_res = pref.getInt("voteResult_money5_res", 0);
        voteResult_money6_res = pref.getInt("voteResult_money6_res", 0);

        res_textView_money5.setText(voteResult_money5_res + "표");
        res_textView_money6.setText(voteResult_money6_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_money4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity_res3rd.this , MoneyActivity_res3rd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        res_button_money5.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity_res3rd.this , MoneyActivity_res3rd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
