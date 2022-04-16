package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x1 = in.nextInt();

        int x2 = 0;
        int digit = 0;

        while(x1 > 0){

            digit = x1 % 10;
            x1 /= 10;
            x2 *= 10;
            x2 += digit;
        }
        System.out.print(x2);

    }
}
