/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialenume;

import java.util.Scanner;

/**
 *
 * @author vladu
 */
public class InitialeNume {

   public static void main(String[] args) {
      // Scanner input = new Scanner(System.in);
       
       String myName = "Vladu Mircea Alexandru";
        StringBuffer myInitials = new StringBuffer();
        int length = myName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i)+"*");
            }
        }
        System.out.println("My initials are: " + myInitials);
        
                }
            }
  