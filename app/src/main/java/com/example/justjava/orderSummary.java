package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class orderSummary extends AppCompatActivity {
    public static final String status = "com.example.justjava.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);
        /**TextView textView = (TextView) findViewById(R.id.summary);
        textView.setPaintFlags(textView.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    */
    }
    public void display(String s) {
        TextView beverage = (TextView) findViewById(R.id.beverage);
        TextView quantity = (TextView) findViewById(R.id.quantity);
        TextView rate = (TextView) findViewById(R.id.rate);
        TextView total = (TextView) findViewById(R.id.total);
        Intent i = getIntent();
        String message = i.getStringExtra(order.status);
        String code = ;
        if(message.equals(str)){
            beverage.setText();
        }

    }

    public void lastActivity(View view){
        Intent i = new Intent(this,last.class);
        startActivity(i);
    }

}
