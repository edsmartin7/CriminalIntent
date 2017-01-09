package com.example.emartin.criminalintent;


import android.database.Cursor;
import android.database.CursorWrapper;

//wrapper class to wrap a cursor from one place and add new methods on top of it
public class CrimeCursorWrapper extends CursorWrapper{

    public CrimeCursorWrapper(Cursor cursor){
        super(cursor);
    }

}
