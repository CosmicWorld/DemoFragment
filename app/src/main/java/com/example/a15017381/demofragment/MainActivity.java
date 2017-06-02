package com.example.a15017381.demofragment;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import layout.FragmentFirst;
import layout.FragmentSecond;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnDelete = (Button) findViewById(R.id.btnDelete);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Fragment f1 = new FragmentFirst();
        ft.replace(R.id.frame1, f1);

        Fragment f2 = new FragmentSecond();
        ft.replace(R.id.frame2, f2);

        ft.commit();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                Fragment f3 = new FragmentFirst();
                ft.add(R.id.fragment_container, f3);

                ft.commit();
            }
        });
    }
}
