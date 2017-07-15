package com.example.sunayanam.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        final Button bCheck = (Button) findViewById(R.id.bCheck);

        bCheck.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View view) {
                                          Intent bLogin = new Intent(Notification.this, BloobBank.class);
                                          Notification.this.startActivity(bLogin);
                                      }
                                  }
        );
    }

}
