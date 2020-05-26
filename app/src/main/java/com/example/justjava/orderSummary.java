package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class orderSummary extends AppCompatActivity {
    public static final String status = "com.example.justjava.MESSAGE";
    public static  final Map<String,String> teaTypes= new HashMap<String,String>(){{
        put("orderGT", "GREEN TEA");
        put("orderBT", "BLACK TEA");
        put("orderHT", "HERBAL TEA");
        put("orderCT", "CHAMOMILE TEA");
        put("orderTT", "TANDOORI TEA");
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);
        Intent i = getIntent();
        Order finalorder = (Order)i.getSerializableExtra(order.status);
        TextView beverage = (TextView) findViewById(R.id.beverage);
        TextView quantity = (TextView) findViewById(R.id.quantity);
        TextView rate = (TextView) findViewById(R.id.rate);
        TextView total = (TextView) findViewById(R.id.total);
        if(finalorder!=null){
            Log.d("name", String.valueOf(finalorder.getTotal()));
            beverage.setText(String.format("Beverage: %s", finalorder.getName()));
            quantity.setText(String.format("Quantity: %s", String.valueOf(finalorder.getQuantity())));
            rate.setText(String.format("Rate: \u20B9 %s", String.valueOf(finalorder.getPrice())));
            total.setText(String.format("Total: \u20B9 %s", String.valueOf(finalorder.getTotal())));
        }


    }
    public void display(String s) {



    }

    public void lastActivity(View view){
        Intent i = new Intent(this,last.class);
        startActivity(i);
    }

}
