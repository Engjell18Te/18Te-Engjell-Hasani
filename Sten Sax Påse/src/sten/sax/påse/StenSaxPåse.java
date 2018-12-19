/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sten.sax.påse;
import java.util.Scanner; 
import java.util.Random;
public class StenSaxPåse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
     String personPlay;  // jag väljer mellan R,S,P
     String computerPlay =  ""; // datan väljer mellan R, S , P
     int ComputerInt;
     int countPlays = 0;
     int CountWins = 0;
     String svar; 
     String again;
     do{
     
     Scanner scan = new Scanner(System.in);
     Random generator = new Random();
     System.out.println("Hi And Welcome To Rock, Paper, Scissor!\n" + 
              "Please Chose Your Move!\n" + "Rock = R, Paper = P" + 
             ", Scissor = S.");
     System.out.println();
    
     ComputerInt = generator.nextInt(3)+1;
    
    if (ComputerInt == 1)
        computerPlay = "R";
    else if (ComputerInt == 2)
        computerPlay = "P";
    else if (ComputerInt == 3)
        computerPlay = "S";
    
    System.out.println("Enter your play");
    personPlay = scan.next();
    
    personPlay = personPlay.toUpperCase();
    
    System.out.println("Computer play is: " + computerPlay);
     countPlays++;
    if (personPlay.equals(computerPlay)){
        System.out.println("It's A Tie!");
    }
    else if (personPlay.equals("R")){
        if (computerPlay.equals("S"))
        System.out.println("Rock Crushes Scissors. U Won!" +1) ;
    else if (computerPlay.equals("P"))
        System.out.println("Paper Eats Rock. U Lose!");}
    
    else if (personPlay.equals("P")){
        if  (computerPlay.equals("S"))
        System.out.println("Scissor Cuts Paper. U Lose!");
    else if (computerPlay.equals("R"))
        System.out.println("Paper Eats Rock. U Won!" +1);
    }
    else if (personPlay.equals("S")) {
        if (computerPlay.equals("P"))
        System.out.println("Scissor Cuts Paper, U Won!" +1);
    else if (computerPlay.equals("R"))
        System.out.println("Rock Crushes Paper, U Lose!");
    }
    
       System.out.println("Do You Want To Try Again? Y/N");
       again = scan.next(); 
     } while (again.equalsIgnoreCase("Y"));
        System.out.print("You Have Played: " + countPlays + " Times ");
        System.out.print("You Have Won " + CountWins + " Times ");
} 
   
}
