package com.example.asus.eaterymobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ShowMenu extends AppCompatActivity implements View.OnClickListener {

    Button checkOutButton, voiceOrder;
    ListView listOrder;

    String[] namaOrder, hargaOrder;

    String[] namaMakanan = {"Nasi Goreng","Mie Goreng","Es Teh Manis","Teh Manis Hangat"};
    String[] hargaMakanan = {"10000","10000","5000","5000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_menu);

        listOrder = (ListView) findViewById(R.id.listMenuOrder);

        checkOutButton = (Button)findViewById(R.id.buttonCheckoutOrder);
        voiceOrder = (Button)findViewById(R.id.buttonVoiceOrder);

        ItemMenuAdapter adapter = new ItemMenuAdapter(this, namaMakanan, hargaMakanan);

        listOrder.setAdapter(adapter);

        checkOutButton.setOnClickListener(this);
        voiceOrder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == checkOutButton){
            startActivity(new Intent(getApplicationContext(),Checkout.class));
        }
    }
}
