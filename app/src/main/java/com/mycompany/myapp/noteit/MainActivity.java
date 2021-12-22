package com.mycompany.myapp.noteit;
import android.app.Dialog;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.graphics.Color;
import android.text.*;
import com.*;
import android.view.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import android.content.res.*;
import  android.content.Context;
import android.preference.*;
import android.preference.PreferenceManager;
import android.graphics.drawable.*;
import java.util.zip.*;
import android.app.ActionBar;
import android.view.View.*;
import android.widget.RadioGroup.*;
import android.content.*;
import android.view.animation.*;
import java.util.*;
import android.widget.AutoCompleteTextView.*;

public class MainActivity extends Activity implements bcv.setiig, bcv.onSort
{
	ImageButton bere;
	ViewGroup container;
	Dialog m;
	String getit = "";
	int othersa = 0;
	int donk = 0;
	int diosa=0;
	int diosab =0;
	EditText text,bers;
	ArrayList<String> strung;
	  static String passowword ="";
	String candid;
	 String extension ="";
	String path;
	String coniv;
	String moniv;
	View r;
	int Secured =0;
	Dialog ki;
	int touchable =0;
	int goro = 0;
	LinearLayout laa, lab, checky, passy, kabe, kabeb, passed , kabec, entrol;
	TextView excla, dee,stor, pub, sece, secu, remove, bj, bjb, bjc;
	EditText enta, renta, entor, entra, beres;
	ImageView backiig, backeg;
	Button loc, donb, donbe, dond,donz, bifi, bise, bipro, bifib, biprob, biproc, bific, bifoc;
	FrameLayout of;
	CheckBox cbox;
	ImageButton ber;
	ScaleAnimation Rollin, Rollout;
	TranslateAnimation moverb, moverc;
	RotateAnimation mover;
	AlphaAnimation fadein , fadeout;
	final static ArrayList<Lists> record = new ArrayList<Lists>();
	static ListAdaprer adapt ;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Intent i = new Intent("com.mycompany.myapp.Files");
		startActivity(i);
		int resId = R.layout.viewe;
		bere = (ImageButton) findViewById(R.id.floatc);
		ber = (ImageButton) findViewById(R.id.floart);
		of = (FrameLayout) findViewById(R.id.of);
		ActionBar acbar = getActionBar();
		strung = new ArrayList<String>();
		strung.add(0," You have selected no file extension, ");
		strung.add(1," and");
		strung.add(2," You have not secured your file, ");
		strung.add(3,"If you proceed The Poles Framework would ");
		strung.add(4,"save your file as a basic text ");
		strung.add(5," and ");
		strung.add(6,"make this file public");
		acbar.setLogo(R.drawable.ic_launcher);
		acbar.setIcon(R.drawable.well);
		acbar.hide();
		acbar.setBackgroundDrawable(new ColorDrawable(Color.argb(100,60,5,3)));
	acbar.setHomeAsUpIndicator(R.drawable.ic_launcher);
		adapt = new ListAdaprer(this,resId,record);
		acbar.setDisplayHomeAsUpEnabled(true);
		acbar.setDisplayShowTitleEnabled(false);
		acbar.setDisplayUseLogoEnabled(true);
		  //acbar.setBackgroundDrawable(getResources().getDrawable(R.drawable.cit));
	    acbar.setLogo(android.R.drawable.btn_dialog);
		FragmentManager fl = getFragmentManager();
		FragmentTransaction ft = fl.beginTransaction();
		ft.add(R.id.frameb, new bcv());

		ft.add(R.id.framea, new fragB());
ft.commit();
SharedPreferences  prefs = PreferenceManager.getDefaultSharedPreferences(this);

		FrameLayout ged = (FrameLayout)findViewById(R.id.framea);
		ged.setVisibility(View.GONE);
		 
