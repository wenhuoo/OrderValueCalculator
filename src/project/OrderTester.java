/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Jianwen
 */
public class OrderTester {

    public static String message = "";
    public static String msg = "";

    public static void testCase1(){
        Order testCase1 = new Order();
        message += "Test case 1: \n" + testCase1.getOrderDetails() + "\n\n";
    }
    
    public static void testCase2(){
        Order testCase2 = new Order("Pencil", 5);
        message += "Test case 2: \n" + testCase2.getOrderDetails() + "\n\n";
    }
    
    public static void testCase3(){
        Order testCase3 = new Order("Compass", 35, 90);
        message += "Test case 3: \n" + testCase3.getOrderDetails() + "\n\n";
    }
    
    public static void testCase4(){
        Order testCase4 = new Order("Scissors", 60000, 15);
        message += "Test case 4: \n" + testCase4.getOrderDetails() + "\n\n";
    }
    
    public static void testCase5(){
        Order testCase5 = new Order("Eraser", 20, 8);
        message += "Test case 5: \n" + testCase5.getOrderDetails() + "\n\n";
    }
    
    public static void testCase6(){
        Order testCase6 = new Order("Pencil Sharpener", 60, 40);
        message += "Test case 6: \n" + testCase6.getOrderDetails() + "\n\n";
    }
    
    public static void testCase7(){
        Order testCase7 = new Order("Ruler", 60, 40);
        message += "Test case 7: \n" + testCase7.getOrderDetails() + "\n\n";
    }
    
    public static void testCase8(){
        Order testCase8 = new Order("Pen", 8, -5);
        message += "Test case 8: \n" + testCase8.getOrderDetails() + "\n\n";
    }
    
    public static void testCase9(){
        InternalOrder testCase9 = new InternalOrder("Pen", 17); 
        msg = testCase9.printInternalReport();
        message += msg + "\n" + "Test case 9: \n" + testCase9.getOrderDetails() + "\n\n";
    }
    
    public static void testCase10(){
        InternalOrder testCase10 = new InternalOrder("Mirror", 26);
        msg = testCase10.printInternalReport();
        message += msg + "\n" + "Test case 10: \n" + testCase10.getOrderDetails() + "\n\n";
    }
    
}
