package com.example.madhurranjan.contactmanager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.logging.ConsoleHandler;


public class MainActivity extends ActionBarActivity {
/*
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



    /*public void registerDetails(View view){
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

    public void showTime(View view) {
        RadioGroup rg = (RadioGroup) findViewById(R.id.time);
        Log.d("Mainactivity", String.valueOf(rg.getCheckedRadioButtonId()));
        String timeValue= "";
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
        Calendar cal = Calendar.getInstance(timeZone);
        
        switch(rg.getCheckedRadioButtonId()) {
            case R.id.timeInGMT:
                df.setTimeZone(timeZone);
                timeValue = df.format(cal.getTime());
                Log.d("MainActivity", timeValue);
                break;
            case R.id.timeInIST:
                df.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
                timeValue = df.format(cal.getTime());
                Log.d("Mainactivity","TimeinIST");
                break;
            case R.id.timeInEST:
                df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
                timeValue = df.format(cal.getTime());
                Log.d("Mainactivity","TimeinPST");
                break;
            default:
                Log.d("Mainactivity","noop");
        }
        Toast.makeText(this, timeValue,Toast.LENGTH_LONG).show();
        rg.clearCheck();
    }


}*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SqliteHelper db = new SqliteHelper(this);

        /**
         * CRUD Operations
         * */
        // Inserting Contacts
        Log.d("Insert: ", "Inserting ..");
        db.addContact(new Contact("Ravi", "9100000000"));
        db.addContact(new Contact("Srinivas", "9199999999"));
        db.addContact(new Contact("Tommy", "9522222222"));
        db.addContact(new Contact("Karthik", "9533333333"));

        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn : contacts) {
            String log = "Id: " + cn.getID() + " ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }

    @Override
    protected void onResume() {
       // datasource.open();
        super.onResume();
    }

    @Override
    protected void onPause() {
       // datasource.close();
        super.onPause();
    }

    public void onClick(View view) {
        Log.d("Mainactivity","hello");
    }
}
