package com.example.android.cacaktourguide;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.cacaktourguide.R;
 import com.example.android.cacaktourguide.WelcomeActivity;

public class MainActivity extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);




    }

            public void openWelcomeList (View view) {
         Intent i = new Intent(this, WelcomeActivity.class);
               startActivity(i);
           }


}
