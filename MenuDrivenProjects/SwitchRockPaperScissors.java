package com.Anudip;
import java.util.Random;
import java.util.Scanner;
public class SwitchRockPaperScissors {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("\nWelcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: ");
        System.out.println("0. For Rock.");
        System.out.println("1. For Paper.");
        System.out.println("2. For Scissors.");
        System.out.println("3. Exit.");

        int userChoice = sc.nextInt();
        int computerChoice = rd.nextInt(0,3);
        switch (userChoice){
            case 0: // user choses Rock
                if ((userChoice == 0 && computerChoice == 0) ){
                    System.out.println("Its a draw!");
                } else if ((userChoice == 0 && computerChoice == 2)) {
                    System.out.println("You win!");
                    System.out.println("Computer choice: Scissors");
                }else if ((userChoice == 0 && computerChoice == 1)){
                    System.out.println("Computer wins, you lost.");
                    System.out.println("Computer choice: Paper");
                    break;
                }
            case 1: // user choses Paper
                if ((userChoice == 1 && computerChoice == 1)){
                    System.out.println("Its a draw!");
                }else if ((userChoice == 1 && computerChoice == 0)){
                    System.out.println("You win!");
                    System.out.println("Computer choice: Rock");
                }else if ((userChoice == 1 && computerChoice == 2)){
                    System.out.println("Computer wins, you lost.");
                    System.out.println("Computer choice: Scissors");
                    break;
                }
            case 2: // user choses Scissors
                if((userChoice == 2 && computerChoice == 2)){
                    System.out.println("Its a draw!");
                } else if (userChoice == 2 && computerChoice == 0) {
                    System.out.println("Computer wins, you lost.");
                    System.out.println("Computer choice: Rock");
                }else if (userChoice == 2 && computerChoice == 1){
                    System.out.println("You win!");
                    System.out.println("Computer choice: Paper");
                    break;
                }
            case 3: // user exits
                System.out.println("Exiting the game...");
                break;
            default:
                System.out.println("Invalid choice, try again.");
                break;
        }
    }
}
