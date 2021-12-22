package com.mycompany.myapp;
import android.app.Fragment;
import android.view.*;
import android.os.*;
import android.widget.*;
import android.graphics.Color;
import android.widget.EditText;
import android.text.*;
import java.util.Date;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.*;
import java.io.IOException;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.test.*;
import android.view.View.*;
import android.content.res.*;
import android.text.util.*;
import java.util.*;
import java.text.*;
import android.view.KeyEvent;
import android.text.method.*;
import android.widget.TimePicker.*;
import android.graphics.drawable.*;
import android.view.animation.*;
import android.animation.*;
import java.util.Date;
import android.text.style.*;
import java.security.*;
import android.app.*;
import java.util.regex.*;
import android.content.*;
import android.view.Display.*;
public class bcv extends Fragment
{
	ImageButton ber;
	ImageButton bere;
	ImageButton berec;
	Date date;
	String dateString;
	int yrrt =2;
	View v;
	int kelvin =0;
	ArrayList datsa = new ArrayList();
	ArrayList datsb = new ArrayList();
	ArrayList datsc = new ArrayList();
	ArrayList datsd = new ArrayList();
	int m=0;
	int b =1;
	private onSort rega;
	int weq =0;
	int gr = 0;
	int agger =0;
	int dolag;
	String alli;
	int sider=0;
	String maga;
	int uy =0;
	String baseUri="www.google.com";
	int i=1;
	int syncer =0;
	int selc =0;
	private setiig delta;
	int c;
	int linkifier = 0;
	int mn = 1;
	String ned;
	String Alls;
	String ged;
	String searchupe;
	String [] word;
	int [] indexes;
	int jerra = 0;
	ArrayList<String> intor;
	EditText mert;
	Animation anima;
	FrameLayout of;
	Animation animb;
	Animator animc;
	Animator animf;
	EditText ced ;
	String searchup;
	static String datee;
	ImageView vue;
	ImageView plus;
	ImageView manage;
	ImageView sync;
	ImageView undo;
	ImageView redo;
	ImageView times;
	ImageView setas;
	ImageView speak;
	Animator anime;
	Animation animg;
	TextView filee;
	TextView filef;
	TextView fileg;
	int tounch =0;
    int ptimser =0;
	int begin =0;
	Animation all;
	EditText bvv,bmm;
	TextView xec;
	static int extenser=0;
	int hoverer = 0;
	RotateAnimation rew;
	AlphaAnimation vede;
	SpannableString jarvis;
	Animation abv;
	CountDownTimer t;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		/*android.R.drawable.ic_menu_set_as
		 android.R.drawable.arrow_down_float
		 android.R.drawable .btn_plus
		 android.R.drawable.ic_menu_manage
		 android.R.drawable.stat_notify_chat
		 android.R.drawable.ic_menu_revert
		 android.R.drawable.ic_btn_speak_now
		 android.R.drawable.ic_input_add;
		 android.R.drawable.ic_popup_sync*/
		 
