package com.evernote.breakofdawn;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class Main extends Activity {
	
	Typeface halisS, halisReg;
	TextView time, alarmTime, alarmAM, weekday, monthday, weatherHigh, weatherLow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		halisS = Typeface.createFromAsset(getAssets(), "HalisSRegular.otf");
		halisReg = Typeface.createFromAsset(getAssets(), "HalisRegular.otf");
		time = (TextView)findViewById(R.id.time);
		time.setTypeface(halisS);
		alarmTime = (TextView)findViewById(R.id.alarm_time);
		alarmTime.setTypeface(halisS);
		alarmAM = (TextView)findViewById(R.id.alarm_am);
		alarmAM.setTypeface(halisS);
		weekday = (TextView)findViewById(R.id.weekday);
		weekday.setTypeface(halisReg);
		monthday = (TextView)findViewById(R.id.monthDay);
		monthday.setTypeface(halisS);
		weatherHigh = (TextView)findViewById(R.id.weather_high);
		weatherHigh.setTypeface(halisS);
		weatherLow = (TextView)findViewById(R.id.weather_low);
		weatherLow.setTypeface(halisS);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