		//ced.setBackgroundColor(Color.TRANSPARENT);
		//ced.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
      Rollin = new ScaleAnimation(1,1,1,0);
	  Rollin.setDuration(600);
	Rollout = new ScaleAnimation(1,1,0,1);
	Rollout.setDuration(600);
	mover = new RotateAnimation(0,360);
	moverb = new TranslateAnimation(100,100,800,100);
	mover.setDuration(1000);
	moverb.setDuration(1000);
	moverb.setStartOffset(200);
	fadein = new AlphaAnimation(1,0);
	fadein.setDuration(800);
	fadeout = new AlphaAnimation(0,1);
	fadeout.setDuration(800);
	
	
	}

	
	public void sort(String m, String n)
	{
		coniv = m;
		moniv = n;
	}
	public void pronhk(String m, String n){
		try{
		FileOutputStream file = openFileOutput("my.txt",this.MODE_PRIVATE);
		OutputStreamWriter outpu = new OutputStreamWriter(file);
		outpu.write(m);
		outpu.flush();
		outpu.close();
		displaye("saved");
	File fi = getFilesDir();
	displaye(fi.getAbsolutePath());
	if(n.equals("")){n="No title";}
	else{}
	boolean secured;
	if(passowword.equals("")){
		secured=false;
	}
	else{ secured=true;}
	Lists nLis = new Lists(n,secured);
	if(passowword.equals("")){
		Secured=0;
	}
	else{Secured=1;}
	record.add(0,nLis);
	adapt.notifyDataSetChanged();
			Intent i = new Intent("com.mycompany.myapp.Files");
			startActivity(i);
		//myPreferenceActivity.updatePreference();
		}
		catch(IOException i){
			i.printStackTrace();
			displaye("not saved");
		}
		}
	TextWatcher renbaLisd= new TextWatcher(){

		@Override
		public void beforeTextChanged(CharSequence p1, int p2, int p3, int p4)
		{
			// TODO: Implement this method
		}

		@Override
		public void onTextChanged(CharSequence p1, int p2, int p3, int p4)
		{
			if(extension.equals("")&&passowword.equals("")){
				bj.setText(strung.get(0).toString()+strung.get(1).toString()+strung.get(2).toString()+strung.get(3).toString()+strung.get(4).toString()+strung.get(5).toString()+strung.get(6).toString());
			}
			else{
				if(passowword.equals("")){
					bj.setText(strung.get(0).toString()+strung.get(3).toString()+strung.get(4).toString());
					bifi.setVisibility(r.GONE);
				}
				if(extension.equals("")){
					bj.setText(strung.get(2).toString()+strung.get(3).toString()+strung.get(6).toString());
					bise.setVisibility(r.GONE);
				}
			}

			// TODO: Implement this method
		}


		@Override
		public void afterTextChanged(Editable p1)
		{
			// TODO: Implement this method
		}




	};
	TextWatcher renbaLis= new TextWatcher(){

		@Override
		public void beforeTextChanged(CharSequence p1, int p2, int p3, int p4)
		{
			// TODO: Implement this method
		}

		@Override
		public void onTextChanged(CharSequence p1, int p2, int p3, int p4)
		{
			if(extension.equals("")&&passowword.equals("")){
				bj.setText(strung.get(0).toString()+strung.get(1).toString()+strung.get(2).toString()+strung.get(3).toString()+strung.get(4).toString()+strung.get(5).toString()+strung.get(6).toString());
			}
			else{
				if(passowword.equals("")){
					bj.setText(strung.get(0).toString()+strung.get(3).toString()+strung.get(4).toString());
					bifi.setVisibility(r.GONE);
				}
				if(extension.equals("")){
					bj.setText(strung.get(2).toString()+strung.get(3).toString()+strung.get(6).toString());
					bise.setVisibility(r.GONE);
				}
			}
			
			// TODO: Implement this method
		}

		
		@Override
		public void afterTextChanged(Editable p1)
		{
			// TODO: Implement this method
		}

     
   
			
		};
	
	@Override
	public void onConfigurationChanged(Configuration newConfig)
	{
		// TODO: Implement this method

		Toast.makeText(getBaseContext(),"N",Toast.LENGTH_SHORT).show();
		if(newConfig.keyboardHidden== Configuration.KEYBOARDHIDDEN_NO){
			bere.setVisibility(View.INVISIBLE);
			Toast.makeText(getBaseContext(),"k",Toast.LENGTH_SHORT).show();
		}
		else{
			Toast.makeText(getBaseContext(),"N",Toast.LENGTH_SHORT).show();
			
		}
		if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){
			Toast.makeText(getBaseContext(),"N",Toast.LENGTH_SHORT).show();
		}
		if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
			Toast.makeText(getBaseContext(),"k",Toast.LENGTH_SHORT).show();
		}
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
	 super.onCreateOptionsMenu(menu);
	 createMenu(menu);
	 return true;
	}
	
	private void createMenu(Menu menu){
		;
		
		MenuItem menua = menu.add(0,0,0,"Search");{
			menua.setIcon(android.R.drawable.edit_text);
			menua.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		}
		
		
		MenuItem menu1 = menu.add(0,1,1,"undo");{
		menu1.setIcon(android.R.drawable.ic_media_previous);
		menu1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
	}
	MenuItem menu2 = menu.add(0,2,2,"redo");{
	
		menu2.setIcon(android.R.drawable.ic_media_rew);
		menu2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
	}
	MenuItem menu3 = menu.add(0,3,3,"linkify");{
		menu3.setIcon(android.R.drawable.ic_menu_edit);
		menu3.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
	}
	}
	public void setteready(int id){
		if(id!=5)
		{showDialog(id);}
		else{
			if(extension.equals("")&&passowword.equals("")){
				showDialog(5);
				//bj.setText(strung.get(0).toString()+strung.get(1).toString()+strung.get(2).toString()+strung.get(3).toString()+strung.get(4).toString()+strung.get(5).toString()+strung.get(6).toString());
			}
			else{
				if(passowword.equals("")){
					showDialog(3);
					//bj.setText(strung.get(0).toString()+strung.get(3).toString()+strung.get(4).toString());
					//bifi.setVisibility(r.GONE);
				}
				else{
				if(extension.equals("")){
					showDialog(4);
					//bj.setText(strung.get(2).toString()+strung.get(3).toString()+strung.get(6).toString());
					//bise.setVisibility(r.GONE);
				}
				else{
					pronhk(coniv, moniv);
				}
				}
			}
		}
	}
	
	
	protected Dialog onCreateDialog(int id){

		switch(id){
			case 0:{m = new Dialog(this);
			   m.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
			   m.getWindow().setLayout(350,430);
				m.getWindow().setBackgroundDrawable(new ColorDrawable(Color.rgb(60,5,3)));
				m.setContentView(R.layout.sette);
		
					Button Close = (Button)m.findViewById(R.id.close);
					Close.setOnClickListener(CloseListener);
					RadioGroup rad =(RadioGroup)m.findViewById(R.id.ragr);
					rad.setOnCheckedChangeListener(radListener);
					Button others = (Button)m.findViewById(R.id.others);
					Button ok= (Button)m.findViewById(R.id.ok);
					ok.setOnClickListener(okListener);
					others.setOnClickListener(othersListener);
					text = (EditText)m.findViewById(R.id.text);
					text.addTextChangedListener(textListener);
				return m;}
			
			case 1:{
				  Dialog i = new Dialog(this);
				  i.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
				  i.getWindow().setLayout(432,40);
				  i.setContentView(R.layout.rttt);
				  return i;
			}
			case 2:{
				Dialog j = new Dialog(this);
				j.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
				j.getWindow().setLayout(600,600);
				try{j.setContentView(R.layout.settings);
				}
				catch(Exception e){}
					loc =(Button)j.findViewById(R.id.loc);
					enta= (EditText)j.findViewById(R.id.enta);
					
					entra= (EditText)j.findViewById(R.id.entra);
					entor = (EditText)j.findViewById(R.id.entor);
					renta = (EditText)j.findViewById(R.id.renta);
					loc =(Button)j.findViewById(R.id.loc);
					donb =(Button)j.findViewById(R.id.donb);
					donbe =(Button)j.findViewById(R.id.donbe);
					dond =(Button)j.findViewById(R.id.dond);
					donz =(Button)j.findViewById(R.id.donz);
					checky =(LinearLayout)j.findViewById(R.id.checky);
					passy =(LinearLayout)j.findViewById(R.id.passy);
					passed =(LinearLayout)j.findViewById(R.id.passed);
					kabec =(LinearLayout)j.findViewById(R.id.kabec);
					laa=(LinearLayout)j.findViewById(R.id.laa);
					kabe=(LinearLayout)j.findViewById(R.id.kabe);
					kabeb=(LinearLayout)j.findViewById(R.id.kabeb);
					entrol=(LinearLayout)j.findViewById(R.id.entrol);
					lab =(LinearLayout)j.findViewById(R.id.lab);
					excla= (TextView)j.findViewById(R.id.excla);
					sece= (TextView)j.findViewById(R.id.sece);
					secu= (TextView)j.findViewById(R.id.secu);
					dee= (TextView)j.findViewById(R.id.dee);
					stor= (TextView)j.findViewById(R.id.stor);
					pub= (TextView)j.findViewById(R.id.pub);
					remove= (TextView)j.findViewById(R.id.remove);
					sece.setOnTouchListener(secListener);
					secu.setOnTouchListener(secListener);
					cbox = (CheckBox)j.findViewById(R.id.cbox);
					cbox.setOnTouchListener(cboxListener);
					donb.setOnClickListener(donbListener);
				    donbe.setOnClickListener(donbeListener);
					dond.setOnClickListener(dondListener);
					backiig =(ImageView)j.findViewById(R.id.backiig);
					backeg =(ImageView)j.findViewById(R.id.backeg);
					backiig.setOnTouchListener(backiigListener);
					backeg.setOnTouchListener(backegListener);
					remove.setOnTouchListener(removeListener);
					pub.setOnTouchListener(pubStorListener);
					stor.setOnTouchListener(pubStorListener);
					donz.setOnClickListener(donzListener);
					
					
				return j;
			}
			case 3: {
				ki = new Dialog(this);
					ki.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
					ki.getWindow().setLayout(800,800);
				ki.setContentView(R.layout.bjjkj);
				bj =(TextView)ki.findViewById(R.id.bj);
				bifi=(Button)ki.findViewById(R.id.bifi);
				bifi.setOnClickListener(bifListener);
					bers= (EditText)ki.findViewById(R.id.bers);
					//bers.addTextChangedListener(renbaLisd);
	            beres= (EditText)ki.findViewById(R.id.beres);
				//beres.addTextChangedListener(renbaLis);
			    bipro=(Button)ki.findViewById(R.id.bipro);
				bipro.setOnClickListener(biprobListener);
				displaye(passowword);
				diosa=3;
					ki.setOnDismissListener(allListener);
				return ki;
			}
			case 4: {
					 ki = new Dialog(this);
					ki.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
					ki.getWindow().setLayout(800,800);
					ki.setContentView(R.layout.passo);
					bjb =(TextView)ki.findViewById(R.id.bjb);
					bifib=(Button)ki.findViewById(R.id.bifib);
					//bise=(Button)ki.findViewById(R.id.bise);
					//bers= (EditText)ki.findViewById(R.id.bers);
					//bers.addTextChangedListener(renbaLisd);
					//beres= (EditText)ki.findViewById(R.id.beres);
					//beres.addTextChangedListener(renbaLis);
					bifib.setOnClickListener(bifcListener);
					biprob=(Button)ki.findViewById(R.id.biprob);
					displaye(passowword);
                    biprob.setOnClickListener(biprobListener);
                    diosa=4;
					ki.setOnDismissListener(allListener);
				
					return ki;}
					
			case 5: {
				    ki = new Dialog(this);
					ki.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
					ki.getWindow().setLayout(800,800);
					ki.setContentView(R.layout.passex);
					bjc =(TextView)ki.findViewById(R.id.bj);
					bific=(Button)ki.findViewById(R.id.bific);
					bific.setOnClickListener(bifcListener);
					bifoc=(Button)ki.findViewById(R.id.bifoc);
					bifoc.setOnClickListener(bifListener);
					//bers= (EditText)ki.findViewById(R.id.bers);
					//bers.addTextChangedListener(renbaLisd);
					//beres= (EditText)ki.findViewById(R.id.beres);
					//beres.addTextChangedListener(renbaLis);
					biproc=(Button)ki.findViewById(R.id.biproc);
					biproc.setOnClickListener(biprobListener);
					displaye(passowword);
                    diosa=5;
					ki.setOnDismissListener(allListener);
					return ki;
				}
		}
		
		return null;
	}
	TextWatcher textListener = new TextWatcher(){

		@Override
		public void beforeTextChanged(CharSequence p1, int p2, int p3, int p4)
		{
			// TODO: Implement this method
		}

		@Override
		public void onTextChanged(CharSequence p1, int p2, int p3, int p4)
		{
			// TODO: Implement this method
			getit = text.getText().toString();
		}

		@Override
		public void afterTextChanged(Editable p1)
		{
			// TODO: Implement this method
		}



		
	};
	DialogInterface.OnDismissListener allListener = new DialogInterface.OnDismissListener(){

		@Override
		public void onDismiss(DialogInterface p1)
		{
			diosab =0;
			diosa =0;
			// TODO: Implement this method
		}

		
	};
	OnClickListener bifcListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			// TODO: Implement this method
			diosab = 4;
			showDialog(0);
		}

		
	};
	OnClickListener okListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			r=p1;
			//bers.setText(getit);
			extension = getit;
			text.startAnimation(Rollin);
			CountDownTimer garryb = new CountDownTimer(500,300){
				public void onTick(long millis){

				}
				public void onFinish(){
					text.setVisibility(r.GONE);
					if((diosab==4)){
						ki.dismiss();
						dismissDialog(0);
						setteready(5);
						diosab=0;
					}
				}
			}.start();
			// TODO: Implement this method
		}

		
	};
	OnClickListener bifListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			diosab =8;
			showDialog(2);
			// TODO: Implement this method
		}

		
	};
	OnClickListener donzListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			path = entor.getText().toString();
			// TODO: Implement this method
		}
};
	OnClickListener donbListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{ 
		r=p1;
			// TODO: Implement this method
			if(donk ==0){
			if((!enta.getText().toString().equals("Enter password"))&&(!enta.getText().toString().equals(""))){
				renta.setVisibility(p1.VISIBLE);
				
				donk =1;
				donb.startAnimation(fadein);
				kabeb.setVisibility(p1.VISIBLE);
				donbe.startAnimation(fadeout);
			CountDownTimer garryb = new CountDownTimer(500,300){
				public void onTick(long millis){
					
				}
				public void onFinish(){
					donb.setVisibility(r.GONE);
				}
				}.start();
			}
			else{
				displaye("no Password Entered");
			}
			}
			
		}

		
	};
	public boolean onkeyDown(int keycode,KeyEvent event){
		
					of.setVisibility(r.INVISIBLE);
					bere.setVisibility(r.INVISIBLE);
					ber.setImageResource(android.R.drawable.ic_menu_save);

		return false;
	}
	OnTouchListener backegListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			entrol.startAnimation(Rollin);
			loc.startAnimation(Rollin);
			CountDownTimer garryb = new CountDownTimer(500,300){
				public void onTick(long millis){

				}
				public void onFinish(){
					entrol.setVisibility(r.GONE);
					loc.setVisibility(r.GONE);
				}
			}.start();
			// TODO: Implement this method
			return false;
		}

		
	};
	OnTouchListener pubStorListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			// TODO: Implement this method
			if(goro ==0){
			//sece.setTextColor(Color.parseColor("#989998"));
			//secu.setTextColor(Color.parseColor("#989998"));
			loc.setVisibility(p1.VISIBLE);
			entrol.setVisibility(p1.VISIBLE);
			entrol.startAnimation(Rollout);
			loc.startAnimation(Rollout);
			}
			return false;
			
		}

		
	};
	OnClickListener biprobListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			//dismissDialog(diosa);
			if(moniv.equals("")){
				moniv="No Title";
			}
			else{}
			pronhk(coniv, moniv);
			ki.dismiss();
			// TODO: Implement this method
		}

		
	};
	
	OnClickListener dondListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			r=p1;
			// TODO: Implement this method
			if(entra.getText().toString().equals(passowword)){
			cbox.setChecked(false);
			passed.setVisibility(r.GONE);
			entra.setText(null);
			kabec.setVisibility(r.GONE);
			enta.setText(null);
			renta.setText(null);
			passowword = "";
			passy.setVisibility(r.GONE);
			checky.setVisibility(r.GONE);
			donb.setVisibility(r.VISIBLE);
			donbe.setVisibility(r.VISIBLE);
			kabeb.setVisibility(r.GONE);
			touchable = 0;
			donk = 0;
			dee.setVisibility(r.GONE);
			backiig.setVisibility(r.VISIBLE);
           goro = 0;
			cbox.setTextColor(Color.parseColor("#989998"));
			excla.setTextColor(Color.parseColor("#989998"));
				stor.setTextColor(Color.parseColor("#000000"));
				pub.setTextColor(Color.parseColor("#1f7cff"));
			
		}
		else{
			
		}
		}

		
	};
	OnClickListener donbeListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			r=p1;
			// TODO: Implement this method
			if(donk == 1){
				if((!renta.getText().toString().equals("Re-Enter password"))&&(!renta.getText().toString().equals(""))){
					if(!enta.getText().toString().equals(renta.getText().toString())){
						displaye("first and second passwords do not match");
					}
					else{
						
						passy.startAnimation(fadein);
						backiig.startAnimation(fadein);
						CountDownTimer garryb = new CountDownTimer(500,300){
							public void onTick(long millis){

							}
							public void onFinish(){
								passy.setVisibility(r.GONE);
								backiig.setVisibility(r.GONE);
                               touchable =1;
								cbox.setChecked(true);
								cbox.setTextColor(Color.parseColor("#3DD215"));
								excla.setTextColor(Color.parseColor("#336725"));
								dee.setVisibility(r.VISIBLE);
								dee.setTextColor(Color.parseColor("#3DD215"));
								excla.startAnimation(moverb);
								dee.startAnimation(mover);
								cbox.setEditableFactory(Editable.Factory.getInstance());
								passed.setVisibility(r.VISIBLE);
								passed.startAnimation(fadeout);
								passowword = renta.getText().toString();
								enta.setText(null);
								renta.setText(null);
								if((diosab == 8)){
									ki.dismiss();
									setteready(5);
									diosab=0;
									dismissDialog(2);
								}
								//beres.setText(passowword);
							}
						}.start();
					}
				}
		}

		
	}
	};
	OnTouchListener backiigListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			r=p1;
			// TODO: Implement this method
			passy.startAnimation(Rollin);
			checky.startAnimation(Rollin);
			CountDownTimer garry = new CountDownTimer(500,100){
				public void onTick(long millis){
					
				}
				public void onFinish(){
					checky.setVisibility(r.GONE);
					passy.setVisibility(r.GONE);
				}
			}.start();
			
			return false;
		}

		
	};
	OnTouchListener removeListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			kabec.setVisibility(p1.VISIBLE);
			kabec.startAnimation(Rollout);
			
			// TODO: Implement this method
			
			
			return false;
		}

		
	};
	OnKeyListener thisListener = new OnKeyListener(){

		@Override
		public boolean onKey(View p1, int p2, KeyEvent p3)
		{
			// TODO: Implement this method
			if(p3.getAction()==KeyEvent.ACTION_DOWN){
				if(p2==KeyEvent.KEYCODE_BACK){
					of.setVisibility(p1.GONE);


				}
			}
			return false;
		}


	};
	OnClickListener CloseListener= new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			// TODO: Implement this method
			m.dismiss();
		}

		
	};
	OnTouchListener cboxListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if(touchable==0){
			// TODO: Implement this method
			if(!cbox.isChecked()){
				 goro =1;
				
				passy.setVisibility(p1.VISIBLE);
				kabe.setVisibility(p1.VISIBLE);
                displaye("This Setting overrides every other File Settings");
				stor.setTextColor(Color.parseColor("#989998"));
				pub.setTextColor(Color.parseColor("#989998"));
				entrol.startAnimation(Rollin);
				loc.startAnimation(Rollin);
				CountDownTimer garry = new CountDownTimer(500,100){
					public void onTick(long millis){

					}
					public void onFinish(){
						entrol.setVisibility(r.GONE);
						loc.setVisibility(r.GONE);	
					}
				}.start();
				}
			else{
				goro =0;
				stor.setTextColor(Color.parseColor("#000000"));
				pub.setTextColor(Color.parseColor("#1f7cff"));
				passy.setVisibility(p1.GONE);
				kabe.setVisibility(p1.GONE);
				enta.setText(null);
				renta.setText(null);
			}
			}
			else{
				
			}
			return false;
			
		}

		
	};
	OnTouchListener secListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if(touchable ==0){
			// TODO: Implement this method
		checky.setVisibility(p1.VISIBLE);
		if(cbox.isChecked()){
			passy.setVisibility(p1.VISIBLE);
		}
		checky.startAnimation(Rollout);
		passy.startAnimation(Rollout);
		}
		else{
			
		}
			return false;
		}

		
	};
	OnClickListener othersListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			r=p1;
			// TODO: Implement this method
			if(othersa==0){
			text.setBackground( new ColorDrawable(Color.WHITE));
			text.setVisibility(p1.VISIBLE);
			text.startAnimation(Rollout);
			getit = text.getText().toString();
			othersa =1;
			
			
		}
		else{
			text.startAnimation(Rollin);
			othersa =0;
			CountDownTimer garry = new CountDownTimer(500,100){
				public void onTick(long millis){

				}
				public void onFinish(){
					text.setVisibility(r.GONE);
				}
			}.start();
		}

		}
	};
	OnCheckedChangeListener radListener = new OnCheckedChangeListener(){

		@Override
		public void onCheckedChanged(RadioGroup p1, int p2)
		{
			displaye(getit);
			// TODO: Implement this method
			RadioButton rada = (RadioButton)m.findViewById(R.id.txt);
				if(rada.isChecked()) {getit ="txt";
				}
			// TODO: Implement this method
			RadioButton radb = (RadioButton)m.findViewById(R.id.html);
			if(radb.isChecked()) {getit ="html";}
			// TODO: Implement this method
			RadioButton radc = (RadioButton)m.findViewById(R.id.doc);
			if(radc.isChecked()) {getit ="doc";}
			// TODO: Implement this method
			RadioButton radd = (RadioButton)m.findViewById(R.id.java);
			if(radd.isChecked()) {getit ="java";}
			// TODO: Implement this method
			RadioButton rade = (RadioButton)m.findViewById(R.id.pdf);
			if(rade.isChecked()) {getit ="txt";}
			
			
			
		
// TODO: Implement this method
			
	}
	
	};
	public void displaye(String m){
		Toast.makeText(this,m,Toast.LENGTH_LONG).show();
	}
	/*ibility(r.GONE);
			donb.setVisibility(r.VISIBLE);
			donbe.setVisibility(r.VISIBLE);
			kabeb.setVisibility(r.GONE);
			touchable = 0;
			donk = 0;
			dee.setVisibility(r.GONE);
			backiig.setVisibility(r.VISIBLE);
           goro = 0;
			cbox.setTextColor(Color.parseColor("#989998"));
			excla.setTextColor(Color.parseColor("#989998"));
				stor.setTextColor(Color.parseColor("#000000"));
				pub.setTextColor(Color.parseColor("#1f7cff"));
			
		}
		else{
			
		}
		}

		
	};
	OnClickListener donbeListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			r=p1;
			// TODO: Implement this method
			if(donk == 1){
				if((!renta.getText().toString().equals("Re-Enter password"))&&(!renta.getText().toString().equals(""))){
					if(!enta.getText().toString().equals(renta.getText().toString())){
						displaye("first and second passwords do not match");
					}
					else{
						
						passy.startAnimation(fadein);
						backiig.startAnimation(fadein);
						CountDownTimer garryb = new CountDownTimer(500,300){
							public void onTick(long millis){

							}
							public void onFinish(){
								passy.setVisibility(r.GONE);
								backiig.setVisibility(r.GONE);
                               touchable =1;
								cbox.setChecked(true);
								cbox.setTextColor(Color.parseColor("#3DD215"));
								excla.setTextColor(Color.parseColor("#336725"));
								dee.setVisibility(r.VISIBLE);
								dee.setTextColor(Color.parseColor("#3DD215"));
								excla.startAnimation(moverb);
								dee.startAnimation(mover);
								cbox.setEditableFactory(Editable.Factory.getInstance());
								passed.setVisibility(r.VISIBLE);
								passed.startAnimation(fadeout);
								passowword = renta.getText().toString();
								enta.setText(null);
								renta.setText(null);
							}
						}.start();
					}
				}
		}

		
	}
	};
	OnTouchListener backiigListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			r=p1;
			// TODO: Implement this method
			passy.startAnimation(Rollin);
			checky.startAnimation(Rollin);
			CountDownTimer garry = new CountDownTimer(500,100){
				public void onTick(long millis){
					
				}
				public void onFinish(){
					checky.setVisibility(r.GONE);
					passy.setVisibility(r.GONE);
				}
			}.start();
			
			return false;
		}

		
	};
	OnTouchListener removeListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			kabec.setVisibility(p1.VISIBLE);
			kabec.startAnimation(Rollout);
			
			// TODO: Implement this method
			
			
			return false;
		}

		
	};
	OnClickListener CloseListener= new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			// TODO: Implement this method
			m.dismiss();
		}

		
	};
	OnTouchListener cboxListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if(touchable==0){
			// TODO: Implement this method
			if(!cbox.isChecked()){
				 goro =1;
				
				passy.setVisibility(p1.VISIBLE);
				kabe.setVisibility(p1.VISIBLE);
                displaye("This Setting overrides every other File Settings");
				stor.setTextColor(Color.parseColor("#989998"));
				pub.setTextColor(Color.parseColor("#989998"));
				entrol.startAnimation(Rollin);
				loc.startAnimation(Rollin);
				CountDownTimer garry = new CountDownTimer(500,100){
					public void onTick(long millis){

					}
					public void onFinish(){
						entrol.setVisibility(r.GONE);
						loc.setVisibility(r.GONE);	
					}
				}.start();
				}
			else{
				goro =0;
				stor.setTextColor(Color.parseColor("#000000"));
				pub.setTextColor(Color.parseColor("#1f7cff"));
				passy.setVisibility(p1.GONE);
				kabe.setVisibility(p1.GONE);
				enta.setText(null);
				renta.setText(null);
			}
			}
			else{
				
			}
			return false;
			
		}

		
	};
	OnTouchListener secListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if(touchable ==0){
			// TODO: Implement this method
		checky.setVisibility(p1.VISIBLE);
		if(cbox.isChecked()){
			passy.setVisibility(p1.VISIBLE);
		}
		checky.startAnimation(Rollout);
		passy.startAnimation(Rollout);
		}
		else{
			
		}
			return false;
		}

		
	};
	OnClickListener othersListener = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			r=p1;
			// TODO: Implement this method
			if(othersa==0){
			text.setBackground( new ColorDrawable(Color.WHITE));
			text.setVisibility(p1.VISIBLE);
			text.startAnimation(Rollout);
			getit = text.getText().toString();
			othersa =1;
			
			
		}
		else{
			text.startAnimation(Rollin);
			othersa =0;
			CountDownTimer garry = new CountDownTimer(500,100){
				public void onTick(long millis){

				}
				public void onFinish(){
					text.setVisibility(r.GONE);
				}
			}.start();
		}

		}
	};
	OnCheckedChangeListener radListener = new OnCheckedChangeListener(){

		@Override
		public void onCheckedChanged(RadioGroup p1, int p2)
		{
			displaye(getit);
			// TODO: Implement this method
			RadioButton rada = (RadioButton)m.findViewById(R.id.txt);
				if(rada.isChecked()) {getit ="txt";
				}
			// TODO: Implement this method
			RadioButton radb = (RadioButton)m.findViewById(R.id.html);
			if(radb.isChecked()) {getit ="html";}
			// TODO: Implement this method
			RadioButton radc = (RadioButton)m.findViewById(R.id.doc);
			if(radc.isChecked()) {getit ="doc";}
			// TODO: Implement this method
			RadioButton radd = (RadioButton)m.findViewById(R.id.java);
			if(radd.isChecked()) {getit ="java";}
			// TODO: Implement this method
			RadioButton rade = (RadioButton)m.findViewById(R.id.pdf);
			if(rade.isChecked()) {getit ="txt";}
			
			
			
		
// TODO: Implement this h*/
			}

