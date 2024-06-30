package com.Anudip;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            int c = 23 / 0;
            a[5] = 50 / 5;
            System.out.println(a[5]);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("you can not divide by zero");
        } catch (ArrayIndexOutOfBoundsException o) {
            System.out.println(o);
        }
        System.out.println("yupeeeee no exception");
    }
}
