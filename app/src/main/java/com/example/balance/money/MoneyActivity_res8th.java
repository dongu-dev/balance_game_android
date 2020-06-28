package com.example.balance.money;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.MainActivity;
import com.example.balance.R;

public class MoneyActivity_res8th extends AppCompatActivity {

    private TextView res_textView_money15;
    private TextView res_textView_money16;
    private int voteResult_money15_res;
    private int voteResult_money16_res;
    private Button res_button_money14;
    private Button res_button_money15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_res8th);

        setTitle("결과");

        res_textView_money15 = findViewById(R.id.textView_money15);
        res_textView_money16 = findViewById(R.id.textView_money16);
        res_button_money14 = findViewById(R.id.res_button_money14);
        res_button_money15 = findViewById(R.id.res_button_money15);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_money15_res = pref.getInt("voteResult_money15_res", 0);
        voteResult_money16_res = pref.getInt("voteResult_money16_res", 0);

        res_textView_money15.setText(voteResult_money15_res + "표");
        res_textView_money16.setText(voteResult_money16_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_money14.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity_res8th.this , MainActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        res_button_money15.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity_res8th.this , MainActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
