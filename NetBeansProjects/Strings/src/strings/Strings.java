/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author engjell.hasani
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanObject = new Scanner(System.in);
        String text = new String();
        

        String someString = new String();
        String nyText = new String();
        someString = scanObject.nextLine();
         int textLength = text.length();
        nyText = someString.toUpperCase();
        System.out.println(nyText);
        nyText = someString.toLowerCase();
        System.out.println(nyText);
        System.out.println("Strängen är:  " + someString.length() + "tecken.");
        
        for  (int i = 0); i < (someString.length(); i++) 
        {
            
        }
        
       
    }

}
