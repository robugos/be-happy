package com.example.behappy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MailReport extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mail_report);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mail_report, menu);
		return true;
	}

}
