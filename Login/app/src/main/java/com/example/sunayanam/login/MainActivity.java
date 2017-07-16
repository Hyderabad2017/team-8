package com.example.sunayanam.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etUsername =(EditText) findViewById(R.id.etUsername);
        final EditText etPassword =(EditText) findViewById(R.id.etPassword);

        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this,RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });

        try {
            URL url = new URL("10.49.190.144/unitedway/donorregister.php?pwd=etPassword+un=etUsername");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        }
        catch (Exception e) {
        }

        bLogin.setOnClickListener(new View.OnClickListener()
                                  {
                                      public void onClick(View view)
                                      {
                                          Intent bLogin = new Intent (MainActivity.this,Notification.class);
                                          MainActivity.this.startActivity(bLogin);
                                      }
                                  }
        );

    }
}
