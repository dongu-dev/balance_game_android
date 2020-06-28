package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.money.MoneyActivity_res4th;

public class SubjectActivity_res3rd extends AppCompatActivity {

    private TextView res_textView_subject5;
    private TextView res_textView_subject6;
    private int voteResult_subject5_res;
    private int voteResult_subject6_res;
    private Button res_button_subject4;
    private Button res_button_subject5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_res3rd);

        setTitle("결과");

        res_textView_subject5 = findViewById(R.id.textView_subject5);
        res_textView_subject6 = findViewById(R.id.textView_subject6);
        res_button_subject4 = findViewById(R.id.res_button_subject4);
        res_button_subject5 = findViewById(R.id.res_button_subject5);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_subject5_res = pref.getInt("voteResult_subject5_res", 0);
        voteResult_subject6_res = pref.getInt("voteResult_subject6_res", 0);

        res_textView_subject5.setText(voteResult_subject5_res + "표");
        res_textView_subject6.setText(voteResult_subject6_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_subject4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity_res3rd.this , SubjectActivity_res4th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_subject5.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity_res3rd.this , SubjectActivity_res4th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
