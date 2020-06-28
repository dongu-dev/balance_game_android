package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class SubjectActivity_res4th extends AppCompatActivity {

    private TextView res_textView_subject7;
    private TextView res_textView_subject8;
    private int voteResult_subject7_res;
    private int voteResult_subject8_res;
    private Button res_button_subject6;
    private Button res_button_subject7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_res4th);

        setTitle("결과");

        res_textView_subject7 = findViewById(R.id.textView_subject7);
        res_textView_subject8 = findViewById(R.id.textView_subject8);
        res_button_subject6 = findViewById(R.id.res_button_subject6);
        res_button_subject7 = findViewById(R.id.res_button_subject7);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_subject7_res = pref.getInt("voteResult_subject7_res", 0);
        voteResult_subject8_res = pref.getInt("voteResult_subject8_res", 0);

        res_textView_subject7.setText(voteResult_subject7_res + "표");
        res_textView_subject8.setText(voteResult_subject8_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_subject6.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity_res4th.this , SubjectActivity_res5th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_subject7.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity_res4th.this , SubjectActivity_res5th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
