package com.example.android.cacaktourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class GeographyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);

        ExpandableTextView expandableTextView;

        String longText="The city of Čačak is in the western part of central Serbia, 144 km south of the capital city, Belgrade. The nearest international border is with Bosnia and Hercegovina. Within the Moravica District, it has all the characteristics of the main center. Situated mostly in the western area of the flow of the West Morava river, it connects the hills of Šumadija in the north and higher regions of the interior to the south. These mountains incline in a gentle and wavy way toward the Čačak valley, the town and the Morava River. The city administrative area covers 636 square kilometres (246 sq mi) and contains:\n" +
                "\n" +
                "    Čačak valley with an altitude between 204 and 300 m (669 and 984 ft)\n" +
                "    Hills between 300 and 500 m (980 and 1,640 ft) high and\n" +
                "    Mountains Ovčar (985 m) (W), Kablar (889 m) (W), Jelica (929 m) (S) and Vujan (857 m) (NE).\n" +
                "\n" +
                "A humid continental climate brings an average temperature of 10.47 °C (50.85 °F) with 74.1% humidity, warm summers and cold winters. Winds come from the north and northeast, rarely from the west because of the mountains that block them. The average temperature in August is 22 °C (72 °F), while in January it is 0.5 °C (32.9 °F). There are, on average, 38 days with snow during the year. The average wind speed is 2.3 metres per second (5.1 mph). The usual number of foggy days is 54. There are a few recorded instances of Sahara desert sand making its way to the town via winds, when it caused problems for the town's population, especially in traffic. Average yearly precipitation is 735 mm (28.9 in).";


            expandableTextView =(ExpandableTextView) findViewById(R.id.expandable_text_view);

            expandableTextView.setText(longText);



            }




    }




