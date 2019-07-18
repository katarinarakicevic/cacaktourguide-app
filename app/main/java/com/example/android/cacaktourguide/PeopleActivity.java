package com.example.android.cacaktourguide;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PeopleActivity extends AppCompatActivity {
    // Array of strings...
    String[] peopleArray = {"Bora Đorđević (rock musician)",
            "Dragan Kićanović( former basketball player and coach, Olympic, World and European champion)"
            ,"Darko Lazović, football player",
            "Dragutin Gavrilović, military officer († 1945)",
            "Hadži Prodan Gligorijević, leader of the Hadži Prodan's Revolt († 1825)",
            "Filip Filipović, mathematician, revolutionary, first secretary of Communist party of Yugoslavia",
            "Luke Black, pop singer",
            "Miroslav Ilić, folk singer",
    "Mladomir Puriša Đorđević, film director and screenwriter",
            "Nadežda Petrović, painter († 1915)",
            "Serbian Patriarch Irinej, head of the Serbian Orthodox Church",
            "Sonja Savić, actress († 2008)",
            "Stepa Stepanović, general from Balkan Wars and World War I († 1929)",
            "Stracimir Zavidović, 12th-century Serbian noble that ruled West Morava († after 1189)",
            "Tanasko Rajić, captain in Second Serbian Uprising († 1815)",
             "Velimir Ilić, politician",
            "Vladislav Petković Dis, poet († 1917)",
            "Željko Obradović, former basketball player and coach, Olympic silver medalist, World, European and eight-time Euroleague champion"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview1, peopleArray);

        ListView listView = (ListView) findViewById(R.id.people_list);
        listView.setAdapter(adapter);
    }
}