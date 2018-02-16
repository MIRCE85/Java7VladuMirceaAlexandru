/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta;

/**
 *
 * @author vladu
 */
public class Bicycle {

    public Bicycle() {
    }

    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    
    public Bicycle(int cadence1, int speed1, int gear1) {
    cadence =cadence1;
    speed = speed1;
    gear = gear1;
    
        
    
    }

    

    
    

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:"
                + cadence + " speed:"
                + speed + " gear:" + gear);
    }
}
