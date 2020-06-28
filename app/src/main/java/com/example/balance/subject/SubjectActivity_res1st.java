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

public class SubjectActivity_res1st extends AppCompatActivity {

    private TextView res_textView_subject1;
    private TextView res_textView_subject2;
    private int voteResult_subject1_res;
    private int voteResult_subject2_res;
    private Button res_button_subject1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_res1st);

        setTitle("결과");

        res_textView_subject1 = findViewById(R.id.textView_subject1);
        res_textView_subject2 = findViewById(R.id.textView_subject2);
        res_button_subject1 = findViewById(R.id.res_button_subject1);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_subject1_res = pref.getInt("voteResult_subject1_res", 0);
        voteResult_subject2_res = pref.getInt("voteResult_subject2_res", 0);

        res_textView_subject1.setText(voteResult_subject1_res + "표");
        res_textView_subject2.setText(voteResult_subject2_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_subject1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubjectActivity_res1st.this , SubjectActivity_res2nd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
