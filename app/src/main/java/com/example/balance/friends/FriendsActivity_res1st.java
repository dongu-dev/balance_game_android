package com.example.balance.friends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.love.LoveActivity_res1st;

public class FriendsActivity_res1st extends AppCompatActivity {

    private TextView res_textView_friends1;
    private TextView res_textView_friends2;
    private int voteResult_friends1_res;
    private int voteResult_friends2_res;
    private Button res_button_friends1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_res1st);

        setTitle("결과");

        res_textView_friends1 = findViewById(R.id.textView_friends1);
        res_textView_friends2 = findViewById(R.id.textView_friends2);
        res_button_friends1 = findViewById(R.id.res_button_friends1);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_friends1_res = pref.getInt("voteResult_friends1_res", 0);
        voteResult_friends2_res = pref.getInt("voteResult_friends2_res", 0);

        res_textView_friends1.setText(voteResult_friends1_res + "표");
        res_textView_friends2.setText(voteResult_friends2_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_friends1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FriendsActivity_res1st.this , FriendsActivity_res2nd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
