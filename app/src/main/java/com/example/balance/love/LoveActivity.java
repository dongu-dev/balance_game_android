package com.example.balance.love;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.balance.R;

public class LoveActivity extends AppCompatActivity {

    private ImageButton imageButton1;
    private ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        imageButton1 = findViewById(R.id.imageButton1);
        imageButton2 = findViewById(R.id.imageButton2);


    }
}
