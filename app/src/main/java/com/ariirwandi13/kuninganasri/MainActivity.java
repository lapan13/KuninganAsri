package com.ariirwandi13.kuninganasri;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<WisataItem> mWisataList;
    private RecyclerView mRecyclerView;
    private WisataAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createWisataList();
        buildRecyclerView();
    }

    public void createWisataList() {
        mWisataList = new ArrayList<>();
        mWisataList.add(new WisataItem(R.drawable.bukit_panembongan, "Bukit Panembongan", "Line 2", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.taman_kuning, "Taman Kuning Kebun Raya", "Line 4", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.salsabila, "Taman Rekreasi Salsabila", "Line 6", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.curug_putri, "Curug Putri", "Line 2", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.pemandian_cibulan, "Pemandian Cibulan", "Line 4", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.terapi_ikan, "Kolam Terapi Ikan Cigugur", "Line 6", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.pasebantripancatunggal, "Paseban Tri Panca Tunggal", "Line 2", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.taman_purbakala, "Taman Purbakala Cipari", "Line 4", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.hutan_mayasih, "Hutan Kota Mayasih", "Line 6", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.recreation_park, "The Mountain Recreation Park", "Line 2", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.perkemahan, "Bumi Perkemahan Palutungan", "Line 4", "aaa"));
        mWisataList.add(new WisataItem(R.drawable.taman_nasional_ciremai, "Taman Nasional Gunung Ciremai", "Line 6", "aaa"));


    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new WisataAdapter(mWisataList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new WisataAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("Example Item", mWisataList.get(position));

                startActivity(intent);
            }
        });
    }
}
