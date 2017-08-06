package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class UniversitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Location> universities = new ArrayList<Location>();

        universities.add(new Location(getString(R.string.carnegie_mellon_university),
                getString(R.string.carnegie_mellon_university_address)));
        universities.add(new Location(getString(R.string.duquesne),
                getString(R.string.duquesne_address)));
        universities.add(new Location(getString(R.string.point_park),
                getString(R.string.point_park_address)));
        universities.add(new Location(getString(R.string.chatam),
                getString(R.string.chatam_university)));
        universities.add(new Location(getString(R.string.carlow),
                getString(R.string.carlow_address)));;


        LocationAdapter adapter = new LocationAdapter(this, universities);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
