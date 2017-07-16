package com.example.sunayanam.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button donor = (Button) findViewById(R.id.donor);
        final Button recipient = (Button) findViewById(R.id.recipient);
        donor.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View view) {
                                          Intent bLogin = new Intent(Main.this, MainActivity.class);
                                          Main.this.startActivity(bLogin);
                                      }
                                  }
        );
        recipient.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View view) {
                                         Intent recipient = new Intent(Main.this, RegisterActivity.class);
                                         Main.this.startActivity(recipient);
                                     }
                                 }
        );

    }
}
