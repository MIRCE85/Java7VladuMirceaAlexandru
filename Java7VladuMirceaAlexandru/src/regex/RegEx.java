/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vladu
 */
public class RegEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scannerRegex = new Scanner(System.in);
           System.out.println("Insert regex or pattern to be searched: ");
        // read the regular expresion
        String regex = scannerRegex.next();
// create a pattern using introduced regular expresion
Pattern pattern = Pattern.compile(regex);
// read the source string using a new Scanner object
Scanner scannerSourceString = new Scanner(System.in);

System.out.println("Insert source string: ");
String source = scannerSourceString.next();
// create the matcher as result of applying regex on source string
Matcher matcher = pattern.matcher(source);
boolean found = false;
// if the regular expression or pattern was found
while (matcher.find()) {
String result;
result = String.format("I found text \"%s\" starting at " +
"index %d until index %d.",
matcher.group(),
matcher.start(),
matcher.end());
System.out.println(result);
found = true;
}
// if regular expression or pattern was not found in source string
if (!found) {
System.out.println("No match found :(");
}
      
//^1|^2
         //  
         


         
         
         // varianta 1: ^((1|2)\d{2}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])\d{6})$
         //1850418000000   --merge CNP normal
         //1851318000000  -- nu merge luna = 13
         //3850418000000-- nu merge - cnp nu incepe cu 3
         //1850431000000 -- merge desi Aprilie nu are 31 de zile!!
         //1850229000000 -- merge dar 85 nu era an bisect!!
         //18504180000000 -- nu merge dimensiune peste 13
         
         
         
         
         // data format yyyy/mm/dd cu bisect si validare ^(?:\d{4}\/(?:(?:(?:(?:0[13578]|1[02])\/(?:0[1-9]|[1-2][0-9]|3[01]))|(?:(?:0[469]|11)\/(?:0[1-9]|[1-2][0-9]|30))|(?:02\/(?:0[1-9]|1[0-9]|2[0-8]))))|(?:(?:\d{2}(?:0[48]|[2468][048]|[13579][26]))|(?:(?:[02468][048])|[13579][26])00)\/02\/29)$
         // data format yy/mm/dd cu bisect si validare NU E OK ^(?:\d{2}\/(?:(?:(?:(?:0[13578]|1[02])\/(?:0[1-9]|[1-2][0-9]|3[01]))|(?:(?:0[469]|11)\/(?:0[1-9]|[1-2][0-9]|30))|(?:02\/(?:0[1-9]|1[0-9]|2[0-8]))))|(?:(?:\d{2}(?:0[48]|[2468][048]|[13579][26]))|(?:(?:[02468][048])|[13579][26])00)\/02\/29)$
         // data format yymm/dd cu bisect si validare NU E OK  ^(?:\d{2}(?:(?:(?:(?:0[13578]|1[02])\/(?:0[1-9]|[1-2][0-9]|3[01]))|(?:(?:0[469]|11)\/(?:0[1-9]|[1-2][0-9]|30))|(?:02\/(?:0[1-9]|1[0-9]|2[0-8]))))|(?:(?:\d{2}(?:0[48]|[2468][048]|[13579][26]))|(?:(?:[02468][048])|[13579][26])00)\/02\/29)$
         // data format yymmdd cu bisect si validare TEST NU E OK  ^(?:\d{2}(?:(?:(?:(?:0[13578]|1[02])(?:0[1-9]|[1-2][0-9]|3[01]))|(?:(?:0[469]|11)(?:0[1-9]|[1-2][0-9]|30))|(?:02(?:0[1-9]|1[0-9]|2[0-8]))))|(?:(?:\d{2}(?:0[48]|[2468][048]|[13579][26]))|(?:(?:[02468][048])|[13579][26])00)0229)$

         
         //varianta 2 NU MERGE : ^((1|2)(?:\d{2}(?:(?:(?:(?:0[13578]|1[02])(?:0[1-9]|[1-2][0-9]|3[01]))|(?:(?:0[469]|11)(?:0[1-9]|[1-2][0-9]|30))|(?:02(?:0[1-9]|1[0-9]|2[0-8]))))|(?:(?:\d{2}(?:0[48]|[2468][048]|[13579][26]))|(?:(?:[02468][048])|[13579][26])00)0229)\d{6})$
         //1850418000000   --merge CNP normal
         //1160229000000   -- NUUU
         
         
    }
    
   
    
    
}
