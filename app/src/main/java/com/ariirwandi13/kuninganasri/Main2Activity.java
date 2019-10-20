package com.ariirwandi13.kuninganasri;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderView;

public class Main2Activity extends AppCompatActivity {

    SliderView sliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitleEnabled(false);
        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, R.color.colorPrimary));

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        setTitle("");

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        sliderView = findViewById(R.id.image_activity2);

        final SliderAdapter adapter = new SliderAdapter(this);
        adapter.setCount(5);

        sliderView.setSliderAdapter(adapter);
        sliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                sliderView.setCurrentPagePosition(position);
            }
        });

        Intent intent = getIntent();
        WisataItem wisataItem = intent.getParcelableExtra("Example Item");

        int imageRes = wisataItem.getImageResource();
        String nama = wisataItem.getNama();
        String harga = wisataItem.getHarga();
        String alamat = wisataItem.getAlamat();
        String desc = wisataItem.getDesc();

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

        if (item.getItemId() == android.R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
