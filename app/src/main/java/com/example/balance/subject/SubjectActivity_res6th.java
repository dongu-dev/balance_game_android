package com.example.balance.subject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class SubjectActivity_res6th extends AppCompatActivity {

    private TextView res_textView_subject11;
    private TextView res_textView_subject12;
    private int voteResult_subject11_res;
    private int voteResult_subject12_res;
    private Button res_button_subject10;
    private Button res_button_subject11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_res6th);

        setTitle("결과");

        res_textView_subject11 = findViewById(R.id.textView_subject11);
        res_textView_subject12 = findViewById(R.id.textView_subject12);
        res_button_subject10 = findViewById(R.id.res_button_subject10);
        res_button_subject11 = findViewById(R.id.res_button_subject11);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_subject11_res = pref.getInt("voteResult_subject11_res", 0);
        voteResult_subject12_res = pref.getInt("voteResult_subject12_res", 0);

        res_textView_subject11.setText(voteResult_subject11_res + "표");
        res_textView_subject12.setText(voteResult_subject12_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_subject10.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity_res6th.this , SubjectActivity_res7th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_subject11.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity_res6th.this , SubjectActivity_res7th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
