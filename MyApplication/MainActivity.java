package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText txtfname,txtlname,txtpadd,txtcity,txtstate,txtpin,txtphone,txtmob,txtdesc;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtfname = findViewById(R.id.fname);
        txtlname = findViewById(R.id.lname);
        txtpadd = findViewById(R.id.padd);
        txtcity = findViewById(R.id.city);
        txtstate = findViewById(R.id.state);
        txtpin = findViewById(R.id.pincode);
        txtphone = findViewById(R.id.phone);
        txtmob = findViewById(R.id.mobile);
        txtdesc = findViewById(R.id.desc);
        btn =  findViewById(R.id.button);
        intentlistner();
    }

    private void intentlistner() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("fname",txtfname.getText().toString());
                i.putExtra("lname",txtlname.getText().toString());
                i.putExtra("padd",txtpadd.getText().toString());
                i.putExtra("city",txtcity.getText().toString());
                i.putExtra("state",txtstate.getText().toString());
                i.putExtra("pin",txtpin.getText().toString());
                i.putExtra("phone",txtphone.getText().toString());
                i.putExtra("mob",txtmob.getText().toString());
                i.putExtra("desc",txtdesc.getText().toString());
                startActivity(i);
                finish();
            }
        });
    }
}