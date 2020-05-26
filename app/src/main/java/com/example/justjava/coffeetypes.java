package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class coffeetypes extends AppCompatActivity  {
    public static final String status ="com.example.JustJava.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffeetypes);

    }
    public void esOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderEsCoffee";
        i.putExtra(status,message);
        startActivity(i);
    }
    public void laOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderLaCoffee";
        i.putExtra(status,message);
        startActivity(i);
    }
    public void caOrder(View view) {
        Intent i = new Intent(this, order.class);
        String message = "orderCaCoffee";
        i.putExtra(status, message);
        startActivity(i);
    }
    public void mOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderMoCoffee";
        i.putExtra(status,message);
        startActivity(i);
    }
    public void lbOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderLbCoffee";
        i.putExtra(status,message);
        startActivity(i);
    }
}