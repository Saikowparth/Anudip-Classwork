package com.Anudip;
import java.util.Scanner;

public class CustomEx1 {
    public void check(int a){
        if(a<18){
            throw new ArithmeticException("you are not elligible to vote");
        }
        else{
            System.out.println("It's your right age to vote!!!");
        }
    }
        public static void main(String[]args){
        CustomEx1 obj = new CustomEx1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        obj.check(age);
        }
}
