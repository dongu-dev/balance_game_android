package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_res5th extends AppCompatActivity {

    private TextView res_textView_friends9;
    private TextView res_textView_friends10;
    private int voteResult_friends9_res;
    private int voteResult_friends10_res;
    private Button res_button_friends8;
    private Button res_button_friends9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_res5th);

        setTitle("결과");

        res_textView_friends9 = findViewById(R.id.textView_friends9);
        res_textView_friends10 = findViewById(R.id.textView_friends10);
        res_button_friends8 = findViewById(R.id.res_button_friends8);
        res_button_friends9 = findViewById(R.id.res_button_friends9);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_friends9_res = pref.getInt("voteResult_friends9_res", 0);
        voteResult_friends10_res = pref.getInt("voteResult_friends10_res", 0);

        res_textView_friends9.setText(voteResult_friends9_res + "표");
        res_textView_friends10.setText(voteResult_friends10_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends8.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res5th.this , FriendsActivity_res6th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends9.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res5th.this , FriendsActivity_res6th.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
