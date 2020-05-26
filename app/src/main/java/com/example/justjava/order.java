package com.example.justjava;

/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

/**
 * This app displays an order form to order coffee.
 */
public class order extends AppCompatActivity {
    int quantity=0;
    String message="";
    Beverage beverage;
    Order order;
    public static final String status = "com.example.justjava.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent i = getIntent();
        //message = i.getStringExtra(coffeetypes.status);
        beverage = (Beverage)i.getSerializableExtra(coffeetypes.status);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {

        if(quantity>0) {
            int price,total;
            String s = "orderEsCoffee";
            String s1 = "orderLaCoffee";
            String s2 = "orderCaCoffee";
            String s3 = "orderMoCoffee";
            String s4 = "orderLbCoffee";
            String s5 = "orderGT";
            String s6 = "orderBT";
            String s7 = "orderHT";
            String s8 = "orderCT";
            String s9 = "orderTT";
            //String s1 = "orderTea";
            if (beverage.getId().equals(s)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);

            }
            if (beverage.getId().equals(s1)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);

            }
            if (beverage.getId().equals(s2)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);

            }
            if (beverage.getId().equals(s3)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);


            }
            if (beverage.getId().equals(s4)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);


            }
            if (beverage.getId().equals(s5)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);


            }
            if (beverage.getId().equals(s6)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);


            }
            if (beverage.getId().equals(s7)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);

            }
            if (beverage.getId().equals(s8)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);
            }
            if (beverage.getId().equals(s9)) {
                //String count="Items count: "+quantity;
                price = beverage.getPrice();
                total = quantity * price;
                String priceMessage = "Total: \u20B9" + total + "\nThank you!";
                order = new Order(beverage.getName(),quantity,beverage.getPrice(),total);
                displayMessage(priceMessage);
            }
        }
        else {
            String priceMessage = "Select at least 1 to order";
            displayMessage(priceMessage);
        }
    }


    /** This method is called when continue button is clicked

    public void continueOrder(View view){
        Intent i= new Intent(MainActivity.this,order.class);
        startActivity(i);
    }
    /** This
     * method is callled when the + button is clicked
     */
    public void increment(View view) {
        quantity+=1;
        display(quantity);

    }
    /** This method is callled when the - button is clicked
     */
    public void decrement(View view){
        if(quantity>0)
            quantity-=1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(number));

    }
    /**
     * This method displays the given price on the screen.

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance(new Locale("hi","IN")).format(number));
    }
     **/
    public void continueOrder(View view){
        if(quantity>0) {
            Intent intent = new Intent(this, orderSummary.class);
            intent.putExtra(status,order);
            startActivity(intent);
        }
    }
}
/** NumberFormat nf=NumberFormat.getCurrencyInstance(new Locale("hi","IN"));
 priceTextView.setText(nf.getCurrencyInstance().format(number));**/
