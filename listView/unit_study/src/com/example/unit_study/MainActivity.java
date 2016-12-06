package com.example.unit_study;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private String[] data=
		{
			"Apple","Book","Pen","oracle","green",
			"Apple","Book","Pen","oracle","green",
			"Apple","Book","Pen","oracle","green"
		};
	private List<Fruit> fruitList = new ArrayList<Fruit>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
	    initFruit();
	    FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
		ListView listView = (ListView)findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Fruit fruit = fruitList.get(arg2);
				Toast.makeText(MainActivity.this,fruit.getId(),Toast.LENGTH_SHORT).show();
			}
		});
			
		
	}
	private void initFruit()
	{
		Fruit apple = new Fruit("Apple",R.drawable.ic_launcher);
		fruitList.add(apple);
		Fruit apple1 = new Fruit("Apple1",R.drawable.ic_launcher);
		fruitList.add(apple1);
		Fruit apple2 = new Fruit("Apple2",R.drawable.ic_launcher);
		fruitList.add(apple2);
		Fruit apple3 = new Fruit("Apple3",R.drawable.ic_launcher);
		fruitList.add(apple3);
		Fruit apple4 = new Fruit("Apple4",R.drawable.ic_launcher);
		fruitList.add(apple4);
		Fruit apple5 = new Fruit("Apple5",R.drawable.ic_launcher);
		fruitList.add(apple5);
		Fruit apple6 = new Fruit("Apple6",R.drawable.ic_launcher);
		fruitList.add(apple6);
		Fruit applea = new Fruit("Apple",R.drawable.ic_launcher);
		fruitList.add(applea);
		Fruit apple1a = new Fruit("Apple1",R.drawable.ic_launcher);
		fruitList.add(apple1a);
		Fruit apple2a = new Fruit("Apple2",R.drawable.ic_launcher);
		fruitList.add(apple2a);
		Fruit apple3a = new Fruit("Apple3",R.drawable.ic_launcher);
		fruitList.add(apple3a);
		Fruit apple4a = new Fruit("Apple4",R.drawable.ic_launcher);
		fruitList.add(apple4a);
		Fruit apple5a = new Fruit("Apple5",R.drawable.ic_launcher);
		fruitList.add(apple5a);
		Fruit apple6a = new Fruit("Apple6",R.drawable.ic_launcher);
		fruitList.add(apple6a);
		Fruit appleb = new Fruit("Apple",R.drawable.ic_launcher);
		fruitList.add(appleb);
		Fruit apple1b = new Fruit("Apple1",R.drawable.ic_launcher);
		fruitList.add(apple1b);
		Fruit apple2b = new Fruit("Apple2",R.drawable.ic_launcher);
		fruitList.add(apple2b);
		Fruit apple3b = new Fruit("Apple3",R.drawable.ic_launcher);
		fruitList.add(apple3b);
		Fruit apple4b = new Fruit("Apple4",R.drawable.ic_launcher);
		fruitList.add(apple4b);
		Fruit apple5b = new Fruit("Apple5",R.drawable.ic_launcher);
		fruitList.add(apple5b);
		Fruit apple6b = new Fruit("Apple6",R.drawable.ic_launcher);
		fruitList.add(apple6b);
	}
class Fruit{
	private String name;
	private int imageId;
	public Fruit(String name,int imageId)
	{
		this.name = name;
		this.imageId = imageId;
	}
	public String getId()
	{
		return name;
	}
	public int getImageId()
	{
		return imageId;
	}
}


}
