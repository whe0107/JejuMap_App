package com.example.activitymove;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener{

    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng Engineering4  = new LatLng(33.454724, 126.565135);
        mMap.addMarker(new MarkerOptions().position(Engineering4 ).title("공과대학 4호관"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Engineering4 ));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Engineering4 ,17));
        mMap.setOnMarkerClickListener(this);
    }


    public boolean onMarkerClick(Marker marker){
        Intent intent1 = new Intent(MapsActivity.this, buildinginfo.class);
        startActivity(intent1);
        return true;
    }
}
