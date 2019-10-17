package com.ariirwandi13.kuninganasri;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        WisataItem wisataItem = intent.getParcelableExtra("Example Item");

        int imageRes = wisataItem.getImageResource();
        String nama = wisataItem.getNama();
        String harga = wisataItem.getHarga();
        String alamat = wisataItem.getAlamat();
        String desc = wisataItem.getDesc();

        ImageView imageView = findViewById(R.id.image_activity2);
        imageView.setImageResource(imageRes);

        TextView tvNama = findViewById(R.id.tv_nama2);
        tvNama.setText(nama);

        TextView tvHarga = findViewById(R.id.tv_harga2);
        tvHarga.setText(harga);

        TextView tvAlamat = findViewById(R.id.tv_alamat2);
        tvAlamat.setText(alamat);

        TextView tvDesc = findViewById(R.id.tv_deskripsi2);
        tvDesc.setText(desc);
    }
}
