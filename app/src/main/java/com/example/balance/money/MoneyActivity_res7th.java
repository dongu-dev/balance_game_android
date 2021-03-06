package com.example.balance.money;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class MoneyActivity_res7th extends AppCompatActivity {

    private TextView res_textView_money13;
    private TextView res_textView_money14;
    private int voteResult_money13_res;
    private int voteResult_money14_res;
    private Button res_button_money12;
    private Button res_button_money13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_res7th);

        setTitle("결과");

        res_textView_money13 = findViewById(R.id.textView_money13);
        res_textView_money14 = findViewById(R.id.textView_money14);
        res_button_money12 = findViewById(R.id.res_button_money12);
        res_button_money13 = findViewById(R.id.res_button_money13);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_money13_res = pref.getInt("voteResult_money13_res", 0);
        voteResult_money14_res = pref.getInt("voteResult_money14_res", 0);

        res_textView_money13.setText(voteResult_money13_res + "표");
        res_textView_money14.setText(voteResult_money14_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_money12.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity_res7th.this , MoneyActivity_res8th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        res_button_money13.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity_res7th.this , MoneyActivity_res8th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
