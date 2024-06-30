package com.Anudip;

import java.util.Scanner;

public class AscendingSort {
    Scanner sc = new Scanner(System.in);
    int []arr = new int[5];
    int i,j,temp;
    public void accept(){
        System.out.println("Enter five numbers: ");
        for(i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
    }
    public void sort(){
        for(i=0;i<5;i++){
            for(j=i+1;j<5;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void display(){
        for(i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        AscendingSort obj = new AscendingSort();
        obj.accept();
        obj.sort();//87 5 67 54 98
        obj.display();
    }
}
