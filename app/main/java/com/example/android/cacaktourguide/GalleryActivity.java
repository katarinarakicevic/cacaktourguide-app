package com.example.android.cacaktourguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView;

public class GalleryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(GalleryActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        activity();
                        break;
                    case 1:
                        activity1();
                        break;
                    case 2:
                        activity2();
                        break;
                    case 3:
                        activity3();
                        break;
                    case 4:
                        activity4();
                        break;
                    case 5:
                        activity5();
                        break;
                    case 6:
                        activity6();
                        break;
                    case 7:
                        activity7();
                        break;
                }


            }
        });
    }

    private void activity(){
        Intent myIntent1 = new Intent(GalleryActivity.this,Main2Activity.class);
        startActivity(myIntent1);

    }

    private void activity1(){
        Intent myIntent2 = new Intent(GalleryActivity.this,GalleryViewActivity.class);
        startActivity(myIntent2);

    }
    private void activity2(){
        Intent myIntent3 = new Intent(GalleryActivity.this,GalleryView2Activity.class);
        startActivity(myIntent3);

    }

    private void activity3(){
        Intent myIntent4 = new Intent(GalleryActivity.this,GalleryView3Activity.class);
        startActivity(myIntent4);

    }
    private void activity4(){
        Intent myIntent5 = new Intent(GalleryActivity.this,GalleryView4Activity.class);
        startActivity(myIntent5);

    }
    private void activity5(){
        Intent myIntent6 = new Intent(GalleryActivity.this,GalleryView5Activity.class);
        startActivity(myIntent6);

    }
    private void activity6(){
        Intent myIntent7 = new Intent(GalleryActivity.this,GalleryView6Activity.class);
        startActivity(myIntent7);

    }
    private void activity7(){
        Intent myIntent8 = new Intent(GalleryActivity.this,GalleryView7Activity.class);
        startActivity(myIntent8);

    }
}