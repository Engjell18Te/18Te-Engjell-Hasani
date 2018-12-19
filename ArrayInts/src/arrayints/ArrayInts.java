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
public class ArrayInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TOD O code application logic here
        Scanner keyboard = new Scanner(System.in);
    int[] tal = new int[10]; // Array eller fält med plats för 10 int
    System.out.println("tal har längden: " + tal.length);
    
    for (int i = 0; i < tal.length; i++) {
    tal[i] = keyboard.nextInt();
    }
    for (int i = 0; i <tal.length; i++)
        System.out.println("Tal["+i+"] = "+tal[i]);
    }
    
}
