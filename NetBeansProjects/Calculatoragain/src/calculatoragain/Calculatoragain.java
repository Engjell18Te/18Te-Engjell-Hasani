/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatoragain;

import java.util.Scanner;

/**
 *
 * @author engjell.hasani
 */
public class Calculatoragain {

    public static void main(String[] args) {
        System.out.println("HEJ och TJO");
        System.out.print("SKRIV ETT TAL:  ");
        Scanner ey = new Scanner(System.in);
        double tal1 = ey.nextDouble();

        System.out.print("SKRIV ETT TAL TILL:  ");
        double tal2 = ey.nextDouble();

        System.out.print(" VILKEN RÄKNESÄTT?:  ");
        ey.nextLine();
        String raknesatt = ey.nextLine();
        char calc = raknesatt.charAt(0);
        double resultat = 0;

        switch (calc) {
            case '+':
                resultat = tal1 + tal2;
                break;
            case '-':
                resultat = tal1 - tal2;
                break;
            case '*':
                resultat = tal1 * tal2;
                break;
            case '/':
                resultat = tal1 / tal2;

        }

        System.out.println("Svar: " + resultat);

    }

}
