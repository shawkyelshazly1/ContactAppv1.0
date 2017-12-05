package com.example.android.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> contactsReceiver = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bundle getData = getIntent().getExtras();
        Contact contactInfo = getData.getParcelable("Contact");
        contactsReceiver.add(contactInfo);
        AddContactAdapter adapter = new AddContactAdapter(MainActivity.this,contactsReceiver);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_bar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.addContact:
                startActivity(new Intent(this,AddContact.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
