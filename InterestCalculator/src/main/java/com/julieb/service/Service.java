/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.service;

import com.julieb.controller.Controller;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/**
 *
 * @author julie
 */
public class Service {
    Controller control = new com.julieb.controller.Controller();
    
    BigDecimal interest;
    BigDecimal principal;
    Double years;
    
    public void receiveValues(String[] values){
    
   String fixedInterest = "."+values[0];     
        
    this.interest =  new BigDecimal(fixedInterest);
    this.principal = new BigDecimal (values[1]);
    this.years = Double.parseDouble(values[2]);
    
    }
    
    public HashMap<String,String[]> returnValues(){
        return control.calculateInterest( interest.setScale(2, RoundingMode.CEILING), principal.setScale(2, RoundingMode.CEILING),years);

    }
}
