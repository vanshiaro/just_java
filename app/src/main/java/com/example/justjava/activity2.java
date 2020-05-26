package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity2 extends AppCompatActivity {
    //public static final String status ="com.example.JustJava.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
    }
    public void orderCoffee(View view){
        Intent i = new Intent(this,coffeetypes.class);
        startActivity(i);
    }
    /**public void orderCoffee(View view){
        Intent i= new Intent(activity2.this,order.class);
        String message = "orderCoffee";
        i.putExtra(status,message);
        startActivity(i);

    }
    public void orderTea(View view){
        Intent i= new Intent(activity2.this,order.class);
        String message = "orderTea";
        i.putExtra(status,message);
        startActivity(i);
    } */

    public void orderTea(View view){
        Intent i = new Intent(this,teatypes.class);
        startActivity(i);
    }
}

