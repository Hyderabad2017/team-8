package com.example.sunayanam.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BloobBank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloob_bank);
        final Button bMap = (Button) findViewById(R.id.bMap);

        bMap.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View view) {
                                          Intent bLogin = new Intent(BloobBank.this, MapsActivity.class);
                                          BloobBank.this.startActivity(bLogin);
                                      }
                                  }
        );
    }


    }

