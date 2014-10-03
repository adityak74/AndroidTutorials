package com.adityak74.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;



public class ShowActivity extends Activity{
	
	TextView tv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.showactivity_main);
		tv = (TextView) findViewById(R.id.textView1);
		String text1 = (String)getIntent().getExtras().getString("text1");
		String text = (String)getIntent().getExtras().getString("text");
		tv.setText(text + " " + text1);
		Toast.makeText(getApplicationContext(), "Activity 2", Toast.LENGTH_LONG).show();
		
	}
}