package com.ariirwandi13.kuninganasri;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("Deskripsi");

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, R.color.colorPrimary));

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
