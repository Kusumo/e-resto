package com.example.asus.eaterymobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class Menu extends AppCompatActivity implements View.OnClickListener {

    Button makeOrder, voice;
    ListView listMenu;

    String[] namaMakanan = {"Nasi Goreng","Mie Goreng","Es Teh Manis","Teh Manis Hangat"};
    String[] hargaMakanan = {"10000","10000","5000","5000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        makeOrder = (Button)findViewById(R.id.buttonMakeOrder);
        voice = (Button)findViewById(R.id.buttonMenuMain);

        listMenu = (ListView)findViewById(R.id.listMenu);

        ItemMenuAdapter adapterMenu = new ItemMenuAdapter(this,namaMakanan,hargaMakanan);

        listMenu.setAdapter(adapterMenu);

        makeOrder.setOnClickListener(this);
        voice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == makeOrder){
            startActivity(new Intent(getApplicationContext(),ShowMenu.class));
        } else {
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
    }
}