		v = inflater.inflate(R.layout.fragment,container,false);
		date = new Date(java.lang.System.currentTimeMillis());
		ced = (EditText)v.findViewById(R.id.metr);
		ced.setBackgroundColor(Color.TRANSPARENT);
		ced.setOnFocusChangeListener(njjListener);
		ced.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
		ber =(ImageButton)v.findViewById(R.id.floart);
		bere =(ImageButton)v.findViewById(R.id.floatc);
		berec =(ImageButton)v.findViewById(R.id.floatd);
		 rew = new RotateAnimation(0,360,50,50);
		TextView bg = (TextView)v.findViewById(R.id.mtv);
		bg.setBackgroundColor(Color.argb(100,60,5,3));
		mert = (EditText)v.findViewById(R.id.met);
		bvv  = (EditText)v.findViewById(R.id.deta);
		bvv.setVisibility(v.INVISIBLE);
		bvv.setOnFocusChangeListener(njjListener);
		bvv.setBackgroundColor(Color.TRANSPARENT);
		bvv.setHintTextColor(Color.WHITE);
		datsa.add("");
		bmm=(EditText)v.findViewById(R.id.bmum);
		datsc.add(0);
      bere.setOnClickListener(bereClicker);
		maga ="";
		ber.setOnClickListener(berClicker);
		 of = (FrameLayout)v.findViewById(R.id.of);
		of.setBackgroundColor(Color.argb(80,10,40,250));
	     filee = (TextView)v.findViewById(R.id.filee);
		filee.setBackgroundColor(Color.argb(250,36,40,250));
		 filef =(TextView)v.findViewById(R.id.filef);
		filef.setBackgroundColor(Color.argb(250,36,40,250));
		fileg=(TextView)v.findViewById(R.id.fileg);
		fileg.setBackgroundColor(Color.argb(250,36,40,250));
		speak = (ImageView)v.findViewById(R.id.img);
        //TableLayout nhh = (TableLayout)v.findViewById(R.id.sety);
		bvv.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_SUBJECT);
		dateString = sdf.format(date);
       speak.setOnTouchListener(wqListener);
			TextView vcd = (TextView)v.findViewById(R.id.fem);
		vcd.setText(dateString);
		vcd.setTextSize(12);
		vcd.setTextColor(Color.WHITE);
		RadioGroup ragr =(RadioGroup)v.findViewById(R.id.ragr);
		LinearLayout but = (LinearLayout)v.findViewById(R.id.but);
		mert.addTextChangedListener(nlistener);
		mert.setOnScrollChangeListener(yzListener);
		ber.setVisibility(v.INVISIBLE);
		vue = (ImageView)v.findViewById(R.id.fam);
		vue.setVisibility(v.INVISIBLE);
		vue.setOnTouchListener(searchlistener);
		xec = (TextView)v.findViewById(R.id.coi);
		//xec.setBackgroundColor(Color.argb(80,10,40,250));
		plus =(ImageView)v.findViewById(R.id.imd);
		times =(ImageView)v.findViewById(R.id.imya);
		undo=(ImageView)v.findViewById(R.id.ime);
		setas = (ImageView)v.findViewById(R.id.ima);
		sync =(ImageView)v.findViewById(R.id.imb);
		manage =(ImageView)v.findViewById(R.id.imc);
		manage.setOnTouchListener(manageListener);
		sync.setOnTouchListener(retListener);
        setas.setOnTouchListener(setaasListener);
		plus.setOnTouchListener(plustListener);
		LinearLayout ter = (LinearLayout)v.findViewById(R.id.mll);
		undo.setVisibility(v.INVISIBLE);
		undo.setOnTouchListener(undoListener);
		undo.setAlpha(15);
		undo.setBackground( new ColorDrawable(Color.TRANSPARENT));
		ter.setBackgroundColor(Color.argb(80,10,40,250));
		//ragr.setBackgroundColor(Color.argb(80,10,40,250));
		//but.setBackgroundColor(Color.argb(80,10,40,250));
		redo = (ImageView)v.findViewById(R.id.imf);
		redo.setBackgroundColor(Color.TRANSPARENT);
		redo.setBackground( new ColorDrawable(Color.TRANSPARENT));
	    redo.setAlpha(15);
		redo.setVisibility(v.INVISIBLE);
		redo.setOnTouchListener(
			redoListener);
			
        //Resources fg = getResources();
		LinearLayout terr = (LinearLayout)v.findViewById(R.id.lom);
		terr.setBackgroundColor((Color.argb(200,60,5,3)));
		animb = AnimationUtils.loadAnimation(getContext(),R.animator.animb);
		animg = AnimationUtils.loadAnimation(getContext(),R.animator.animb);
		animf = AnimatorInflater.loadAnimator(getContext(),R.animator.anima);
		//animc= AnimatorInflater.loadAnimator(getContext(),R.animator.animc);
		anime = AnimatorInflater.loadAnimator(getContext(),R.animator.anime);
		all  = AnimationUtils.loadAnimation(getContext(),R.animator.anim);
		abv = AnimationUtils.loadAnimation(getContext(),R.animator.animd);
		mert.setLinkTextColor(Color.argb(250,30,190,20));
		anime.setTarget(ber);
		animf.setTarget(ber);
		bere.setBackgroundDrawable( new ColorDrawable(Color.TRANSPARENT));
		//animc.setTarget(ber);
		berec.setBackgroundColor(Color.TRANSPARENT);
     //  bere.setScaleX(0);
	 //  bere.setScaleY(0);
		//bere.setBackgroundResource(Color.argb(250,229,40,10));
		//anim = AnimatorInflater.loadAnimator(getContext(),R.animator.anim);
		//anim.setTarget(ber);
		ned = mert.getText().toString();
		v.setOnKeyListener(vmbeListener);
		mert.setOnKeyListener(vmbeListener);
		bmm.setOnKeyListener(vmbeListener);
		bvv.setOnKeyListener(vmbeListener);
        ced.setText("");
		datee = vcd.getText().toString();
        return v;
		}
	public boolean onkeyDown(int keycode,KeyEvent event){
		switch(keycode){
			case event.KEYCODE_BACK:{
				of.setVisibility(v.INVISIBLE);
				bere.setVisibility(v.INVISIBLE);
				ber.setImageResource(android.R.drawable.ic_menu_save);
			}
			
		}
		return false;
	}
	OnClickListener berClicker = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			agger =1;
			kelvin =1;
			
	         rew.setDuration(600);
		   ScaleAnimation bnew = new ScaleAnimation(0,1,0,1);
		   bnew.setStartOffset(300);
		   bnew.setDuration(300);
			ber.startAnimation(rew);
			ber.setImageResource(android.R.drawable.ic_menu_share);
			bere.setVisibility(v.VISIBLE);
			bere.startAnimation(bnew);
			// TODO: Implement this method
			//bere.setBackground( new ColorDrawable(Color.argb(250,30,190,20)));
			bere.setImageResource(android.R.drawable.stat_notify_sdcard);
			berec.setImageResource(android.R.drawable.ic_menu_share);
			bere.setVisibility(v.VISIBLE);
			//berec.setVisibility(v.VISIBLE);
			//ber.setVisibility(v.INVISIBLE);
			of.setVisibility(v.VISIBLE);	
			//ced.setFocusable(false);
			tounch =1;
		    //mert.setFocusable(false);
		
			}
       
		
	};
	OnClickListener bereClicker = new OnClickListener(){

		@Override
		public void onClick(View p1)
		{
			//camper.camp(mert.getText().toString(), ced.getText().toString());
			// TODO: Implement this method
		//if((MainActivity.extension.equals(""))||MainActivity.extension.equals(null)){
				dolag = 5;
				
				
			
				//Toast.makeText(getContext(),h,Toast.LENGTH_LONG).show();
		
					
					delta.setteready(dolag);
				
			
			/*else{
				if((MainActivity.passowword.equals("")||MainActivity.passowword.equals(null))){
				dolag=3;
				delta.setteready(2);
					extenser = 2;
			}*/
	    rega.sort(mert.getText().toString(), ced.getText().toString());
		

	 }
	 
	 
		
	};
	OnKeyListener vmbeListener = new OnKeyListener(){

		@Override
		public boolean onKey(View p1, int p2, KeyEvent p3)
		{
			// TODO: Implement this method
			if(p3.getAction()==KeyEvent.ACTION_DOWN){
				if((p2==KeyEvent.KEYCODE_BACK)||(p2==KeyEvent.KEYCODE_HOME)||(p2==KeyEvent.KEYCODE_NAVIGATE_PREVIOUS)){
					if(agger==1){
					of.setVisibility(p1.GONE);
					bere.setVisibility(v.INVISIBLE);
					ber.setImageResource(android.R.drawable.ic_menu_save);
					anime.start();
					
			      kelvin =0;
					tounch =0;
					t = new CountDownTimer(2000,1000){
						public void onTick(long millisUtilFinished){

						}
						public void onFinish(){
							animf.start();
		                agger=0;
						}
					}.start();
					}
					else{
						Intent i = new Intent("com.mycompany.myapp.Files");
						startActivity(i);
					}
				}
					
			}
			return true;
		}

		
	};
	OnTouchListener undoListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			// TODO: Implement this method
			if(tounch==0){
			RotateAnimation spind = new RotateAnimation(0,180);
			spind.setDuration(800);
			redo.setVisibility(v.VISIBLE);
			undo();
         }
		 else{}
			return false;
		}
		
	};

	OnTouchListener redoListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if(tounch==0){
			// TODO: Implement this method
			if(m==0){}
			else{redo();}
			}
			else{}
			return false;
		}


	};
	public void linky(){
		Linkify.addLinks(mert,Linkify.WEB_URLS|Linkify.EMAIL_ADDRESSES|Linkify.PHONE_NUMBERS);
	}
	
	public void unlinky(){
		Spannable stuff = mert.getText();
		URLSpan [] spans = stuff.getSpans(0,stuff.length(),URLSpan.class);
		for(URLSpan span:spans){
			stuff.removeSpan(span);
		}
	}
	OnTouchListener retListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if(tounch==0){
			// TODO: Implement this method
			if(jerra==0){
				linkifier=1;
				sync.startAnimation(abv);
				linky();
				CountDownTimer timere = new CountDownTimer(1800,1000){
					public void onTick(long millisUntilFinished){
					}

					public void onFinish(){
						sync.setBackgroundDrawable(new ColorDrawable(Color.argb(150,30,190,20)));
					}
				}.start();



				jerra =1;
			}
			else{if(jerra==1){
                   linkifier = 0;
				   unlinky();
					sync.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
					sync.startAnimation(abv);
					jerra =0;

				}
			}
			}
			else{}
			return false;
		}



	};
	public void undo(){

		/*Toast.makeText( getContext(), String.valueOf(b),Toast.LENGTH_SHORT).show();
		 Toast.makeText( getContext(),datsa.get(b-1).toString(),Toast.LENGTH_LONG).show();*/
		if((b-1)>=0){
			b=datsa.size();
			datsb.add(datsa.get(b-1));
			datsa.remove(b-1);
			datsd.add(datsc.get(b-1));
			datsc.remove(b-1);
			b= datsa.size();
			if((b-1)>=0){
				maga=alli;
				mert.setText(datsa.get(b-1).toString());
				mert.setSelection(datsc.get(b-1));
				alli= mert.getText().toString();
				m=1;
				gr = 2;
			}
		}
	}
	public void redo(){
		c= datsb.size();

		if((c-1)>=0){
			maga=alli;
			c--;
			mert.setText(datsb.get(c).toString());
			mert.setSelection(datsd.get(c));
			datsb.remove(c);
			datsd.remove(c);
			m=3;
			gr=1;
		}

	}
	OnTouchListener manageListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if(tounch==0){

			// TODO: Implement this method
			//Intent i = new Intent("com.mycompany.myPreferenceActivity");
			//startActivity(i);
			dolag=2;
			delta.setteready(dolag);
			}
			else{}
			return false;
			}
			
};
	OnTouchListener wqListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			// TODO: Implement this method
			if(tounch==0){
			dolag =1;
			delta.setteready(dolag);
			}
			else{}
			return false;
		}

		
	};
	OnTouchListener plustListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			// TODO: Implement this method
			if(ptimser ==1){
			if(tounch==0){
			mert.setText("");
			m=0;
			}
			else{}
			}
			else{}
			return true;
			
		}


	};
	OnFocusChangeListener njjListener = new OnFocusChangeListener(){

		@Override
		public void onFocusChange(View p1, boolean p2)
		{
			// TODO: Implement this method

			bvv.setSelection(0);
			ced.setSelection(0);
		}


	};
	public void highlight( String input, SpannableString crio){
		int indexo = crio.toString().indexOf(input);
		uy =indexo;
		while(indexo >=0){
		crio.setSpan( new ForegroundColorSpan(Color.argb(220,10,40,200)),indexo,indexo+input.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
			indexo = crio.toString().indexOf(input,indexo+input.length());
			}
		mert.setText(crio);
			CountDownTimer jytimer = new CountDownTimer(1500,1000){
				public void onTick(long millis){}
				public void onFinish(){
					hoverer=1;
					sider = 1;
					try{mert.setSelection(uy);}
					catch(Exception e){}
				}
			}.start();
	}
	public void update(){if(m==0||gr==1){

			maga = alli;
			datsc.add(selc);
			datsa.add(alli);
			b = datsa.size();}

		if(gr==0){
			for(int i = 0;i<datsb.size();i++){
				datsb.remove(i);
				datsd.remove(c);
			}

		}
		gr=0;
	}
	TextWatcher nlistener = new TextWatcher(){

		CountDownTimer timer = null;
		@Override
		public void onTextChanged(CharSequence p1, int p2, int p3, int p4)
		{ber.setVisibility(v.INVISIBLE);
      
		if(hoverer ==1&&sider!=1){
			Spannable jarovis = mert.getText();
			ForegroundColorSpan[] cooly = jarovis.getSpans(0, jarovis.length(), ForegroundColorSpan.class);
			for(ForegroundColorSpan span:cooly){
				jarovis.removeSpan(span);
			}			
			hoverer=0;
			sider=0;
     }
           if(linkifier ==1){
			   linky();
		   }
		   if(linkifier==0){
			   unlinky();
		   }
			if(mert.getText().toString().equals("")){
				mn=1;
				bvv.setVisibility(v.INVISIBLE);
				vue.setVisibility(v.INVISIBLE);
				times.setVisibility(v.GONE);
				plus.setImageResource(android.R.drawable.ic_input_add);
                ptimser = 0;
			}


			if((mert.getText().toString().equals("")==false&&mn==1))
			{bvv.setVisibility(v.VISIBLE);
				vue.setVisibility(v.VISIBLE);
				TranslateAnimation n =new TranslateAnimation(400,0,5,5);
				n.setDuration(1500);
				final AlphaAnimation bng = new AlphaAnimation(0,1);
				bng.setDuration(2000);
				bng.setStartOffset(1300);
				bvv.startAnimation(n);
				vue.startAnimation(bng);
				plus.startAnimation(abv);

				sync.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));	
				sync.startAnimation(abv);
				// sync.setForeground(new ColorDrawable(Color.GREEN));
				/*RotateAnimation ng = new RotateAnimation(0,90);
				 ng.setStartOffset(1400);
				 ng.setDuration(100);
				 plus.startAnimation(ng);*/
				final AlphaAnimation ltt = new AlphaAnimation(0,1);
				//ltt.setStartOffset(1550);
				ltt.setDuration(500);
				//plus.startAnimation(ltt);

				CountDownTimer g = new CountDownTimer(2500,1000){
					public void onTick( long millis){

					}
					public void onFinish(){
						plus.setVisibility(v.GONE);
						plus.setImageResource(android.R.drawable.ic_delete);
						plus.setVisibility(v.VISIBLE);
						ptimser = 1;
						undo.setVisibility(v.VISIBLE);
						if(jerra==0){sync.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));}
						if(jerra==1){sync.setBackgroundDrawable(new ColorDrawable(Color.argb(150,30,190,20)));}
						sync.startAnimation(ltt);
						plus.startAnimation(ltt);
						if(begin==0)
						{undo.startAnimation(ltt);
						begin =1;
						}
					}
				}.start();
				mn=0;
			}




			if(timer!=null){
				timer.cancel(); 
			}
			timer = new CountDownTimer(2300,1000){
				public void onTick(long millisUntilFinished){
				}

				public void onFinish(){
					if(kelvin ==0){
					ber.setVisibility(v.VISIBLE);

					ber.startAnimation(all);
				}
				}
			}.start();

			CountDownTimer timerw = new CountDownTimer(2200,1000){
				public void onTick( long millis){
				}

				public void onFinish(){

					if(m==0) 
					{  gr=0;
						alli = mert.getText().toString();
						selc = mert.getSelectionEnd();
						if(maga.equals(alli)){}
						else
						{update();}
						gr=0;

					}
					if(m==3){
						alli = mert.getText().toString();
						selc = mert.getSelectionEnd();
						if(maga.equals(alli)){}
						else
						{update();}
						gr=1;
					}

				}

			}.start();
			m=0;


		}

		@Override
		public void beforeTextChanged(CharSequence p1, int p2, int p3, int p4)
		{ 
			// TODO: Implement this method
			i = 5;
		}

		@Override
		public void afterTextChanged(Editable p1)
		{

		}


		// TODO: Implement this method
		/*int mt = cheeker();
		 //Toast.makeText(getContext(),String.valueOf(mt),Toast.LENGTH_LONG).show();
		 Toast.makeText(getContext(),String.valueOf(i),Toast.LENGTH_LONG).show();
		 if(mt==1){
		 stella();

		 }
		 if(mt==0){

		 }

		 }

		 };
		 public int cheeker(){
		 int jy = 0;
		 ged = mert.getText().toString();
		 if(ged.equals(ned)){
		 new Thread(new Runnable(){
		 public void run(){
		 for(int tw=0;tw<3;tw++){
		 try{
		 Thread.sleep(1000);

		 }
		 catch(Exception e){}
		 }
		 }

		 }).start();
		 ged = mert.getText().toString();
		 if(ged.equals(ned)){
		 jy =1;
		 new Thread(new Runnable(){
		 public void run(){
		 for(int tw=0;tw<5;tw++){
		 try{
		 Thread.sleep(1000);

		 }
		 catch(Exception e){}
		 }
		 }

		 }).start();
		 }
		 else{ned = ged;}
		 }
		 else{
		 ned = ged;
		 new Thread(new Runnable(){
		 public void run(){
		 for(int tw=0;tw<3;tw++){
		 try{
		 Thread.sleep(1000);

		 }
		 catch(Exception e){}
		 }
		 }

		 }).start();
		 ged = mert.getText().toString();
		 if(ged.equals(ned)){
		 new Thread(new Runnable(){
		 public void run(){
		 for(int tw=0;tw<5;tw++){
		 try{
		 Thread.sleep(1000);

		 }
		 catch(Exception e){}
		 }
		 }

		 }).start();
		 jy =1;
		 }
		 else{ned =ged;}


		 }
		 return jy;
		 }



		 public void stella(){

		 ber.setVisibility(v.VISIBLE);*/

	};
