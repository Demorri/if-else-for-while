package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sign, x;

        System.out.print("Enter the 'x': ");
        Scanner a = new Scanner(System.in);
        x = a.nextInt();

        System.out.print("The answer is: ");

        if (x > 0) {
            System.out.println("sign(x) = 1");
        }

        else if (x < 0) {
            System.out.println("sign(x) = -1");
        }

        else {
            System.out.println("sign(x) = 0");
        }

    }
}
