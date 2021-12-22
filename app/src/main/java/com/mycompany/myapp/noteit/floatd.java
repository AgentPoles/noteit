package com.mycompany.myapp.noteit;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.widget.ImageButton;
import android.util.AttributeSet;
import android.graphics.Color;
import android.graphics.drawable.*;
import android.content.res.*;

public class floatd extends ImageButton
{
	Paint buttonPaint;

	public floatd(Context context, AttributeSet set, int der){
		super(context,set,der);
		init();
	}
	public floatd(Context context){
		super(context);
		init();
	}
	public floatd(Context context, AttributeSet set){
		super(context,set);
		init();
	}
	private void init(){
		Resources myres = getResources();
		super.setBackgroundDrawable(new ColorDrawable(Color.argb(250,30,190,20)));

		super.setImageResource(android.R.drawable.ic_menu_save);
		buttonPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		buttonPaint.setStyle(Paint.Style.FILL_AND_STROKE);
		buttonPaint.setColor(Color.argb(250,30,190,20));

	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
	{
		// TODO: Implement this method
		int measuredHeight = measure(heightMeasureSpec);
		int measuredWidth = measure(widthMeasureSpec);
		setMeasuredDimension(measuredHeight,measuredWidth);


	}
	private int measure(int hspec){
		int result;
		int specMode = MeasureSpec.getMode(hspec);
		int specSize = MeasureSpec.getSize(hspec);
		if(specMode==MeasureSpec.UNSPECIFIED){
			result = 200;
		}
		else result = specSize;
		return result;
	}


	@Override
	protected void onDraw(Canvas canvas)
	{
		// TODO: Implement this method
		int py = getMeasuredHeight()/2;
		int px = getMeasuredWidth()/2;
		int radius = Math.min(px,py);

		canvas.drawColor(Color.TRANSPARENT);
		canvas.drawCircle(px,py,radius,buttonPaint);
		canvas.save();
		super.onDraw(canvas);
		canvas.restore();
	}

}
