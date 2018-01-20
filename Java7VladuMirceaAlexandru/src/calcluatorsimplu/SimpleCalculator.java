/*
Simple Calculator
 */
package calcluatorsimplu;

import java.util.Scanner;

/**
 *
 * @author vladu
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //1. Display in console "Please introduce your first number:"
            //2. Read first number from console
            //3. Please introduce operator(+/-/*//)
            //4. Read operator
            //5. Please introduce second number
            //6. Read second number from console
            //7. Please introduce "="
            //8. Read from console
            //9. Result is: 
            //10. Display final result 
        
        System.out.println("Please introduce your first number:");
        Scanner keyboard = new Scanner(System.in);
        
        
        //String input = System.console().readLine();
        
        String input =keyboard.nextLine();
        
        
                
        int firstNumber = Integer.parseInt(input);
        
        System.out.println("Please introduce your operator (+/-/*//)");
        Scanner keyboard1 = new Scanner(System.in);
        input =keyboard1.nextLine();
        
               
        //input = System.console().readLine();
          //se poate folosi iar input deoarece el este doar un vessel in care se tin datele. 
          //el se incarca in fisrtnumber, in operation si in second number. EL DOAR CITESTE ce scrie pe consola
        
          
          char operation = input.charAt(0);
   
        System.out.println("Please introduce your second number:");
        //input = System.console().readLine();
        Scanner keyboard2 = new Scanner(System.in);
        input =keyboard2.nextLine();
        
        
        int secondNumber = Integer.parseInt(input);
        
        
        int result = 0;
        
        
        switch(operation){
            case '+': result = firstNumber + secondNumber; 
                break;
            case '-': result = firstNumber - secondNumber; 
                break;                
            case '*': result = firstNumber * secondNumber; 
                break;     
            case '/': result = firstNumber / secondNumber; 
                break;          
            default: System.out.println("Sorry, you introduced wrong data. I quit :)\" and close the program (end it ;))");
        }
            System.out.println("Result is:" + result);
        }
                    
            // la default nu mai are sens acel BREAK....    
        }
        
        
        
         
   



