package com.example.balance.love;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_res1st extends AppCompatActivity {

    private TextView res_textView3;
    private TextView res_textView4;
    private int voteResult3_res;
    private int voteResult4_res;
    private Button res_button2;
    private Button res_button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res1st);

        setTitle("결과");

        res_textView3 = findViewById(R.id.textView3);
        res_textView4 = findViewById(R.id.textView4);
        res_button2 = findViewById(R.id.res_button2);
        res_button3 = findViewById(R.id.res_button3);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult3_res = pref.getInt("voteResult3_res", 0);
        voteResult4_res = pref.getInt("voteResult4_res", 0);

        res_textView3.setText(voteResult3_res + "표");
        res_textView4.setText(voteResult4_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res1st.this , LoveActivity_res.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button3.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoveActivity_res1st.this , LoveActivity_res2nd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
