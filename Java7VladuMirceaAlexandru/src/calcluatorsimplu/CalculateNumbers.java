/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcluatorsimplu;

import java.util.Scanner;

/**
 *
 * @author vladu
 */
public class CalculateNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x,y,z;
                       
        char operatiune;
        
      // char[] opvector = {'+','-','*','/'};
        
        z=0;
                
        System.out.println("Enter two numbers to calculate.");
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        x = in.nextInt();
        System.out.print("y=");
        y = in.nextInt();
        System.out.print("Operations is: + / - / * / / ?");
        Scanner op = new Scanner(System.in);
        operatiune = op.nextLine().charAt(0);  //MERGE DIRECT ASA.. fara sa mai treci prin ceva
        //operatiune = input.charAt(0);
        
            switch(operatiune){
            case '+': z = x + y; 
                break;
            case '-': z = x - y; 
                break;                
            case '*': z = x * y; 
                break;     
            case '/': z = x / y; 
                break;          
            default: System.out.println("Sorry, you introduced wrong data. I quit :)");   
                }
        
                
        System.out.println("Result of entered integers with " + operatiune + " operation is " + z);   // TODO code application logic here
    }
    
}
