package com.example.android.cacaktourguide;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PhonesActivity extends AppCompatActivity {
    // Array of strings...
    String[] phonesArray = {" Police: 192",
    "Firefighters: 193",
    "Ambulance: 194",
    "The exact time: 195",
    "Telephone Disturbance Report: 19771",
    "AMSS Information Center: 1987",
    "Subscriber Numbers: 988 11811",
   " Wake-up service: 19811",
            "Various Notifications: 19812",
            " Mobile Telephony of Serbia - MTS: 064 789",
            " Telenor: 063 9863",
            "VIP: 060 1234",
            "\n" +
                    "Pharmacy Čačak :\n"+"+381 (0)32 340 510",
            "General Hospital Čačak:\n" +
                    "+381 (0)32 374 222\n" +
                    "\n" +
                    "+381 (0)32 307 000",
            "Health Center Čačak:\n" +
                    "+381 (0)32 225 717",
"Bus station: \n"+"+381 32 (0)222 211 \n" +"  +381 (0)32 222 461",
            "\n" +
                    "Railroad station\n" +
                    "+381 (0)32 222 518",
            "Premier taxi\n" +
                    "+381 (0)32 5150 515",
            "Pink taxi\n" +
                    "+381 (0)32 320 640\n",
            "Best taxi\n" +
                    "+381 (0)32 377 773\n"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview2, phonesArray);

        ListView listView = (ListView) findViewById(R.id.phones_list);
        listView.setAdapter(adapter);
    }
}
