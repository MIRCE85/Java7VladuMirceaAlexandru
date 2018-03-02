/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homemultiprocess;

import java.io.IOException;

/**
 *
 * @author vladu
 */
public class Multiprocess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
        
        Process p1 = pb.start();
        Process p2 = pb.start();
        Process p3 = pb.start();
        
    }
    
}
