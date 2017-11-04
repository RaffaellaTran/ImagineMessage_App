package com.example.raffy.imaginem_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Raffy on 17/10/2017.
 */

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        final EditText username= (EditText)findViewById(R.id.log_username);
        final EditText password= (EditText)findViewById(R.id.log_password);
        final TextView registration_link= (TextView) findViewById(R.id.log_registration);
        final Button button= (Button) findViewById(R.id.log_button);

        registration_link.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registration_intent= new Intent(Login.this, Registration.class);
                Login.this.startActivity(registration_intent);

            }

        });

        // MANCA LA PARTE DEL RESPONSE DAL DATABASE


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String user= username.getText().toString();
                final String pass= password.getText().toString();

                Intent access= new Intent(Login.this, MainActivity.class);
                Login.this.startActivity(access);
            }

        });
    }
}
