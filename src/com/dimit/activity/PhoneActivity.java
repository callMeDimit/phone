package com.dimit.activity;

import com.dimit.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends Activity {
	private EditText text;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		text = (EditText) findViewById(R.id.mobile);
		Button button = (Button) this.findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String phoneNumber = text.getText().toString();
				Intent intent = new Intent();
				intent.setAction("android.intent.action.CALL");
				intent.setData(Uri.parse("tel:" + phoneNumber));
				startActivity(intent);
			}

		});
	}
}