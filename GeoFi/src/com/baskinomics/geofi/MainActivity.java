package com.baskinomics.geofi;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {

    // Member declaration
    private GoogleMap mGoogleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mGoogleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        // Enable My Location Layer
        mGoogleMap.setMyLocationEnabled(true);
    }

    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
    	// Inflate the menu items for use in the action bar
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.main_activity_actions, menu);
    	return super.onCreateOptionsMenu(menu);
	}
}
