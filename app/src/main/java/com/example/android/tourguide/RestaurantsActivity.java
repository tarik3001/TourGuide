package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Location> restaurants = new ArrayList<Location>();

        restaurants.add(new Location(getString(R.string.legume),getString(R.string.legume_address)));
        restaurants.add(new Location(getString(R.string.casbah),getString(R.string.casbah_address)));
        restaurants.add(new Location(getString(R.string.thai_place_restaurant),
                getString(R.string.thai_place_restaurant_address)));
        restaurants.add(new Location(getString(R.string.the_melting_pot),
                getString(R.string.the_malting_pot_address)));

        LocationAdapter adapter = new LocationAdapter(this, restaurants);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
