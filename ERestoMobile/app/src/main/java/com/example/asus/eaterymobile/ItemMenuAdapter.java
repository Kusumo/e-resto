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
public class ItemMenuAdapter extends ArrayAdapter {

    Activity activity;
    String[] namaMakanan;
    String[] hargaMakanan;

    public ItemMenuAdapter(Menu menu, String[] namaMakanan, String[] hargaMakanan){
        super(menu,R.layout.activity_menu_item,namaMakanan);
        this.activity = menu;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    public ItemMenuAdapter(ShowMenu menu, String[] namaMakanan, String[] hargaMakanan){
        super(menu,R.layout.activity_menu_item,namaMakanan);
        this.activity = menu;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_menu_item,null,true);

        TextView textNamaMenu = (TextView)v.findViewById(R.id.textNamaMenu);
        TextView textHargaMenu = (TextView)v.findViewById(R.id.textHargaMenu);

        textNamaMenu.setText(namaMakanan[position]);
        textHargaMenu.setText("Rp. "+hargaMakanan[position]);

        return v;
    }
}
