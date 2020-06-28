package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.money.MoneyActivity_res2nd;

public class SubjectActivity_res2nd extends AppCompatActivity {

    private TextView res_textView_subject3;
    private TextView res_textView_subject4;
    private int voteResult_subject3_res;
    private int voteResult_subject4_res;
    private Button res_button_subject2;
    private Button res_button_subject3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_res2nd);

        setTitle("결과");

        res_textView_subject3 = findViewById(R.id.textView_subject3);
        res_textView_subject4 = findViewById(R.id.textView_subject4);
        res_button_subject2 = findViewById(R.id.res_button_subject2);
        res_button_subject3 = findViewById(R.id.res_button_subject3);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_subject3_res = pref.getInt("voteResult_subject3_res", 0);
        voteResult_subject4_res = pref.getInt("voteResult_subject4_res", 0);

        res_textView_subject3.setText(voteResult_subject3_res + "표");
        res_textView_subject4.setText(voteResult_subject4_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_subject2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity_res2nd.this , SubjectActivity_res3rd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_subject3.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity_res2nd.this , SubjectActivity_res3rd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
