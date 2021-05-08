package com.example.baitap_android_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BaiTap_Screen01 extends AppCompatActivity {

    Button btnMau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baitap_sc01);

        Intent intent = getIntent();
        Log.e("loi", String.valueOf(intent));
        btnMau = findViewById(R.id.btnMau);

        btnMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaiTap_Screen01.this,BaiTap_Screen02.class);
                startActivity(intent);
            }
        });
    }
}