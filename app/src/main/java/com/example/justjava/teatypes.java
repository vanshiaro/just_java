package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class teatypes extends AppCompatActivity{
    public static final String status ="com.example.JustJava.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teatypes);

    }
    public void gtOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderGT";
        i.putExtra(status,message);
        startActivity(i);
    }
    public void btOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderBT";
        i.putExtra(status,message);
        startActivity(i);
    }
    public void htOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderHT";
        i.putExtra(status,message);
        startActivity(i);
    }
    public void ctOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderCT";
        i.putExtra(status,message);
        startActivity(i);
    }
    public void ttOrder(View view){
        Intent i= new Intent(this,order.class);
        String message = "orderTT";
        i.putExtra(status,message);
        startActivity(i);
    }
}