package com.Anudip;
import java.util.Scanner;
public class AddDemo {
    public static void main(String[] args){
        int a,b,ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        ans = a+b;
        System.out.println(ans);
    }
}
