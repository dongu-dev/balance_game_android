package com.example.balance.money;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;
import com.example.balance.friends.FriendsActivity_res2nd;

public class MoneyActivity_res1st extends AppCompatActivity {

    private TextView res_textView_money1;
    private TextView res_textView_money2;
    private int voteResult_money1_res;
    private int voteResult_money2_res;
    private Button res_button_money1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_res1st);

        setTitle("결과");

        res_textView_money1 = findViewById(R.id.textView_money1);
        res_textView_money2 = findViewById(R.id.textView_money2);
        res_button_money1 = findViewById(R.id.res_button_friends1);

        SharedPreferences pref = getSharedPreferences("pref", MODE_PRIVATE);
        voteResult_money1_res = pref.getInt("voteResult_money1_res", 0);
        voteResult_money2_res = pref.getInt("voteResult_money2_res", 0);

        res_textView_money1.setText(voteResult_money1_res + "표");
        res_textView_money2.setText(voteResult_money2_res + "표");

        // btn_sa 를 클릭했을 때 onClick 메소드를 실행을 시켜라
        res_button_money1.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity_res1st.this , MoneyActivity_res2nd.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
