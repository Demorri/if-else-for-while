package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x1, y1, x2, y2;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first 2 coordinates: ");
        x1 = in.nextInt();
        y1 = in.nextInt();

        System.out.println("Enter second 2 coordinate: ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        if (x1 == x2 || y1 == y2){
            System.out.print("YES");
        }

        else{
            System.out.print("NO");
        }


    }
}
