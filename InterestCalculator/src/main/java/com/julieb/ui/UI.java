/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.ui;

import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author julie
 */
public class UI {
    
    Scanner input = new Scanner(System.in);
   /* Prompt for the following inputs and use those inputs in the calculations:
        * The annual interest rate
        * The initial amount of principal
        * The number of years the money is to stay in the fund
    */
    
    
    public String[] menu(){
       
        String values[] = new String[3];
        
        System.out.println("Annual Interest: ");
        values[0] = input.nextLine();
        System.out.println();
       
        
        System.out.println("Initial Principle: ");
        values[1] = input.nextLine();
        System.out.println();
      
        System.out.println("Years: ");
        values[2] = input.nextLine();
        System.out.println();
       
        return values;
    
    }
    
    public static void displayValues(HashMap<String, String[]> values ){
        
        
        for(String k: values.keySet()){
            String results[] = values.get(k);
            
            System.out.format("Year:%s \n"+
                              "Began with:$%s \n"+
                              "Earned:$%s+ \n"+
                              "Ended with:$%s \n"                      
            , k, results[0], results[1], results[2]);
        
        }
    }
    
}
