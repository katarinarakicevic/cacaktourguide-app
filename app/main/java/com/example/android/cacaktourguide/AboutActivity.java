package com.example.android.cacaktourguide;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void openTopList(View view) {
        Intent i = new Intent(this, ScrollingActivity.class);
        startActivity(i);
    }

    public void openGeographyList(View view) {
        Intent i = new Intent(this, GeographyActivity.class);
        startActivity(i);
    }

    public void openHistoryList(View view) {
        Intent i = new Intent(this, HistoryActivity.class);
        startActivity(i);
    }

    public void openSettlementsList (View view) {
        Intent i = new Intent(this, SettlementsActivity.class);
        startActivity(i);
    }

    public void openPeopleList (View view) {
        Intent i = new Intent(this, PeopleActivity.class);
        startActivity(i);
    }

    public void openSocietyList (View view) {
        Intent i = new Intent(this, SocietyActivity.class);
        startActivity(i);
    }
}
