package com.example.tablelayoutexample;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class TableActivity extends Activity {
	Typeface fontface;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_table);
		fontface = Typeface.createFromAsset(this.getAssets(),
				"fonts/georgiab.ttf");
		TextView tv = (TextView) findViewById(R.id.txtModel);
		tv.setTypeface(fontface);
		tv = (TextView) findViewById(R.id.txtPrice);
		tv.setTypeface(fontface);
		tv = (TextView) findViewById(R.id.txtReleaseDate);
		tv.setTypeface(fontface);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_table, menu);
		return true;
	}

}
