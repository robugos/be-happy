package com.example.behappy;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	
	private MediaPlayer media = null;
	
	public void startMusic(int musica){
		if (media != null){
			if (media.isPlaying()){
				media.stop();
			}
			media = MediaPlayer.create(this,musica);
			media.start();			
		}
		else{
			media = MediaPlayer.create(this,musica);
			media.start();			
		}
		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		ImageButton amarelo = (ImageButton) findViewById(R.id.ibtnAmarelo);		
		amarelo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				/*ESSA EH A CHAMADA DA FUNCAO PARA INICIAR A MUSICA
				 * armazena a musica em res/raw (mp3). 'test' eh o nome de um arquivo de musica
				 */
				startMusic(R.raw.test);
				chamaFonte();
			}
		});
		
		ImageButton azul = (ImageButton) findViewById(R.id.ibtnAzul);		
		azul.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				chamaFonte();
			}
		});
		
		ImageButton verde = (ImageButton) findViewById(R.id.ibtnVerde);		
		verde.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				chamaFonte();
			}
		});
		
		ImageButton vermelho = (ImageButton) findViewById(R.id.ibtnVermelho);		
		vermelho.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				chamaFonte();
			}
		});
	}
	
	public void chamaFonte(){
		Intent entra = new Intent(this, Fonte.class);
		entra.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(entra);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
