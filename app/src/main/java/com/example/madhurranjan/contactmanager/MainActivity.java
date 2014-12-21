package com.example.madhurranjan.contactmanager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import java.util.logging.ConsoleHandler;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.example.madhurranjan.MESSAGE";
    public final static String NAME = "com.example.madhurranjan.NAME";
    public final static String EMAIL = "com.example.madhurranjan.EMAIL";
    public final static String ADDRESS = "com.example.madhurranjan.ADDRESS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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



    public void registerDetails(View view){
        Intent intent = new Intent(this, PersonalDetails.class);
        EditText name = (EditText) findViewById(R.id.personName);
        EditText address = (EditText) findViewById(R.id.address);
        EditText emailId = (EditText) findViewById(R.id.emailId);
        String personName = name.getText().toString();
        String personAddress = address.getText().toString();
        String personEmail =  emailId.getText().toString();

        Log.d("mainactivity",personName);

        Log.d("mainactivity",personAddress);

        Log.d("mainactivity",personEmail);
        intent.putExtra(NAME,personName);
        intent.putExtra(ADDRESS,personAddress);
        intent.putExtra(EMAIL,personEmail);

        startActivity(intent);
    }
}
