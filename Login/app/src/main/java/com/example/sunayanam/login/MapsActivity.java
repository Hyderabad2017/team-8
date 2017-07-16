package com.example.sunayanam.login;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button buttonname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        buttonname = (Button) findViewById(R.id.blood_banks);
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
        LatLng hyderabad = new LatLng(17.3850, 78.4867);
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(17.3850, 78.4867);
        final Button button = (Button) findViewById(R.id.blood_banks);
        button.setOnClickListener(new View.OnClickListener()
                                  {
                                      public void onClick(View view)
                                      {
                                          mMap.addMarker(new MarkerOptions().position(new LatLng(17.411893, 78.449841)).title("Aarohi Blood Bank"));
                                          mMap.addMarker(new MarkerOptions().position(new LatLng(17.369101, 78.480125)).title("Thalassemia society"));
                                          mMap.addMarker(new MarkerOptions().position(new LatLng(17.424460, 78.501737)).title("Gandhi Hospital"));
                                          mMap.addMarker(new MarkerOptions().position(new LatLng(17.398946, 78.461101)).title("Nilofer Hospital"));
                                      }
                                  }
        );
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(hyderabad,12));

    }
}
