package com.mycompany.myapp;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.app.*;
import java.util.*;
import android.os.*;
import android.widget.*;


public class PhonesReceiver extends BroadcastReceiver
{
	Context context;
	Intent newIntent;
	@Override
	public void onReceive(Context p1, Intent p2)
	{
		
		
		//if(isRunning(p1)){
		// TODO: Implement this method
	
		 newIntent = new Intent("com.mycompany.myapp.MyActivity");
		newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		

		p1.startActivity(newIntent);
	
}
}