package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class teatypes extends AppCompatActivity{
    public static final String status ="com.example.JustJava.MESSAGE";
    Beverage beverage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teatypes);

    }
    public void gtOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderGT";
        beverage = new Beverage(message,50);
        i.putExtra(status,beverage);
        startActivity(i);
    }
    public void btOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderBT";
        beverage = new Beverage(message,30);
        i.putExtra(status,beverage);
        startActivity(i);
    }
    public void htOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderHT";
        beverage = new Beverage(message,50);
        i.putExtra(status,beverage);
        startActivity(i);
    }
    public void ctOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderCT";
        beverage = new Beverage(message,80);
        i.putExtra(status,beverage);
        startActivity(i);
    }
    public void ttOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderTT";
        beverage = new Beverage(message,100);
        i.putExtra(status,beverage);
        startActivity(i);
    }
}