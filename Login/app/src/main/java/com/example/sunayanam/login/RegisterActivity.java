package com.example.sunayanam.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etName =(EditText) findViewById(R.id.etName);
        final EditText etUsername =(EditText) findViewById(R.id.etUsername);
        final EditText etPassword =(EditText) findViewById(R.id.etPassword);
        final EditText etPhone =(EditText) findViewById(R.id.etPhone);
        final EditText etBloodgroup =(EditText) findViewById(R.id.etBloodgroup);
        final EditText etHeight =(EditText) findViewById(R.id.etHeight);
        final EditText etWeight =(EditText) findViewById(R.id.etWeight);
        final EditText etDob =(EditText) findViewById(R.id.etDob);
        final Button bRegister = (Button) findViewById(R.id.bRegister);

    }

}
