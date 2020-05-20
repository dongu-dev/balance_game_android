package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.StatisticsActivity;

public class LoveActivity_res extends AppCompatActivity {

    private TextView res_textView1;
    private TextView res_textView2;
    private int int_voteResult1_res;
    private int int_voteResult2_res;
    private Button res_button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res);

        setTitle("결과");

        res_textView1 = findViewById(R.id.textView1);
        res_textView2 = findViewById(R.id.textView2);
        res_button1 = findViewById(R.id.res_button1);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        int_voteResult1_res = pref.getInt("int_voteResult1", 0);
        int_voteResult2_res = pref.getInt("int_voteResult2", 0);

        res_textView1.setText(int_voteResult1_res + "표");
        res_textView2.setText(int_voteResult2_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res.this , LoveActivity_res1st.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
