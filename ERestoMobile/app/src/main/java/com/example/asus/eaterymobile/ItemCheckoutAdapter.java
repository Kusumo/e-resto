package com.example.asus.eaterymobile;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Asus on 11/29/2017.
 */
public class ItemCheckoutAdapter extends ArrayAdapter {

    Activity activity;
    String[] namaMakanan, jumlahMakanan, hargaMakanan;

    public ItemCheckoutAdapter(Checkout check, String[] namaMakanan,
                               String[] jumlahMakanan, String[] hargaMakanan){
        super(check,R.layout.activity_show_checkout,namaMakanan);
        this.activity = check;
        this.jumlahMakanan = jumlahMakanan;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_show_checkout,null,true);

        TextView namaMakananShow = (TextView)v.findViewById(R.id.textNamaCheckout);
        TextView jumlahMakananShow = (TextView)v.findViewById(R.id.textJumlahCheckout);
        TextView hargaMakananShow = (TextView)v.findViewById(R.id.textHargaCheckout);

        namaMakananShow.setText(namaMakanan[position]);
        jumlahMakananShow.setText(jumlahMakanan[position]);
        hargaMakananShow.setText("Rp. "+hargaMakanan[position]);

        return v;
    }
}
