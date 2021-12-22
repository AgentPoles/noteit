package com;
import android.content.Context;
import android.widget.EditText;
import android.util.*;
import android.graphics.*;
import java.util.Date;
import java.text.*;
import android.view.*;
import android.database.*;
import android.text.*;
public class myNote extends EditText
{
	Date date;
	int i;
	int y;
	int g;
	int h;
	int k;
	int yr;
	Paint linePaint;
	Paint marginPaint;
	Paint cadPaint;
	String dateString;
	int utt= 0;
	int io = 0;
	int yt;
	int mm ;
	int j = 45;
	Canvas canvas;
	
	public myNote(Context context, AttributeSet attr, int si){
		super(context, attr, si);
		init();
	}
	public myNote(Context context, AttributeSet attr){
		super(context, attr);
		init();
	}
	public myNote(Context context){
		super(context);
		init();
	}
	private void init(){
		super.setPadding(2,40-super.getLineHeight(),60,0);
		super.setWidth(getMeasuredWidth()-60);
		super.setTextSize(20);
		y = super.getLineHeight();
	 super.addTextChangedListener(gui);
		
		date = new Date(java.lang.System.currentTimeMillis());
super.setBackgroundColor(Color.TRANSPARENT);
		linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		linePaint.setStyle(Paint.Style.STROKE);
		linePaint.setColor(Color.rgb(100,110,250));
		marginPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		marginPaint.setColor(Color.rgb(190,170,120));
		cadPaint= new Paint(Paint.ANTI_ALIAS_FLAG);
		cadPaint.setTextSize(15);
		cadPaint.setColor(Color.BLACK);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        dateString = sdf.format(date);
	}
	private void convr(){
		
		if(utt>mm){
		try{canvas.drawLine(0,j,k,j,linePaint);}
		catch(Exception e){e.printStackTrace();}
			j+=y;
			mm=utt;}
	}
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		// TODO: Implement this method
		int measuredHeight = measureHeight(heightMeasureSpec);
		int measuredWidth = measureWidth(widthMeasureSpec);
		setMeasuredDimension(measuredHeight,measuredWidth);


	}
	private int measureHeight(int hspec){
		int result;
		int specMode = MeasureSpec.getMode(hspec);
		int specSize = MeasureSpec.getSize(hspec);
		if(specMode==MeasureSpec.UNSPECIFIED){
			result = 200;
		}
		else result = specSize;
		return result;
	}
	
	private int measureWidth(int hspec){
		int result;
		int specMode = MeasureSpec.getMode(hspec);
		int specSize = MeasureSpec.getSize(hspec);
		if(specMode==MeasureSpec.UNSPECIFIED){
			result = 200;
		}
		else result = specSize;
		return result;
	}
	TextWatcher gui = new TextWatcher(){

		@Override
		public void onTextChanged(CharSequence p1, int p2, int p3, int p4)
		{
			// TODO: Implement this metho
			
		}

		@Override
		public void beforeTextChanged(CharSequence p1, int p2, int p3, int p4)
		{
			// TODO: Implement this method
		}

		@Override
		public void afterTextChanged(Editable p1)
		{
			// TODO: Implement this method
		}



	
};

	@Override
	protected void onDraw(Canvas canvas)
	{
		canvas= canvas;
		canvas.drawColor(Color.rgb(250,240,230));
		// TODO: Implement this method
	     i =0;
		 int j = 105-(2*y);
		int te =60;
		int line ;
		int n = getMeasuredWidth();
		g=getMeasuredHeight();
		h=(int)(g/y);
		int k = getMeasuredWidth();
	//canvas.drawText(dateString,0,36,cadPaint);
	canvas.drawLine(0,3,k,3,marginPaint);
	canvas.drawLine(0,8,k,8,marginPaint);
		canvas.drawLine(te,0,te,2000*g,marginPaint);
	while(i<(2000*h)){
			canvas.drawLine(0,j,k,j,linePaint);
			j+=y;
			i++;}
		canvas.save();
		canvas.translate(te,0);
	
		super.onDraw(canvas);
	   canvas.restore();
	}
	
}