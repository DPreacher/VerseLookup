package ca.on.sl.comp208.assignment3;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by DPreacher on 2017-04-17.
 */

public class ApiContentProvider extends ContentProvider {


    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
/*
        VerseData[] verses;
        int i=0;
        String text="";
        Gson gson = new Gson();
        HttpURLConnection urlConnection=null;
        String line;
        BufferedReader in = null;
        try {
            URL url = new URL(selection);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.setDoInput(true);
            urlConnection.connect();
            in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"UTF8"));
            while((line = in.readLine())!=null){
                i++;
                text += line;
                Log.d("passage","Loop"+i+", length = "+gson.fromJson(text,VerseData[].class).length+" = "+text.toString()+"");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        verses = gson.fromJson(text,VerseData[].class);
        MatrixCursor cursor = new MatrixCursor(new String[]{
                "_id",
                "bookname",
                "chapter",
                "verse",
                "text"
        });
        for (VerseData v:verses
             ) {


        }


        for(int x=0;x<verses.length;x++){
            cursor.addRow(new String[]{
                    String.valueOf(x),
                    verses[x].getBookname(),
                    String.valueOf(verses[x].getChapter()),
                    String.valueOf(verses[x].getVerse()),
                    verses[x].getText()
            });
        }
        /*
            URL url;
            HttpURLConnection urlConnection=null;
            try {
                url = new URL(params[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setReadTimeout(10000);
                urlConnection.setConnectTimeout(15000);
                urlConnection.setRequestMethod("GET");
                urlConnection.setDoInput(true);

                urlConnection.connect();

                        String[]Columns = {
                                DataContract.Bible._ID,
                                DataContract.Bible.BOOKNAME,
                                DataContract.Bible.TITLE,
                                DataContract.Bible.CHAPTER,
                                DataContract.Bible.VERSE,
                                DataContract.Bible.TEXT
                };*/
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
