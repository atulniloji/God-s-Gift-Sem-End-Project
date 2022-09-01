package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txtfname,txtlname,txtpadd,txtcity,txtstate,txtpin,txtphone,txtmob,txtdesc;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtfname = findViewById(R.id.first);
        txtlname = findViewById(R.id.last);
        txtpadd = findViewById(R.id.add);
        txtcity = findViewById(R.id.lcity);
        txtstate = findViewById(R.id.lstate);
        txtpin = findViewById(R.id.pin);
        txtphone = findViewById(R.id.fone);
        txtmob = findViewById(R.id.cell);
        txtdesc = findViewById(R.id.desci);
        btn = (Button)findViewById(R.id.sbutton);

        Intent intent = getIntent();
        String firstn = intent.getStringExtra("fname");
        txtfname.setText(firstn);
        String lastn = intent.getStringExtra("lname");
        txtlname.setText(lastn);
        String padd = intent.getStringExtra("padd");
        txtpadd.setText(padd);
        String city = intent.getStringExtra("city");
        txtcity.setText(city);
        String state = intent.getStringExtra("state");
        txtstate.setText(state);
        String pin = intent.getStringExtra("pin");
        txtpin.setText(pin);
        String phone = intent.getStringExtra("phone");
        txtphone.setText(phone);
        String mob = intent.getStringExtra("mob");
        txtmob.setText(mob);
        String desc = intent.getStringExtra("desc");
        txtdesc.setText(desc);
        resubmit();
    }

    private void resubmit() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}