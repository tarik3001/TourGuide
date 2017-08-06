package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        //Create list of Parks

        final ArrayList<Location> parks = new ArrayList<Location>();

        parks.add(new Location(getString(R.string.schenley_park),getString(R.string.schenley_park_address)));
        parks.add(new Location(getString(R.string.frick_park),getString(R.string.frick_park_address)));
        parks.add(new Location(getString(R.string.schenley_plaza),getString(R.string.schenley_plaza_address)));
        parks.add(new Location(getString(R.string.arsenal_park),getString(R.string.arsenal_park_address)));

        //Create a word adapter whose context is this class and creates a list of words parks.
        LocationAdapter adapter = new LocationAdapter(this, parks);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
