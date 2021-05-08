package com.example.baitap_android_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BaiTap_Screen03 extends AppCompatActivity {

    Button btnXanh1,btnDo,btnDen,btnXanh2,btnXong;
    ImageView imgXanh,img1;
    TextView tvMau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap__sc03);

        btnXanh1 = findViewById(R.id.btnXanh1);
        btnDo = findViewById(R.id.btnDo);
        btnDen = findViewById(R.id.btnDen);
        btnXanh2 = findViewById(R.id.btnXanh2);
        btnXong = findViewById(R.id.btnXong);

        imgXanh = findViewById(R.id.imgXanh);

        Intent intent = getIntent();
        int mau = intent.getIntExtra("mau",0);
        if(mau == 1){
            imgXanh.setImageResource(R.drawable.vsmart_live_xanh);
        }else if(mau == 2){
            imgXanh.setImageResource(R.drawable.vs_red_a);
        }else{
            imgXanh.setImageResource(R.drawable.vsmart_black_star);
        }

        tvMau = findViewById(R.id.tvMau);

        img1 = findViewById(R.id.img4);

        btnXanh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgXanh.setImageResource(R.drawable.vsmart_live_xanh);
                Log.e("Gia Tri xanh: ", String.valueOf(imgXanh.getId()));
                tvMau.setText("Màu: xanh");
            }
        });
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgXanh.setImageResource(R.drawable.vs_red_a);
                tvMau.setText("Màu: đỏ");
            }
        });
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgXanh.setImageResource(R.drawable.vsmart_black_star);
                Log.e("Gia Tri den: ", String.valueOf(imgXanh.getId()));
                tvMau.setText("Màu: đen");
            }
        });
        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BaiTap_Screen03.this,BaiTap_Screen04.class);
                Log.e("Gia Tri: ", String.valueOf(imgXanh.getDrawable()));
                Log.e("Gia Tri 2: ", String.valueOf(R.drawable.vsmart_black_star));
                Log.e("Gia Tri 3: ", String.valueOf(R.drawable.vsmart_live_xanh));
                Log.e("Gia Tri 4: ", String.valueOf(R.drawable.vs_red_a));
                Log.e("Gia Tri 5: ", String.valueOf(imgXanh.getId()));
                intent.putExtra("mau", String.valueOf(imgXanh.getDrawable()));
                startActivity(intent);
            }
        });

    }
}