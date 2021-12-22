package com.mycompany.myapp.noteit;
import android.os.Bundle;
import android.content.Context;
import android.preference.PreferenceManager;
import android.preference.PreferenceActivity;
import android.content.*;
import android.location.*;
import android.widget.*;
public class myPreferenceActivity extends PreferenceActivity 
{
	static int mod = 0;
	public static final String checksec = "checksec";
	public static final String keysec ="keysec";
	public static final String keysecb = "keysecb";
	public static final String storageloc ="storageloc";
	public static final String selStorageKey ="selStorageKey";
  static boolean secure;
  static String passa;
  static String passb;
	static SharedPreferences prefs;
	static String passc;
	static String passd;
	static String locale;
	static Context context;
	static boolean secured;
 static  String Location;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.myappreferences);
		context = getApplicationContext();
		prefs = getSharedPreferences("com.mycompany.myapp.myPreferenceActivity",MODE_PRIVATE);
	}

public static void updatePreference(){
	//mod =0;
	//secured = secure;
	//passc = passa;
	//passd = passb;
	//locale =Location;
	
	//secure = prefs.getBoolean("checksec",false);
	passa = prefs.getString(keysec,"");
	//passb = prefs.getString("keysecb","");
	//Location =prefs.getString("storageloc","");
	//Toast.makeText(context,Location,Toast.LENGTH_LONG).show();
}
	
public void compare(){
	if((secure != secured)||!(passa.equals(passc))||!(passb.equals(passd))||!(locale.equals(Location))){
		 mod = 1;
	}
}
}
