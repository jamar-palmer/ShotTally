package com.jamarpalmer.shottally;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //global variables for views in activity
    TextView txtName;
    TextView txtRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign global variables their respective views
        txtName = findViewById(R.id.editTextName2);
        txtRoom = findViewById(R.id.txtRoomNum);


    }

    public void startRoom(View view) {
        //create intent to begin room
        Intent launchIntent = new Intent(MainActivity.this, DrinkActivity.class);
        startActivity(launchIntent);

    }
}