package com.example.confirm;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       
        Button requestblood=(Button)findViewById(R.id.btn1);
        Button confirmdonor=(Button)findViewById(R.id.btn2);
        
        requestblood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this,MainActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
        
        confirmdonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this,MainActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
    
	   
	      	
	}



@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.main, menu);
return true;
}


        }
    
