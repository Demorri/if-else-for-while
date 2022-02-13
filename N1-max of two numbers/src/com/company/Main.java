package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;

        System.out.println("Enter two numbers: ");

        Scanner x = new Scanner(System.in);
        a = x.nextInt();

        Scanner y = new Scanner(System.in);
        b = y.nextInt();

        if (a > b)
            System.out.print("The largest number: " + a);
        else
            System.out.print("The largest number: " + b);

    }
}
