package com.example.cp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//first application
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//View is an element in th UI - in this case this is the button
public void doClick(View view){
    Toast.makeText(this,"This is a Toast",Toast.LENGTH_SHORT).show();
}
}


