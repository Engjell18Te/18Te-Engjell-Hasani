/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gissa.talet;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author engjell.hasani
 */
public class GissaTalet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int guess = 0;
        int countPlays = 0;
        int Score = 0;
        String playAgain = new String();
        Scanner keyboard = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Välkommen till spelet \"Gissa ett tal!\"");
        do {
            String maxGuessString = JOptionPane.showInputDialog(null, "Skriv in högsta tal att gissa: ");
            int maxGuess = Integer.parseInt(maxGuessString);

            int answer = (int) (Math.random() * maxGuess) + 1;
            int countGuesses = 0;

            do {
                
                System.out.print("Gissning: ");
                guess = keyboard.nextInt();
                countGuesses++;
                if (guess < answer) {
                    System.out.println("För litet!");
                }
                if (guess > answer) {
                    System.out.println("För stort!");
                }
                if (guess != answer) {
                    System.out.println("Fel! Gissa igen!");
                }

            } while (answer != guess);
            countPlays++;
            System.out.println(" Easy ");
            System.out.println("Dett tog: " + countGuesses + " Gissningar");
            System.out.print("Du har spelat: " + countPlays + "Gånger ");

            System.out.print("vill du spela igen(j/n)?");
            keyboard.nextLine();
            playAgain = keyboard.nextLine();
        } while (playAgain.equals("j"));
        System.out.println(" Aight! ");

        }
}
