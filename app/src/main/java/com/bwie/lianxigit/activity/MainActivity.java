package com.bwie.lianxigit.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.androidyuan.lib.screenshot.ScreenShotActivity;
import com.bwie.lianxigit.R;

public class MainActivity extends AppCompatActivity {

    /**
     * iewufyaewio;jsdiouf9ew8ur9ew
     * saodfyuewdfhsodc
     * seifhwedfjsol
     */
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn_go);
        //实现跳转   开始截屏
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScreenShotActivity.class));
            }
        });

    }
}
