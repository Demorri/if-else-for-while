package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.print("Enter 'x' number: ");
        int x = in.nextInt();

        System.out.print("Enter 'd' number: ");
        int d = in.nextInt();

        int count = 0;

        while (x > 0){
            if((x % 10) == d){
                count ++;
            }
            x /= 10;
        }

        System.out.println(count);

    }
}
