package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class FriendsActivity_res2nd extends AppCompatActivity {

    private TextView res_textView_friends3;
    private TextView res_textView_friends4;
    private int voteResult_friends3_res;
    private int voteResult_friends4_res;
    private Button res_button_friends2;
    private Button res_button_friends3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_res2nd);

        setTitle("결과");

        res_textView_friends3 = findViewById(R.id.textView_friends3);
        res_textView_friends4 = findViewById(R.id.textView_friends4);
        res_button_friends2 = findViewById(R.id.res_button_friends2);
        res_button_friends3 = findViewById(R.id.res_button_friends3);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_friends3_res = pref.getInt("voteResult_friends3_res", 0);
        voteResult_friends4_res = pref.getInt("voteResult_friends4_res", 0);

        res_textView_friends3.setText(voteResult_friends3_res + "표");
        res_textView_friends4.setText(voteResult_friends4_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends2.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res2nd.this , FriendsActivity_res3rd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends3.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res2nd.this , FriendsActivity_res3rd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
