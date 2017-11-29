package com.example.asus.eaterymobile;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        //SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
        //        .findFragmentById(R.id.map);
        //mapFragment.getMapAsync(this);
        setUpMapIfNeeded();
    }


    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    /*@Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
    */

    private void setUpMapIfNeeded(){
        if(mMap == null){
            mMap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            if(mMap != null){
                setUpMap();
            }
        }
    }

    private void setUpMap(){

        LatLng current = new LatLng(-6.3651691,106.8278709);
        mMap.addMarker(new MarkerOptions().position(current).title("You Are Here"));

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(current).zoom(15).bearing(0).tilt(0).build();

        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        LatLng otherRestaurant = new LatLng(-6.3644709,106.8283514);
        mMap.addMarker(new MarkerOptions().position(otherRestaurant).title("Kantin Fasilkom"));

        LatLng otherRestaurantA = new LatLng(-6.3643589,106.8279679);
        mMap.addMarker(new MarkerOptions().position(otherRestaurantA).title("Kantin FIB"));


    }
}
