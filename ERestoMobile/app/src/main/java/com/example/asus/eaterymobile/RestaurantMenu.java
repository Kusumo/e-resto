package com.example.asus.eaterymobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.*;
import android.view.MenuItem;

/**
 * Created by hari sabardi on 19/12/2017.
 */

public class RestaurantMenu extends AppCompatActivity implements NavigationView.
        OnNavigationItemSelectedListener, View.OnClickListener {

    Button buttonEditMenu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout)
                findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView)
                findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        buttonEditMenu = (Button)findViewById(R.id.buttonEditMenu);
        buttonEditMenu.setOnClickListener(this);
    }



    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return false;
    }


    @Override
    public void onClick(View v) {
        if(v == buttonEditMenu){
            startActivity(new Intent(getApplicationContext(),RestaurantMenuEdit.class));
        }
    }
}
