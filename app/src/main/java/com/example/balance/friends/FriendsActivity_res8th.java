package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.MainActivity;
import com.example.balance.R;

public class FriendsActivity_res8th extends AppCompatActivity {

    private TextView res_textView_friends15;
    private TextView res_textView_friends16;
    private int voteResult_friends15_res;
    private int voteResult_friends16_res;
    private Button res_button_friends14;
    private Button res_button_friends15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_res8th);

        setTitle("결과");

        res_textView_friends15 = findViewById(R.id.textView_friends15);
        res_textView_friends16 = findViewById(R.id.textView_friends16);
        res_button_friends14 = findViewById(R.id.res_button_friends14);
        res_button_friends15 = findViewById(R.id.res_button_friends15);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_friends15_res = pref.getInt("voteResult_friends15_res", 0);
        voteResult_friends16_res = pref.getInt("voteResult_friends16_res", 0);

        res_textView_friends15.setText(res_textView_friends15 + "표");
        res_textView_friends16.setText(res_textView_friends16 + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends14.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res8th.this , MainActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends15.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res8th.this , MainActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
