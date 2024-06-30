package com.Anudip;

public class ExcepRev {
    public static void main(String[]args){
        try
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println("the division is: "+c);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("you can not divide with zero");
        }
        finally{
            System.out.println("one should know excpetion for smooth execution of application");
        }
    }

}
