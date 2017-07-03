/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Arrays;

/**
 *
 * @author Jianwen
 */
public class Order {

    public String productName = "";
    public double price = 0;
    public int discount = 0;
    public int quantity = 0;
    public double total = 0;
    public String message = "";

    boolean isDiscounted = false;
    boolean isValidOrder = true;

    public static int orderNum = 0;

    String[] products = new String[]{"Compass", "Eraser", "Pen", "Pencil", 
        "Pencil Case", "Pencil Sharpener", "Ruler", "Scissors"};
    double[] prices = new double[]{4.5, 0.5, 0.3, 0.6, 10, 0.3, 1.2, 2.5};

    public Order() {
        orderNum++;
        isValidOrder = false;
        message = "**ERROR**: Order number cannot be totalled as no details "
                + "have been supplied";
    }

    public Order(String name, int quant) {
        orderNum++;
        productName = name;
        testQuantity(quant);
        getPrice(name);
        if (isValidOrder == true) {
            calculate();
        }
    }

    public Order(String name, int quant, int disc) {
        orderNum++;
        productName = name;
        testQuantity(quant);
        testDiscount(disc);
        getPrice(name);
        if (isValidOrder == true) {
            calculate();
        }
    }

    public void testQuantity(int quant) {
        if (quant <= 0) {
            isValidOrder = false;
            message = "**ERROR**: Invalid quantity. Quantity cannot be 0 or less";
        } else if (quant >= 1000) {
            isValidOrder = false;
            message = "**ERROR**: Invalid quantity. Quantity cannot be greater than 1000";
        } else {
            quantity = quant;
        }
    }

    public void testDiscount(int disc) {
        if (disc <= 0) {
            isValidOrder = false;
            message = "**ERROR**: The discount rate cannot be lower than or equal to 0";
        } else if (disc >= 50) {
            isValidOrder = false;
            message = "**ERROR**: The discount rate cannot be greater than 50";
        } else {
            discount = disc;
            isDiscounted = true;
        }
    }

    public void getPrice(String name) {
        int index;
        index = Arrays.binarySearch(products, name);
        if(index >= 0){
            price = prices[index];
        }
        else{
            isValidOrder = false;
            message = "**ERROR**: Invalid product name";
        }
        
    }

    public void calculate() {
        if (isDiscounted == false){
            total = quantity * price;
        }
        else{
            total = quantity * price - quantity * price * (double)discount/100;
        }
    }
    
    public String getOrderDetails(){
        java.text.DecimalFormat pf = new java.text.DecimalFormat("##0elq.00");       
        java.text.DecimalFormat tf = new java.text.DecimalFormat("###.0");
        
        if (isValidOrder == true && isDiscounted == false){
            message = "Order Number: " + orderNum + "\nProduct Name: " + productName + 
                    "\nProduct Price: $" + pf.format(price) + "\nOrder Quantity: " + 
                    quantity + "\nTotal Price: $" + tf.format(total);
        }
        else if (isValidOrder == true && isDiscounted == true){
            message = "Order Number: " + orderNum + "\nProduct Name: " + productName + 
                    "\nProduct Price: $" + pf.format(price) + "\nOrder Quantity: " + 
                    quantity + "\nDiscount: " + tf.format(discount) + "%\nTotal Price: $" + 
                    tf.format(total);
        }
        return message;
    }

}
