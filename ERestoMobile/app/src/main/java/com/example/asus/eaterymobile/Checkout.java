package com.example.asus.eaterymobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Checkout extends AppCompatActivity implements View.OnClickListener {

    Button backMain;
    TextView total;
    ListView checkList;
    int subTotal = 0;

    String[] namaMakanan = {"Nasi Goreng", "Es Teh Manis"};
    String[] jumlahMakanan = {"2","2"};
    String[] hargaMakanan = {"10000","5000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        backMain = (Button)findViewById(R.id.buttonOut);
        total = (TextView)findViewById(R.id.textTotal);
        checkList = (ListView)findViewById(R.id.listCheckout);

        ItemCheckoutAdapter adapter = new ItemCheckoutAdapter(this,namaMakanan,
                jumlahMakanan,hargaMakanan);

        checkList.setAdapter(adapter);

        for(int i = 0;i < jumlahMakanan.length;i++){
            for(int j = 0;j < hargaMakanan.length;j++){
                if(i == j){
                    subTotal = subTotal +
                            (Integer.parseInt(jumlahMakanan[i]) * Integer.parseInt(hargaMakanan[j]));
                }
            }
        }

        total.setText("Rp." + subTotal);

        backMain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == backMain){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
    }
}
