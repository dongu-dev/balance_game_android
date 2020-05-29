package com.example.balance.love;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity_res2nd extends AppCompatActivity {

    private TextView res_textView3;
    private TextView res_textView4;
    private int voteResult3_res;
    private int voteResult4_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_res1st);

        setTitle("결과");

        res_textView3 = findViewById(R.id.textView3);
        res_textView4 = findViewById(R.id.textView4);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult3_res = pref.getInt("voteResult3_res", 0);
        voteResult4_res = pref.getInt("voteResult4_res", 0);

        res_textView3.setText(voteResult3_res + "표");
        res_textView4.setText(voteResult4_res + "표");
    }
}
