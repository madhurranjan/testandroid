package com.example.madhurranjan.contactmanager;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class PersonalDetails extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME);
        String email = intent.getStringExtra(MainActivity.EMAIL);
        String address = intent.getStringExtra(MainActivity.ADDRESS);
        Log.d("PersonalDetails", name );
        Log.d("PersonalDetails", email );
        Log.d("PersonalDetails", address );

        TextView tv = new TextView(this);

        tv.setTextSize(100);
        tv.setTextColor(Color.BLUE);
        tv.setTextSize(25);
        tv.setText("Name: " + name + " Address: " + address + " Email: " + email);
        setContentView(tv);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
