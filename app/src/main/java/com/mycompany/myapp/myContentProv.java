package com.mycompany.myapp;
import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.net.*;
import android.text.TextUtils;
public class myContentProv extends ContentProvider
{
	public static final Uri CONTENT_URI = Uri.parse("content://com.mycompany.listProvider/lists");
	public static final String KEY_ID ="_id";
	public static final String KEY_TITLE ="title";
	public static final String KEY_CREATION_DATE="creation_date";
	public static final String KEY_SECURED_STATE ="security_state";
	public static final int ALL_ROWS =1;
	public static final int SINGLE_ROW =2;
	
	private static final UriMatcher uriMatchere;
	static{
		uriMatchere = new UriMatcher(UriMatcher.NO_MATCH);
		uriMatchere.addURI("com.mycompany.listProvider" , "lists" , ALL_ROWS);
		uriMatchere.addURI("com.mycompany.listProvider" , "lists/#" , SINGLE_ROW);
	}
    private mySQliteOpenHelper myOpenHelper;
	@Override
	public boolean onCreate()
	{
		myOpenHelper = new mySQliteOpenHelper(getContext(), mySQliteOpenHelper.DATABASE_NAME, null, mySQliteOpenHelper.DATABASE_VERSION);
		// TODO: Implement this method
		return true;
	}

	@Override
	public String getType(Uri p1)
	{
		switch(uriMatchere.match(p1)){
			case ALL_ROWS: return "vnd.android.cursor.dir/vnd.mycompany.Lists";
			case SINGLE_ROW: return "vnd.android.cursor.item/vnd.mycompany.Lists";
			default: throw new IllegalArgumentException("Unsupported Uri: "+ p1);
		}
		// TODO: Implement this method
		
	}

	@Override
	public Cursor query(Uri p1, String[] p2, String p3, String[] p4, String p5)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public Uri insert(Uri p1, ContentValues p2)
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public int delete(Uri p1, String p2, String[] p3)
	{
		// TODO: Implement this method
		return 0;
	}

	@Override
	public int update(Uri p1, ContentValues p2, String p3, String[] p4)
	{
		// TODO: Implement this method
		return 0;
	}

public static class mySQliteOpenHelper extends SQLiteOpenHelper{
	private static final String DATABASE_NAME ="listDatabase.db";
	private static final int  DATABASE_VERSION =1;
	private static final String DATABASE_TABLE = "listTable";
	private static final String DATABASE_CREATE = "create table" + DATABASE_TABLE + " (" +KEY_ID + " integer primary key autoincrement, "+ 
	KEY_TITLE + " text not null, " + KEY_SECURED_STATE + " boolean " + KEY_CREATION_DATE + "long);";
	
	public mySQliteOpenHelper(Context context, String name, CursorFactory factory, int versione){
		super(context,name,factory,versione);
	}

	@Override
	public void onCreate(SQLiteDatabase p1)
	{
		p1.execSQL(DATABASE_CREATE);
		// TODO: Implement this method
	}

	@Override
	public void onUpgrade(SQLiteDatabase p1, int p2, int p3)
	{
		p1.execSQL("DROP TABLE IF IT EXISTS  " + DATABASE_TABLE);
		onCreate(p1);
		// TODO: Implement this method
	}


	
}


	
	


	
}
