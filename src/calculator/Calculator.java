/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author hp
 */
public class Calculator {
public double add(double a,double b) {
	        
	        double first = a;
	       
	        double second = b ;
	        double result;
	        char operator='+';
	        switch(operator)
	        {
	            case '+':
	                result = first + second;
	                break;
	            default:
	                System.out.printf("the operater enterd is not valid");
	                return 0;
	        }

	        return result;
	    }

}
