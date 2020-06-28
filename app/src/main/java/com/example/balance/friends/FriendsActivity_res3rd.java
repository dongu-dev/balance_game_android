package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_res3rd extends AppCompatActivity {

    private TextView res_textView_friends5;
    private TextView res_textView_friends6;
    private int voteResult_friends5_res;
    private int voteResult_friends6_res;
    private Button res_button_friends4;
    private Button res_button_friends5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_res3rd);

        setTitle("결과");

        res_textView_friends5 = findViewById(R.id.textView_friends5);
        res_textView_friends6 = findViewById(R.id.textView_friends6);
        res_button_friends4 = findViewById(R.id.res_button_friends4);
        res_button_friends5 = findViewById(R.id.res_button_friends5);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_friends5_res = pref.getInt("voteResult_friends5_res", 0);
        voteResult_friends6_res = pref.getInt("voteResult_friends6_res", 0);

        res_textView_friends5.setText(voteResult_friends5_res + "표");
        res_textView_friends6.setText(voteResult_friends6_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends4.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res3rd.this , FriendsActivity_res4th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends5.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res3rd.this , FriendsActivity_res4th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
