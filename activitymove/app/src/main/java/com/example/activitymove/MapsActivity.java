package com.example.activitymove;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

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

    Double PosMap[][] = {{33.454724, 126.565135}};
    Double PosPark[][] = {{33.454357, 126.565124}};
    Double PosFood[][] = {{33.459487, 126.561210},{33.454724, 126.565135}};
    Double PosPC[][] = {{33.460257, 126.560999},{33.449194, 126.559364},{33.470149, 126.546394},{33.472898, 126.545295},{33.473357, 126.545061},{33.473557, 126.544329}};
    int Info = 0;
    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        Intent intentmap = getIntent();
        Info = intentmap.getIntExtra("info", 0);
        int Info2 = intentmap.getIntExtra("info2", 0);
        if (Info == 1){
            LatLng Engineering4  = new LatLng(PosMap[Info2][0], PosMap[Info2][1]);
            mMap.addMarker(new MarkerOptions().position(Engineering4 ).title("공과대학 4호관"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Engineering4 ));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Engineering4 ,17));
            mMap.setOnMarkerClickListener(this);
        }
        else if (Info == 2){
            LatLng ParkingEn4  = new LatLng(PosPark[Info2][0], PosPark[Info2][1]);
            mMap.addMarker(new MarkerOptions().position(ParkingEn4).title("공4 주차장"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(ParkingEn4));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ParkingEn4,17));
            mMap.setOnMarkerClickListener(this);
        }
        else if(Info == 3){
            LatLng imsi  = new LatLng(PosFood[Info2][0], PosFood[Info2][1]);
            mMap.addMarker(new MarkerOptions().position(imsi).title("임시임"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(imsi));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(imsi,17));
            mMap.setOnMarkerClickListener(this);
        }
        else if(Info == 4){
            LatLng MainPC  = new LatLng(PosPC[Info2][0], PosPC[Info2][1]);
            for(int a = 0; a < 6; a++){
                AddnewMarker(a);
            }
            mMap.moveCamera(CameraUpdateFactory.newLatLng(MainPC));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(MainPC,19));
        }

    }

    public void AddnewMarker(int a){
        LatLng PC = new LatLng(PosPC[a][0], PosPC[a][1]);
        mMap.addMarker(new MarkerOptions().position(PC));
        mMap.setOnMarkerClickListener(this);
    }
    public void PCmove(int a){
        if(a == 0){
            Intent intent = new Intent(MapsActivity.this, pcinfo1.class);
            startActivity(intent);
        }
        else if(a == 1){
            Intent intent = new Intent(MapsActivity.this, pcinfo2.class);
            startActivity(intent);
        }
        else if(a == 2){
            Intent intent = new Intent(MapsActivity.this, pcinfo3.class);
            startActivity(intent);
        }
        else if(a == 3){
            Intent intent = new Intent(MapsActivity.this, pcinfo4.class);
            startActivity(intent);
        }
        else if(a == 4){
            Intent intent = new Intent(MapsActivity.this, pcinfo5.class);
            startActivity(intent);
        }
        else if(a == 5){
            Intent intent = new Intent(MapsActivity.this, pcinfo6.class);
            startActivity(intent);
        }
    }
    public boolean onMarkerClick(Marker marker) {
        String MapId = marker.getId();
        String Id = MapId.substring(1);
        int Mid = Integer.parseInt(Id);
        if(Info == 1){
            Intent intent = new Intent(MapsActivity.this, buildinginfo.class);
            startActivity(intent);
        }
        else if(Info == 2){
            Intent intent = new Intent(MapsActivity.this, parkinginfo1.class);
            startActivity(intent);
        }
        else if(Info == 3){
        }
        else if(Info == 4){
            PCmove(Mid);
        }
        return true;
    }
}