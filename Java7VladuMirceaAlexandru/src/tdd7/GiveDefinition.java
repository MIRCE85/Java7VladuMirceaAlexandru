/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd7;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author vladu
 */
public class GiveDefinition {


    public static void main(String[] args) {
        // creaza o lista of figures
    LinkedList<GeometricalFigure> listoffigures = new LinkedList();
    listoffigures.add(new Triangle());
    listoffigures.add(new Triangle());
    listoffigures.add(new Rectangle());
    listoffigures.add(new Circle());
    listoffigures.add(new Square());
        
     for (GeometricalFigure currentFigure:listoffigures){
        
         System.out.println(currentFigure.getDefinition());
         
          }
    
}
}

