package com.ariirwandi13.kuninganasri;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {

    private ArrayList<WisataItem> mWisataList;
    private OnItemClickListener mListener;

    public WisataAdapter(ArrayList<WisataItem> wisataList) {
        mWisataList = wisataList;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    @Override
    public WisataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.wisata_item, parent, false);
        WisataViewHolder evh = new WisataViewHolder(v, mListener);
        return evh;
    }

    @Override
    public void onBindViewHolder(WisataViewHolder holder, int position) {
        WisataItem currentItem = mWisataList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTvNama.setText(currentItem.getNama());
        holder.mTvHarga.setText(currentItem.getHarga());
        holder.mTvAlamat.setText(currentItem.getAlamat());
    }

    @Override
    public int getItemCount() {
        return mWisataList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public static class WisataViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTvNama;
        public TextView mTvHarga;
        public TextView mTvAlamat;

        public WisataViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTvNama = itemView.findViewById(R.id.tv_nama);
            mTvHarga = itemView.findViewById(R.id.tv_harga);
            mTvAlamat = itemView.findViewById(R.id.tv_alamat);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}

