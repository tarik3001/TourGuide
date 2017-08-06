package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StadiumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Location> stadiums = new ArrayList<Location>();

        stadiums.add(new Location(getString(R.string.ppg_paints_arena),
                getString(R.string.ppg_paints_arena_address),
                R.drawable.ppg_paints_arena));
        stadiums.add(new Location(getString(R.string.pnc_park),
                getString(R.string.pnc_park_address),
                R.drawable.pnc_park));
        stadiums.add(new Location(getString(R.string.heinz_field),
                getString(R.string.heinz_field_address),
                R.drawable.heinz_field));


        LocationAdapter adapter = new LocationAdapter(this, stadiums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}