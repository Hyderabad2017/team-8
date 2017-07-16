package com.example.sunayanam.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class RegisterRec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_rec);


                final EditText etName =(EditText) findViewById(R.id.etName);
                final EditText etUsername =(EditText) findViewById(R.id.etUsername);
                final EditText etPassword =(EditText) findViewById(R.id.etPassword);
                final EditText etPhone =(EditText) findViewById(R.id.etPhone);

                final Button bRegister = (Button) findViewById(R.id.bRegister);
                try {
                    URL url = new URL("10.49.190.144/unitedway/donorregister.php?pwd=etPassword+un=etName+em=etUsername+ph=etPhone+bg=etBloodgroup+ht=etHeight+wt=etWeight+dob=etDob");
                    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                    conn.setDoOutput(true);
                    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
                }
                catch (Exception e) {
                }


                bRegister.setOnClickListener(new View.OnClickListener() {
                                                 public void onClick(View view) {
                                                     Intent bLogin = new Intent(RegisterRec.this,Bloodgroup.class);
                                                     RegisterRec.this.startActivity(bLogin);
                                                 }


                                             }
                );
            }

        }
    }
}
