package com.example.emartin.criminalintent;


import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.emartin.criminalintent.CrimeDbSchema.CrimeTable;

import java.util.Date;
import java.util.UUID;

//wrapper class to wrap a cursor from one place and add new methods on top of it
public class CrimeCursorWrapper extends CursorWrapper{

    public CrimeCursorWrapper(Cursor cursor){
        super(cursor);
    }

    public Crime getCrime(){
        String uuidString = getString(getColumnIndex(CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOLVED));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);

        return crime;
    }

}
