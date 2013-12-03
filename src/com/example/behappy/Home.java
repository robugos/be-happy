package com.example.behappy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		Button diagnostico = (Button) findViewById(R.id.btnDiagnostico);
		diagnostico.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				loadReportScreen();
			}

			private void loadReportScreen() {
				// TODO Auto-generated method stub
				setContentView(R.layout.report);
			}
		});
		
		

	}

}
