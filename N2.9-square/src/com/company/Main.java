package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.print("Enter 'a' number: ");
        int a = in.nextInt();

        System.out.print("Enter 'b' number: ");
        int b = in.nextInt();

        for (int i = a; i <= b; i ++){

            for (int j = 1; j * j <= i; j ++){

                if(j * j == i){
                   System.out.print(i + "  ");

                }
            }

        }



    }
}
