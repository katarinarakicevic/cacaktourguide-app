package com.example.android.cacaktourguide;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class HistoryActivity extends AppCompatActivity{
    TextView descText;
    ImageButton show, hide;
    TextView descText1;
    ImageButton show1,hide1;
    TextView descText2;
    ImageButton show2,hide2;
    TextView descText3;
    ImageButton show3,hide3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        descText = (TextView) findViewById(R.id.description_text1);
        show = (ImageButton) findViewById(R.id.show);
        show.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Show button");
                show.setVisibility(View.INVISIBLE);
                hide.setVisibility(View.VISIBLE);
                descText.setMaxLines(Integer.MAX_VALUE);

            }
        });
        hide = (ImageButton) findViewById(R.id.hide);
        hide.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Hide button");
                hide.setVisibility(View.INVISIBLE);
                show.setVisibility(View.VISIBLE);
                descText.setMaxLines(5);

            }
        });

        descText1 = (TextView) findViewById(R.id.text_two);
        show1 = (ImageButton) findViewById(R.id.id_show1);
        show1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Show button");
                show1.setVisibility(View.INVISIBLE);
                hide1.setVisibility(View.VISIBLE);
                descText1.setMaxLines(Integer.MAX_VALUE);

            }
        });
        hide1 = (ImageButton) findViewById(R.id.hide_button1);
        hide1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Hide button");
                hide1.setVisibility(View.INVISIBLE);
                show1.setVisibility(View.VISIBLE);
                descText1.setMaxLines(5);

            }
        });
        descText2 = (TextView) findViewById(R.id.text_four);
        show2 = (ImageButton) findViewById(R.id.id_show3);
        show2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Show button");
                show2.setVisibility(View.INVISIBLE);
                hide2.setVisibility(View.VISIBLE);
                descText2.setMaxLines(Integer.MAX_VALUE);

            }
        });

        hide2 = (ImageButton) findViewById(R.id.hide_button3);
        hide2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Hide button");
                hide2.setVisibility(View.INVISIBLE);
                show2.setVisibility(View.VISIBLE);
                descText2.setMaxLines(5);

            }
        });

        descText3 = (TextView) findViewById(R.id.text_six);
        show3 = (ImageButton) findViewById(R.id.id_show5);
        show3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Show button");
                show3.setVisibility(View.INVISIBLE);
                hide3.setVisibility(View.VISIBLE);
                descText3.setMaxLines(Integer.MAX_VALUE);

            }
        });
        hide3 = (ImageButton) findViewById(R.id.hide_button5);
        hide3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Hide button");
                hide3.setVisibility(View.INVISIBLE);
                show3.setVisibility(View.VISIBLE);
                descText3.setMaxLines(5);

            }
        });
    }

}