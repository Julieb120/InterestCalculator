/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/**
 *
 * @author julie
 */
public class Controller {
     /* Amount each quarter = CurrentBalance * (1 + (QuarterlyInterestRate / 100))
    
    */
    
    public HashMap<String,String[]> calculateInterest( BigDecimal interest, BigDecimal principal, Double years){
        int year;
        String values[] = new String[3];
        BigDecimal currentBalance = principal;
        BigDecimal finalBalance;
        BigDecimal difference;
        
        
        
        HashMap<String,String[]> interestCompounded = new HashMap<>();
        
        for (int i=1; i<= years; i++){
           
            finalBalance = currentBalance.multiply (
                    ( BigDecimal.valueOf(1)
                            .add((interest
                                    .divide(BigDecimal.valueOf(100) )))).setScale(2, RoundingMode.CEILING)
            );
            
            difference = finalBalance.subtract(currentBalance);
            
            values[0] = currentBalance.setScale(2, RoundingMode.CEILING).toString();
            values[1]= difference.setScale(2,RoundingMode.CEILING).toString();
            values[2]= finalBalance.setScale(2,RoundingMode.CEILING).toString();
            
            interestCompounded.put(String.valueOf(i), values);
            
            currentBalance = finalBalance;
        
        }
        
        return interestCompounded;
    }
    
}
