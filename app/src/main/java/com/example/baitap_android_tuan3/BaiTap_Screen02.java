package com.example.baitap_android_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BaiTap_Screen02 extends AppCompatActivity {

    Button btnXanh1,btnDo,btnDen,btnXanh2;
    ImageView imgXanh;
    TextView tvMau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap__sc02);

        btnXanh1 = findViewById(R.id.btnXanh1);
        btnDo = findViewById(R.id.btnDo);
        btnDen = findViewById(R.id.btnDen);
        btnXanh2 = findViewById(R.id.btnXanh2);

        imgXanh = findViewById(R.id.imgXanh);

        tvMau = findViewById(R.id.tvMau);

        btnXanh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                imgXanh.setImageResource(R.drawable.vsmart_live_xanh);
//                tvMau.setText("Màu: xanh");
                Intent intent = new Intent(BaiTap_Screen02.this,BaiTap_Screen03.class);
                intent.putExtra("mau",1);
                startActivity(intent);

            }
        });
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                imgXanh.setImageResource(R.drawable.vs_red_a);
//                tvMau.setText("Màu: đỏ");
                Intent intent = new Intent(BaiTap_Screen02.this,BaiTap_Screen03.class);
                intent.putExtra("mau",2);
                startActivity(intent);

            }
        });
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                imgXanh.setImageResource(R.drawable.vsmart_black_star);
//                tvMau.setText("Màu: đen");
                Intent intent = new Intent(BaiTap_Screen02.this,BaiTap_Screen03.class);
                intent.putExtra("mau",3);
                startActivity(intent);

            }
        });

    }
}