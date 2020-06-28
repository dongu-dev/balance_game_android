package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_res4th extends AppCompatActivity {

    private TextView res_textView_friends7;
    private TextView res_textView_friends8;
    private int voteResult_friends7_res;
    private int voteResult_friends8_res;
    private Button res_button_friends6;
    private Button res_button_friends7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_res4th);

        setTitle("결과");

        res_textView_friends7 = findViewById(R.id.textView_friends7);
        res_textView_friends8 = findViewById(R.id.textView_friends8);
        res_button_friends6 = findViewById(R.id.res_button_friends6);
        res_button_friends7 = findViewById(R.id.res_button_friends7);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_friends7_res = pref.getInt("voteResult_friends7_res", 0);
        voteResult_friends8_res = pref.getInt("voteResult_friends8_res", 0);

        res_textView_friends7.setText(voteResult_friends7_res + "표");
        res_textView_friends8.setText(voteResult_friends8_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends6.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res4th.this , FriendsActivity_res5th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends7.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res4th.this , FriendsActivity_res5th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
