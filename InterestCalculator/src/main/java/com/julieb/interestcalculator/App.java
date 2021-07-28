/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.interestcalculator;

import com.julieb.service.Service;
import com.julieb.ui.UI;


/**
 *
 * @author julie
 * 
 * Amount each quarter = CurrentBalance * (1 + (QuarterlyInterestRate / 100))
 * 
 * Prompt for the following inputs and use those inputs in the calculations:
    * The annual interest rate
    * The initial amount of principal
    * The number of years the money is to stay in the fund
    
 * The output should include the following for each year:
    * The year number
    * The principal at the beginning of the year
    * The total amount of interest earned for the year
    * The principal at the end of the year
** Extra: Change the program so that the user can choose from quarterly, monthly, or daily interest compound periods.
 * 
 * 
 */
public class App {
    public static void main(String args[]){
    
    UI ui = new com.julieb.ui.UI();
    Service service = new com.julieb.service.Service();
    
    
    System.out.println("===Interest Calculator===");
    service.receiveValues(ui.menu());
    
    
    System.out.println("Calculating....");
    UI.displayValues(service.returnValues());
    
    }
}
