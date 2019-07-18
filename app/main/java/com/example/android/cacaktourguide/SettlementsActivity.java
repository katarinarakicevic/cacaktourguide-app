package com.example.android.cacaktourguide;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettlementsActivity extends AppCompatActivity {
    // Array of strings...
    String[] townsArray = {"Atenica\n\n Atenica is a settlement in Serbia in the municipality of Cacak in the Moravian district. According to the 2011 census, there were 558 inhabitants.",
            "Gornja Trepca\n\n Gornja Trepca is a settlement in the City of Cacak in the Moravian district. According to the 2011 census, there were 556 inhabitants. The village is in the country and wider, most famous by the same name, also known as Atomic spa, and the whole village in 2011 was officially granted the status of a spa.",
            "Ljubic\n\n Ljubic is a settlement in Serbia in the municipality of Cacak in the Moravian district. According to the 2011 census, there were 61 inhabitants.",
            "Medjuvrsje\n\n Medjuvrsje is a settlement near Cacak and also the largest artificial lake in the West Morava, is located at the exit from the Ovcara-Kablar Gorge.",
            "Mrcajevci\n\n Mrčajevci is a settlement in Serbia in the municipality of Čačak in Moravički district. According to the 2011 census, there were 2767 inhabitants.\n" +
                    "\n" +
                    "Until 1965, this village was the seat of the Municipality of Mrcajevci, which consisted of populated places: Becanj, Bresnica, Donja Gorevnica, Donja Trepca, Gornja Trepca, Katrga, Mojsinje, Mrcajevci, Ostra, Stancici and Vujetinci. After the abolition of the municipality, the territory of the former municipality became a part of the municipality of Cacak.",
            "Ovcar spa\n Ovcar spa is located 17 km from Cacak, in the wooded part of Ovcar-Kablar gorge (under the protection of the state), through which the river West Morava flows. There are two artificial lakes on the river that are suitable for sport fishing. Natural healing factors:\n" +
                    "\n" +
                    "     1.thermal water temperature 36-38 ° C\n" +
                    "     2.microterminal climate\n" +
                    "     3.clean air and preserved flora and fauna\n" +
                    "\n" +
                    "Ovčar Banja is recommended for:\n" +
                    "\n" +
                    "     1.rheumatic diseases\n" +
                    "     2.degenerative rheumatism\n" +
                    "     3.arthrosis\n" +
                    "     4.spondylosis\n" +
                    "     5.consequences of bone fracture ",
            "Parmenac\n\n Parmenac is a settlement in Serbia in the municipality of Cacak in the Moravian district. According to the 2011 census, there were 744 inhabitants.",
            "Preljina\n\n Preljina is a settlement in Sumadija, which belongs to the Moravica district, or the municipality of Cacak. The number of inhabitants is 1840 (according to the 2011 census), according to the 2002 census there were 1801 inhabitants (according to the 1991 census there were 1744 inhabitants).\n" +
                    "\n" +
                    "It is located along the Ibarska magistral road, where the road is divided into three parts: Cacak (6 km) (E761 / 763), Gornji Milanovac (16 km), Belgrade (145 km) (E763) and Kraljevo (33 km) and Kragujevac (E761) (50 km).",
            "Trnava\n\n Trnava is a small town in the municipality of Čačak, Serbia. According to the 2002 census, the town has a population of 2913 people.",
            "There are also many  other settlements near Cacak that are not mentioned."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settlements);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, townsArray);

        ListView listView = (ListView) findViewById(R.id.towns_list);
        listView.setAdapter(adapter);
    }
}