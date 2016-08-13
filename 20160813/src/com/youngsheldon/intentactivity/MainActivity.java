package com.youngsheldon.intentactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onMyButtonClikListener0(View v)
	{
		String value = "shelodn";
		Intent intent = new Intent(this, SecondActivity.class);
		intent.putExtra("key", value);
		startActivity(intent);
	}

	public void onMyButtonClikListener(View v)
	{
		EditText editText = (EditText) findViewById(R.id.editText1);
		String data = editText.getText().toString();

		Intent intent = new Intent(this, SecondActivity.class);
		intent.putExtra("key", data);
		startActivityForResult(intent, 1);
	}

	public void onMyButtonClikListener2(View v)
	{
		EditText editText = (EditText) findViewById(R.id.editText1);
		String data = editText.getText().toString();

		Intent intent = new Intent(this, ThridActivity.class);
		intent.putExtra("key", data);
		startActivityForResult(intent, 2);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		switch (requestCode)
		{
		case 1:
			if (resultCode == RESULT_OK)
			{
				String ret = data.getStringExtra("key");
				TextView textView = (TextView) findViewById(R.id.textView1);
				textView.setText(ret);
			}

		case 2:
			if (resultCode == RESULT_OK)
			{
				String ret = data.getStringExtra("key");
				TextView textView = (TextView) findViewById(R.id.textView1);
				textView.setText(ret);
			}
			break;
		}
	}

}
