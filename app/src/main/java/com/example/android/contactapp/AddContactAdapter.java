package com.example.android.contactapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Veronica on 12/3/2017.
 */

public class AddContactAdapter extends ArrayAdapter<Contact> {
    public AddContactAdapter(@NonNull Context context, ArrayList<Contact> contactList) {
        super(context,0,contactList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Contact contactInfo = getItem(position);
        View listView = convertView;
        if (listView == null)
        {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        TextView name = listView.findViewById(R.id.name_field);
        TextView number = listView.findViewById(R.id.number_field);
        name.setText(contactInfo.getName());
        number.setText("" + contactInfo.getNumber());
        return listView;
    }
}
