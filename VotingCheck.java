package com.Anudip;
import java.util.Scanner;
public class VotingCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age;
        age = sc.nextInt();
        if (age<18){
            System.out.println("You are Not eligible for voting as your age is: "+age);
        }
        else{
            System.out.println("You are eligible for voting as your age is: "+age);
        }
    }
}
