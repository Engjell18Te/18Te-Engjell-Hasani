/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsagian;

import java.util.Scanner;

/**
 *
 * @author engjell.hasani
 */
public class Stringsagian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);

        System.out.print("SKRIV NÅGOT:");
        String fromKeyboard = keyboard.nextLine();

        System.out.println("Original: " + fromKeyboard);

        System.out.println("VERSALER: " + fromKeyboard.toUpperCase());
        System.out.println("gemener: " + fromKeyboard.toLowerCase());

        for (int i = 0; i < fromKeyboard.length(); i++) {
            System.out.println(fromKeyboard.charAt(i));
        }
        for (int i = fromKeyboard.length()-1; i >= 0; i--){
            System.out.print(fromKeyboard.charAt(i));
        }
        System.out.println();
    }

}
