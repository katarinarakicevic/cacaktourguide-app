package com.example.android.cacaktourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void openAboutList (View view) {
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }

    public void openSightseeingList (View view) {
        Intent i = new Intent(this, SightseeingActivity.class);
        startActivity(i);
    }

    public void openPlacesList (View view) {
        Intent i = new Intent(this, PlacesActivity.class);
        startActivity(i);
    }
    public void openCafesList (View view) {
        Intent i = new Intent(this, CafesActivity.class);
        startActivity(i);
    }

    public void openGaleryList (View view) {
        Intent i = new Intent(this, GalleryActivity.class);
        startActivity(i);
    }
    public void openPhonesList (View view) {
        Intent i = new Intent(this, PhonesActivity.class);
        startActivity(i);
    }

}
