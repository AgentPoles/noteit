package com.mycompany.myapp;
import java.util.Date;
import java.util.List;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.icu.text.*;
import java.util.zip.*;
import android.widget.*;
public class ListAdaprer extends ArrayAdapter<Lists>
{
	int resource;
	public ListAdaprer(Context context,int resourece, List<Lists> items){
		super(context,resourece,items);
		this.resource = resourece;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		LinearLayout listeview;
		Lists item = getItem(position);
		// TODO: Implement this method
		String value = item.getTitle();
		Date nDay = item.getDate();
		boolean secured = item.getSecurityState();
		SimpleDateFormat form = new SimpleDateFormat("dd/MM/yy");
		String dateString = form.format(nDay);
		if(convertView == null){
			listeview = new LinearLayout(getContext());
			String Inflater = Context.LAYOUT_INFLATER_SERVICE;
			LayoutInflater li;
			li = (LayoutInflater)getContext().getSystemService(Inflater);
			li.inflate(resource,listeview,true);
		}
		else{
			listeview = (LinearLayout)convertView;
		}
	    ImageView imagee = (ImageView)listeview.findViewById(R.id.imagee);
		ImageView im = (ImageView)listeview.findViewById(R.id.im);
		TextView tv =(TextView)listeview.findViewById(R.id.tv);
		TextView lv =(TextView)listeview.findViewById(R.id.lv);
		tv.setText(dateString);
		lv.setText(value);
		if(!secured){
			imagee.setImageResource(android.R.drawable.star_big_off);
			im.setImageResource(android.R.drawable.ic_partial_secure);
			
		}
		else{
			imagee.setImageResource(android.R.drawable.star_big_on);
			im.setImageResource(android.R.drawable.ic_secure);
		}
		return listeview;
	}
	
}
