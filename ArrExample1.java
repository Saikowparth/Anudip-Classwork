package com.Anudip;
import java.util.Scanner;
public class ArrExample1 {
    public static void main(String[]args){
        int arr[]= new int[5];
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five numbers: "); //67 54 34 43 87

        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered elements:");

        for(i=0;i<5;i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }

    }
}
