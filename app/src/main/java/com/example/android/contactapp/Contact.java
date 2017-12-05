package com.example.android.contactapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Veronica on 12/3/2017.
 */

public class Contact implements Parcelable {

    private String mName;
    private int mNumber;

    public Contact(String name,int number){
        mName = name;
        mNumber = number;
    }

    protected Contact(Parcel in) {
        mName = in.readString();
        mNumber = in.readInt();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public String getName(){
        return mName;
    }

    public int getNumber(){
        return mNumber;
    }

    public void setName(String name){
        mName = name;
    }

    public void setNumber(int number){
        mNumber = number;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mName);
        parcel.writeInt(mNumber);
    }
}
