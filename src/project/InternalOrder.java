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
public class InternalOrder extends Order{
    private static final int DISCOUNT = 40;
    
    public InternalOrder (String name, int quant){
        super(name, quant, DISCOUNT);
    }
    
    public String printInternalReport(){
        String msg = "Printing internal report...";
        return msg;
    }
}
