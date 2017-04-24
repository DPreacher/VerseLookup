package ca.on.sl.comp208.assignment3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by DPreacher on 2017-04-17.
 */

public class DBManager extends SQLiteOpenHelper {
    private final static String DBName = "verseLookup.db";
    private final static int VERSION = 3;
    private Context context;

    public DBManager(Context context) {
        super(context, DBName, null, VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createString = "create TABLE " +
                DataContract.Bible.TABLE_NAME + " ( " +
                DataContract.Bible._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DataContract.Bible.BOOKNAME + " TEXT, " +
                DataContract.Bible.TITLE + " TEXT, " +
                DataContract.Bible.CHAPTER + " ";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