public interface setiig{
	public void setteready(int id);
}

	public interface onSort{
		public void sort(String m, String n);
	
	}
	
	
	
	OnTouchListener setaasListener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if(tounch==0){
			// TODO: Implement this method
		    dolag = 0;
			delta.setteready(dolag);
			}
			else{}
			return false;
		}


   };
	OnTouchListener searchlistener = new OnTouchListener(){

		@Override
		public boolean onTouch(View p1, MotionEvent p2)
		{
			if(tounch==0){
			// TODO: Implement this method
			searchupe = bvv.getText().toString();
			int gy = searchupe.length();
			if(searchupe.endsWith(" ")){
				searchup = searchupe.substring(0,gy-1);
			}
			else searchup =searchupe;
			if((searchup.equals(""))||searchup.equals(null)){
				Toast.makeText(getContext(),"Please enter the text you wish to find",Toast.LENGTH_SHORT).show();
			}
			else{
				findee(searchup);
			}
			}
			else{}
			return false;
		}

	   
   };
   public void findee(String we){
	   Alls = mert.getText().toString();
	   word = Alls.split("[ .,;\":!]");
	   int iy = word.length;
	  
	   if(iy==0){iy=1;}
	   for(int i =0;i<iy; i++){
		
		  if(word[i].equals(we)){
			  weq = 1;
			  Toast.makeText(getContext(),"yes!",Toast.LENGTH_SHORT).show();
			  //Toast.makeText(getContext(),String.valueOf(Alls.indexOf(word[i])), Toast.LENGTH_LONG).show();
			  
			   }
			   }
		  if(weq==1){ }
		    else{
			  Toast.makeText(getContext(),"none of such can be found in this piece",Toast.LENGTH_LONG).show();
		  }
	   jarvis = new SpannableString(mert.getText().toString());
	   highlight(we,jarvis);
	 //  mert.setSelection(intor.get(1));
	   weq=0;
	   
	 /*  for(int dy=0; dy<intor.size(); dy++){
		   mert.setSelection(intor.get(dy), intor.get(dy)+searchup.length());
	   }*/
   }
    
	OnScrollChangeListener yzListener = new OnScrollChangeListener(){

		@Override
		public void onScrollChange(View p1, int p2, int p3, int p4, int p5)
		{
			if(tounch==0){
			if(kelvin==0){
			if(yrrt==2){
				anime.start();
				yrrt=0;}
			if(t!=null)	{t.cancel();}
			// TODO: Implement this method
			t = new CountDownTimer(2000,1000){
				public void onTick(long millisUtilFinished){

				}
				public void onFinish(){
					animf.start();
					yrrt=2;
				}
			}.start();
		}


	}
	
	else{}
	}
    };
	@Override
	public void onAttach(Activity activity)
	{
		// TODO: Implement this method
		super.onAttach(activity);
		try{
			delta =(setiig)activity;
		}
		catch(ClassCastException e){
			throw new ClassCastException (activity.toString() + " must implement setiig");
		}
		
		try{rega =(onSort)activity;}
		catch(ClassCastException e){
			throw new ClassCastException (activity.toString()+ "must implement onSort");
		}
		
		}
	
	
	
}
