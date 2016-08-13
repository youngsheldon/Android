package com.youngsheldon.intentactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		Intent intent = getIntent();
		String data = intent.getStringExtra("key");
		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText(data);

	}

	public void onMyClickListener0(View v)
	{
		TextView textView = (TextView) findViewById(R.id.textView1);
		Intent intent = getIntent();
		String data = intent.getStringExtra("key");
		textView.setText(data);
	}

	public void onMyClickListener(View v)
	{
		EditText editText = (EditText) findViewById(R.id.editText1);
		String data = editText.getText().toString();

		Intent intent = new Intent();
		intent.putExtra("key", data);
		setResult(RESULT_OK, intent);
		finish();
	}

	@Override
	public void onBackPressed()
	{
		EditText editText = (EditText) findViewById(R.id.editText1);
		String data = editText.getText().toString();

		Intent intent = new Intent();
		intent.putExtra("key", data);
		setResult(RESULT_OK, intent);
		finish();
	}

}
