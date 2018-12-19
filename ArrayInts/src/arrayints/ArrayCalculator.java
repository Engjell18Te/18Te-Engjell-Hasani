/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayints;

import java.util.Scanner;

/**
 *
 * @author engjell.hasani
 */
public class ArrayCalculator {

    public static void main(String[] args) {
        // Arrau för att spara tal i.
        int[] tal = new int [10];
        
        // Scammer för att låsa in från Hugo 
        Scanner hugo = new Scanner (System.in);
        //läs in 10 tal 
         for (int i = 0; i < tal.length; i++) {
    tal[i] = hugo.nextInt();
    }
         int summa = 0;
         for (int i = 0; i< tal.length; i++){
          summa = summa + tal[i]; 
             }
    
    System.out.println("Summan är: "+summa);
    
    int storstaTalet = Integer.MIN_VALUE;
    for (int i = 0; i < tal.length; i++){
        if (tal[i] > storstaTalet) {
            storstaTalet = tal[i];
        }
    }
}
    
    
}
