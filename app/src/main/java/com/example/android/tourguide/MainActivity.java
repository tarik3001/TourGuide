package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView parks = (TextView) findViewById(R.id.parks);
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(parksIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView stadiums = (TextView) findViewById(R.id.stadiums);
        stadiums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stadiumsIntent = new Intent(MainActivity.this, StadiumsActivity.class);
                startActivity(stadiumsIntent);
            }
        });

        TextView universities = (TextView) findViewById(R.id.universities);
        universities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent universitiesIntent = new Intent(MainActivity.this, UniversitiesActivity.class);
                startActivity(universitiesIntent);
            }
        });


    }
}
