package com.example.balance.love;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.MainActivity;
import com.example.balance.R;

public class LoveActivity_seven extends AppCompatActivity {

    private ImageButton imageButton15;
    private ImageButton imageButton16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_seven);

        imageButton15 = findViewById(R.id.imageButton15);
        imageButton16 = findViewById(R.id.imageButton16);

        imageButton15.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                imageButton15.setImageResource(R.drawable.love15_color);

                Intent intent = new Intent(LoveActivity_seven.this , MainActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });

        imageButton16.setOnClickListener(new View.OnClickListener() {
            // onClick 을 실행했을 때
            @Override
            public void onClick(View v) {

                imageButton16.setImageResource(R.drawable.love16_color);

                Intent intent = new Intent(LoveActivity_seven.this , MainActivity.class);
                startActivity(intent); // 액티비티 이동하는 구문이다.
            }
        });
    }
}
