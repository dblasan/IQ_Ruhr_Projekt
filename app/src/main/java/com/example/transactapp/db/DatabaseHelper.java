package com.example.transactapp.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static DatabaseHelper dataHelper;
    private static final String DATABASE_NAME = "Umfrage.db";
    private static final String DATABASE_NAME1 = "MultpleChoice.db";

    private static final String TABLE_NAME1 = "Fragenkatalog1";
    private static final String COL_2 = "Fragennummer";
    private static final String COL_3 = "Themenbereich";
    private static final String COL_33 = "Fragetext";
    private static final String COL_4 = "InhaltderFrage";
    private static final String COL_5 = "Antwortbutton";
    private static final String COL_6 = "AntwortWAHR";
    private static final String COL_7 = "AntwortNICHTWAHR";
    private static final String COL_8 = "Gewichtung";


    private static final String TABLE_NAME2 = "Fragenkatalog2";
    private static final String COL_22 = "Fragennummer";
    private static final String COL_333 = "Themenbereich";
    private static final String COL_3333 = "Fragetext";
    private static final String COL_44 = "InhaltderFrage";
    private static final String COL_55 = "Antwortbutton";
    private static final String COL_66 = "AntwortWAHR";
    private static final String COL_77 = "AntwortNICHTWAHR";
    private static final String COL_88 = "Gewichtung";
    SQLiteDatabase sqlitedb;
    long result;
    String rv;
    private static final String LOG_TAG = DatabaseHelper.class.getSimpleName();

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME1, null, 1);
        sqlitedb = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(LOG_TAG, "new create");
        db.execSQL("CREATE TABLE " + TABLE_NAME1 + " (" + COL_2 + " INTEGER, " + COL_3 + " TEXT, " + COL_33 + " TEXT, " + COL_4 + " TEXT, "
                + COL_5 + " TEXT, " + COL_6 + " TEXT, " + COL_7 + " TEXT, " + COL_8 + " INTEGER)");
        Log.d(LOG_TAG, "Debug Firt Table      - Meldung.");

        db.execSQL("CREATE TABLE " + TABLE_NAME2 + " (" + COL_22 + " INTEGER, " + COL_333 + " TEXT, " + COL_3333 + " TEXT, " + COL_44 + " TEXT, "
                + COL_55 + " TEXT, " + COL_66 + " TEXT, " + COL_77 + " TEXT, " + COL_88 + " INTEGER)");
        Log.d(LOG_TAG, "Debug Firt Table      - Meldung.");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        onCreate(db);
    }
    public String get_Datarows_by_Criteria(String a){
        SQLiteDatabase db = this.getWritableDatabase();
        String sSQL = "SELECT * FROM Fragenkatalog1  WHERE AntwortWAHR =?";;
        Cursor data = db.rawQuery(sSQL, new String[]{a});
        if (data.moveToFirst()) { //<<<< Move to the first row (should only be 1)
             rv = data.getString(data.getColumnIndex("AntwortWAHR"));
            Log.d("Row" + rv, "found");

        }
        return rv;
    }
    // Getting All User data
    public List<KatalogData> getAllKatalogData() {
        List<KatalogData> contactList = new ArrayList<KatalogData>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_NAME1;
        // Open database for Read / Write
        final SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                KatalogData data = new KatalogData();
//                data.setFragnum(cursor.getString(0));
//                data.setThemenber(cursor.getString(1));
//                data.setInhaltder(cursor.getString(2));
                data.setAntwortbut(cursor.getString(3));
                data.setAntwortWAHR(cursor.getString(4));
                //data.setAntwortNICHTWAHR(cursor.getString(5));

                // Adding contact to list
                contactList.add(data);
                Log.d(LOG_TAG, "Gesamte Umfrage_Daten: " +data);

            } while (cursor.moveToNext());
        }
        cursor.close();
        // return user list
        return contactList;
    }

    public boolean saveResult(String fragnum, String Themenber, String Fragetext, String Inhaltder, String Antwortbut, String AntwortWAHR, String AntwortNICHTWAHR, int gewichtung) {
        sqlitedb = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(DatabaseHelper.COL_2, fragnum);
        cv.put(DatabaseHelper.COL_3, Themenber);
        cv.put(DatabaseHelper.COL_33, Fragetext);
        cv.put(DatabaseHelper.COL_4, Inhaltder);
        cv.put(DatabaseHelper.COL_5, Antwortbut);
        cv.put(DatabaseHelper.COL_6, AntwortWAHR);
        cv.put(DatabaseHelper.COL_7, AntwortNICHTWAHR);
        cv.put(DatabaseHelper.COL_8, gewichtung);
        result = sqlitedb.insert(DatabaseHelper.TABLE_NAME1, null, cv);
        Log.e("DATABASE OPERATION", "One row is insert");

        sqlitedb.close(); // Closing database connection

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean saveResult1(String fragnum, String Themenber, String Fragetext, String Inhaltder, String Antwortbut, String AntwortWAHR, String AntwortNICHTWAHR, int gewichtung) {
        sqlitedb = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(DatabaseHelper.COL_22, fragnum);
        cv.put(DatabaseHelper.COL_333, Themenber);
        cv.put(DatabaseHelper.COL_3333, Fragetext);
        cv.put(DatabaseHelper.COL_44, Inhaltder);
        cv.put(DatabaseHelper.COL_55, Antwortbut);
        cv.put(DatabaseHelper.COL_66, AntwortWAHR);
        cv.put(DatabaseHelper.COL_77, AntwortNICHTWAHR);
        cv.put(DatabaseHelper.COL_88, gewichtung);
        result = sqlitedb.insert(DatabaseHelper.TABLE_NAME2, null, cv);
        Log.e("DATABASE OPERATION", "One row is insert");

        sqlitedb.close(); // Closing database connection

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public boolean update(String antwortbutton, String fragenum) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_5, antwortbutton);
        contentValues.put(COL_2, fragenum);
        sqlitedb = this.getWritableDatabase();
        sqlitedb.update(TABLE_NAME1, contentValues, "Fragennummer=?", new String[] { fragenum });
        sqlitedb.close();
        return true;
    }

    public boolean updateAntwortJa(String antwortja, String fragenum) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_6, antwortja);
        contentValues.put(COL_2, fragenum);
        sqlitedb = this.getWritableDatabase();
        sqlitedb.update(TABLE_NAME1, contentValues, "Fragennummer=?", new String[] { fragenum });
        sqlitedb.close();
        return true;
    }

    public boolean updateAntwortJa1(String antwortja, String fragenum) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_6, antwortja);
        contentValues.put(COL_2, fragenum);
        sqlitedb = this.getWritableDatabase();
        sqlitedb.update(TABLE_NAME2, contentValues, "Fragennummer=?", new String[] { fragenum });
        sqlitedb.close();
        return true;
    }


    public void deleteUser(String Fragennummer) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME1, COL_2, new String[]{Fragennummer});
        db.close();
    }
    public void deleteRow(String value)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_NAME1+ " WHERE "+COL_2+"='"+value+"'");
        Log.i(LOG_TAG, "delete row");
        db.close();

    }
    public static synchronized DatabaseHelper getInstance(Context context) {
        // Use the application context, which will ensure that you
        // don't accidentally leak an Activity's context.
        // See this article for more information: http://bit.ly/6LRzfx
        if (dataHelper == null) {
            dataHelper = new DatabaseHelper(context.getApplicationContext());
        }
        return dataHelper;
    }

}
