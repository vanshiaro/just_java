package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;

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
        Beverage beverage = new Beverage(message,90);
        i.putExtra(status, beverage);
        startActivity(i);
    }
    public void laOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderLaCoffee";
        Beverage beverage = new Beverage(message,90);
        i.putExtra(status,message);
        startActivity(i);
    }
    public void caOrder(View view) {
        Intent i = new Intent(this, order.class);
        String message = "orderCaCoffee";
        Beverage beverage = new Beverage(message,90);
        i.putExtra(status, beverage);
        startActivity(i);
    }
    public void mOrder(View view){
        Intent i= new Intent(this,order.class);

        String message = "orderMoCoffee";
        Beverage beverage = new Beverage(message,90);
        i.putExtra(status, beverage);
        startActivity(i);
    }
    public void lbOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderLbCoffee";
        Beverage beverage = new Beverage(message,90);
        i.putExtra(status, beverage);
        startActivity(i);
    }
}