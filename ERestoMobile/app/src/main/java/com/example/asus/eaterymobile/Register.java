package com.example.asus.eaterymobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button registerButton;
    RadioButton radioPelanggan, radioRestaurant;
    EditText namaUser,passUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerButton = (Button)findViewById(R.id.buttonRegisterSignUp);

        radioPelanggan = (RadioButton)findViewById(R.id.radioButton2);
        radioRestaurant = (RadioButton)findViewById(R.id.radioButton);

        namaUser = (EditText)findViewById(R.id.editRegisterName);
        passUser = (EditText)findViewById(R.id.editRegisterPassword);

        registerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == registerButton){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
    }
}
