package com.example.emartin.criminalintent;

//error p 258

//https://developer.android.com/training/basics/data-storage/databases.html
//https://developer.android.com/guide/topics/data/data-storage.html#db


public class CrimeDbSchema {

    public static final class CrimeTable {
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";

        }
    }

}
