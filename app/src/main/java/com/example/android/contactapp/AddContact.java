package com.example.android.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddContact extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        final EditText nameField = findViewById(R.id.add_name_field);
        final EditText numberField = findViewById(R.id.add_number_field);


        Button addButton = findViewById(R.id.add_contact);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameField.getText().toString();
                int number = Integer.parseInt(numberField.getText().toString()) ;

                Intent passData = new Intent(AddContact.this,MainActivity.class);
                passData.putExtra("Contact",new Contact(name,number));


                startActivity(passData);


            }
        });
    }


}
