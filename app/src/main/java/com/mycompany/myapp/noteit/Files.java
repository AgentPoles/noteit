package com.mycompany.myapp.noteit;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.os.*;
import android.app.ActionBar;
import android.widget.*;
import java.util.*;
public class Files extends Activity
{

	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.filles);
		ActionBar adbar = getActionBar();
		adbar.hide();
		ListView lis = (ListView)findViewById(R.id.lis);

		lis.setAdapter(MainActivity.adapt);
	}

	
	
}
