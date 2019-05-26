package com.example.activitymove;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.common.server.converter.StringToIntConverter;
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

        Intent intentmap = getIntent();
        int Info = intentmap.getIntExtra("info", 0);
        int Info2 = intentmap.getIntExtra("info2", 0);

        if (Info == 1){
            LatLng Engineering4  = new LatLng(33.454724, 126.565135);
            mMap.addMarker(new MarkerOptions().position(Engineering4 ).title("공과대학 4호관"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Engineering4 ));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Engineering4 ,17));
            mMap.setOnMarkerClickListener(this);
        }
        else if (Info == 2){
            LatLng ParkingEn4  = new LatLng(33.454357, 126.565124);
            mMap.addMarker(new MarkerOptions().position(ParkingEn4).title("공4 주차장"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ParkingEn4));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ParkingEn4,17));
            mMap.setOnMarkerClickListener(this);
        }
        else if(Info == 3){
            LatLng PC1  = new LatLng(33.460257, 126.560999);
            mMap.addMarker(new MarkerOptions().position(PC1).title("제대PC방"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(PC1));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(PC1,18));
            mMap.setOnMarkerClickListener(this);
        }
        else{
            LatLng imsi  = new LatLng(33.459487, 126.561210);
            mMap.addMarker(new MarkerOptions().position(imsi).title("임시임"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(imsi));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(imsi,17));
            mMap.setOnMarkerClickListener(this);
        }


    }


    public boolean onMarkerClick(Marker marker) {
        String MapId = marker.getId();
        String Id = MapId.substring(1);
        int Mid = Integer.parseInt(Id);
        if(Mid == 0){
            Intent intent1 = new Intent(MapsActivity.this, pcinfo1.class);
            startActivity(intent1);
        }
        else{
            Intent intent2 = new Intent(MapsActivity.this, SubActivity3.class);
            startActivity(intent2 );
        }
        return true;
    }
}