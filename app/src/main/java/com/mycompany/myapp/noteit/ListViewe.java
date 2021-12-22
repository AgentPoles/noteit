package com.mycompany.myapp.noteit;
import android.view.View;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.widget.TextView;
import android.util.*;
import java.util.Date;
import android.graphics.Color;
import android.text.*;

public class ListViewe extends TextView
{
	private Paint paperPaint;
	private int paperColor;
	private Paint TextPaint;
	private Paint AnotherPaint;
	public ListViewe(Context context , AttributeSet attrs, int ds){
		super(context, attrs, ds);
		init();
		}
		public ListViewe(Context context, AttributeSet attrs){
			super(context, attrs);
			init();
		}
		public ListViewe(Context context){
			super(context);
			init();
		}
		public void init(){
			paperPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
			paperPaint.setColor(Color.BLUE);
			paperColor = Color.parseColor("#FAF1E6");
			TextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
			TextPaint.setColor(Color.WHITE);
			TextPaint.setTextSize(15);
			paperPaint.setTextSize(15);
			
			AnotherPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
			AnotherPaint.setColor(Color.GREEN);
			AnotherPaint.setTextSize(15);
		}

		@Override
		protected void onDraw(Canvas canvas)
		{
			//canvas.drawColor(paperColor);
			
			if(MainActivity.passowword.equals("")){
			//canvas.drawCircle( 50,43,35,paperPaint);
			//canvas.drawText("Public",30,50,TextPaint);
				canvas.drawLine(0, getMeasuredHeight(), getMeasuredWidth(),getMeasuredHeight(),paperPaint);
				//canvas.drawText(bcv.datee, 110,75,paperPaint);
			}
			else{
				//canvas.drawCircle( 50,43,35,AnotherPaint);
				//canvas.drawText("Secured!",22,50,TextPaint);
				canvas.drawLine(0, getMeasuredHeight(), getMeasuredWidth(),getMeasuredHeight(),AnotherPaint);
				//canvas.drawText(bcv.datee, 110,75,AnotherPaint);
			}
			
			
			
			//canvas.translate(79,0);
			// TODO: Implement this method
			canvas.save();
			//canvas.restore();
			super.onDraw(canvas);
		}
		
	}
