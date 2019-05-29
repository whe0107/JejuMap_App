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

    Double PosMap[][] = {{33.454724, 126.565135}};
    Double PosPark[][] = {{33.454357, 126.565124}};
    Double PosFood[][] = {{33.460361, 126.561738},{33.460745, 126.560997},{33.460324, 126.561921},{33.460305, 126.561227},{33.460307, 126.562043},
            {33.460362, 126.561954},{33.460717, 126.561472}, {33.460651, 126.561863}, {33.460620, 126.561093}, {33.460604, 126.561395}, {33.460373, 126.562133}, {33.460623, 126.561112}, {33.460331, 126.561550},
            {33.460639, 126.561719}, {33.460222, 126.560971}, {33.460294, 126.561489}, {33.460388, 126.562383}, {33.460386, 126.562300}};
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
            LatLng MainFood  = new LatLng(PosFood[Info2][0], PosFood[Info2][1]);
            for(int a = 0; a < 18; a++){
                AddnewMarker(Info, a);
            }
            mMap.moveCamera(CameraUpdateFactory.newLatLng(MainFood));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(MainFood,19));
        }
        else if(Info == 4){
            LatLng MainPC  = new LatLng(PosPC[Info2][0], PosPC[Info2][1]);
            for(int a = 0; a < 6; a++){
                AddnewMarker(Info, a);
            }
            mMap.moveCamera(CameraUpdateFactory.newLatLng(MainPC));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(MainPC,19));
        }

    }

    public void AddnewMarker(int in, int a){
        LatLng NewMark = null;
        if(in == 3) NewMark = new LatLng(PosFood[a][0], PosFood[a][1]);
        else if(in == 4) NewMark = new LatLng(PosPC[a][0], PosPC[a][1]);
        if(NewMark != null){
            mMap.addMarker(new MarkerOptions().position(NewMark));
        }
        mMap.setOnMarkerClickListener(this);
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
            Intent intent = new Intent(MapsActivity.this, foodinfo.class);
            intent.putExtra("FoodI",Mid+1);
            startActivity(intent);
        }
        else if(Info == 4){
            Intent intent = new Intent(MapsActivity.this, pcinfo.class);
            intent.putExtra("PCI",Mid+1);
            startActivity(intent);
        }
        return true;
    }
}