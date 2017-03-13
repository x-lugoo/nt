package com.example.unit_study;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.unit_study.MainActivity.Fruit;

public class FruitAdapter extends ArrayAdapter<Fruit>
{
	private int recourseId;
	
	public FruitAdapter(Context context, int textViewResourceId,List<Fruit>objects) {
		super(context, textViewResourceId,objects);
		recourseId = textViewResourceId;
		// TODO Auto-generated constructor stub
	}
	public View getView(int position,View convertView,ViewGroup parent)
	{
		View view;
		ViewHolder viewHolder;
		Fruit fruit = getItem(position);
		if(convertView == null)
		{
			view = LayoutInflater.from(getContext()).inflate(recourseId, null);
			viewHolder = new ViewHolder();
			viewHolder.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
			viewHolder.fruitName = (TextView)view.findViewById(R.id.fruit_text);
			view.setTag(viewHolder);
			
		}
		else 
		{
			view = convertView;
			viewHolder = (ViewHolder)view.getTag();
		}
		/*
		*ImageView fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
		*TextView fruitName = (TextView)view.findViewById(R.id.fruit_text);
		*/
		viewHolder.fruitImage.setImageResource(fruit.getImageId());
		viewHolder.fruitName.setText(fruit.getId());
		return view;
	}
	
	class ViewHolder{
		ImageView fruitImage;
		TextView  fruitName;
	}
	
}
