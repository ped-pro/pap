package com.example.pap;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.slash);
		MediaPlayer ourSong = MediaPlayer(splash.this,);
		Thread test = new Thread(){
			public void run(){
				try{
					
					sleep(2000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent open = new Intent("com.example.pap.MainActivity");
					startActivity(open);
				}
			}
		};
		test.start();
	}

}
