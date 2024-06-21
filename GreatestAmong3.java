package com.Anudip;
import java.util.Scanner;
public class GreatestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter three numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        if(a>b && a>c){
            System.out.println("a is the greatest number.");
        }
        else if(b>a && b>c){
            System.out.println("b is the greatest number.");
        }
        else{
            System.out.println("c is the greatest number.");
        }
    }
}
