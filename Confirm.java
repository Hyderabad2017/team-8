package com.example.recev;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;



	public class Confirm extends Activity {

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        Toast.makeText(getApplicationContext(), "You have successfully logged in",Toast.LENGTH_LONG).show();
	    }


	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }
	    
	}


