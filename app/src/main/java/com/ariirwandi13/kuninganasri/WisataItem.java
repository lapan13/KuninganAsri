package com.ariirwandi13.kuninganasri;

import android.os.Parcel;
import android.os.Parcelable;

public class WisataItem implements Parcelable {
    public static final Creator<WisataItem> CREATOR = new Creator<WisataItem>() {
        @Override
        public WisataItem createFromParcel(Parcel in) {
            return new WisataItem(in);
        }

        @Override
        public WisataItem[] newArray(int size) {
            return new WisataItem[size];
        }
    };
    private int mImageResource;
    private String mTextNama;
    private String mTextHarga;
    private String mTextAlamat;

    public WisataItem(int imageResource, String nama, String harga, String alamat) {
        mImageResource = imageResource;
        mTextNama = nama;
        mTextHarga = harga;
        mTextAlamat = alamat;
    }

    protected WisataItem(Parcel in) {
        mImageResource = in.readInt();
        mTextNama = in.readString();
        mTextHarga = in.readString();
        mTextAlamat = in.readString();
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getNama() {
        return mTextNama;
    }

    public String getHarga() {
        return mTextHarga;
    }

    public String getAlamat() {
        return mTextAlamat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResource);
        dest.writeString(mTextNama);
        dest.writeString(mTextHarga);
        dest.writeString(mTextAlamat);
    }
}

