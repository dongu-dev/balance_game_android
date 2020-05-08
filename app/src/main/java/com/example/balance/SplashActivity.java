package com.example.balance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
    // 앱 처음시작 화면 만들기
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
