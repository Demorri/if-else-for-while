package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = in.nextInt();
        int answ = 0;
        while (x != 0){

            answ += x % 10;
            x /= 10;
        }

        System.out.print(answ);

    }
}
