package com.Anudip;
import java.util.Scanner;
public class GreaterNum {
    public static void main(String[] args){
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        if (a>b){
            System.out.println("a is greater than b " +a);
        }
        else{
            System.out.println("b is greater than a " +b);
        }
    }
}
