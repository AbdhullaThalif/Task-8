package javaprogramming;

import java.util.*;

public class Task_8_4 {
	    
	    public static void main(String[] args) {  
	       int x, y, z;
	       Scanner scr = new Scanner(System.in);  
	       System.out.println("Enter the value of X");  
	       x = scr.nextInt();  
	       System.out.println("Enter the value of Y");
	       y = scr.nextInt();  
	       System.out.println("Before Swapping : "+"X = "+ x +"  "+"Y = "+ y); 
	       z = x;  
	       x = y;  
	       y = z;  
	       System.out.println("After Swapping : "+"X = "+ x +"  "+"Y= "+ y);   
	    }    
	}  

