package com.example.raffy.imaginem_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Raffy on 17/10/2017./tonikami/NEWLoginRegister
 */

public class Registration extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        final EditText username= (EditText)findViewById(R.id.reg_username);
        final EditText password= (EditText)findViewById(R.id.reg_password);
        final Button button= (Button) findViewById(R.id.reg_button);
        //final EditText id= (EditText)findViewById(R.id.reg_username);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final String user= username.getText().toString();
                final String pass= password.getText().toString();

                Intent access= new Intent(Registration.this, MainActivity.class);
                Registration.this.startActivity(access);
            }

        });


        // MANCA LA PARTE DEL RESPONSE DAL DATABASE
    }
}
