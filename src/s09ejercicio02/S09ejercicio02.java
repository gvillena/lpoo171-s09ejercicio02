/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S09ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int year = Integer.parseInt(reader.nextLine());
        
        if ((year % 4) == 0 && (year % 100) == 0 && (year%400 == 0)) {
            System.out.println("¡El año es bisiesto!");
        }
        
        if ((year % 4) == 0 && (year % 100) == 0 && (year%400 != 0)) {
            System.out.println("¡El año no es bisiesto!");
        }
        
        if ((year % 4) == 0 && (year % 100) != 0 && (year%400 != 0)) {
            System.out.println("¡El año es bisiesto!");
        }
        
        if ((year % 4) != 0 && (year % 100) != 0 && (year%400 != 0)) {
            System.out.println("¡El año no es bisiesto!");
        }
        
        
        
                
        
                
    }
    
}
