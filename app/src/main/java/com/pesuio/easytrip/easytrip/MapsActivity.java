package com.pesuio.easytrip.easytrip;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.DuplicateFormatFlagsException;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Bundle extras = getIntent().getExtras();
        Double latitude = (Double) extras.getDouble("lat");
        Double longitude = (Double) extras.getDouble("lon");
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            Toast.makeText(MapsActivity.this,"Not Null!",Toast.LENGTH_LONG);

        }
        Double latitude =(Double) extras.getDouble("lat");
        Double longitude =(Double) extras.getDouble("lon");
        LatLng sydney = new LatLng(latitude,longitude);
        mMap.addMarker(new MarkerOptions().position(sydney).title("My Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.addMarker(new MarkerOptions().position(new LatLng(12.943772, 77.536970)).title("Manjushree Upahar"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(12.943469, 77.541498)).title("Biriyani Cafe"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(12.943457, 77.543803)).title("Broadway Hotel"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(12.947250, 77.540511)).title("Just Bake"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(12.943230, 77.559977)).title("Mangala Hotel"));


    }
}
