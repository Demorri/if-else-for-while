package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int year;

        System.out.print("Enter the year: ");
        Scanner a = new Scanner(System.in);
        year = a.nextInt();

        if ((year % 4) == 0 && (year % 100) > 0){
            System.out.println("YES");
        }
        else if ((year % 400) == 0){
            System.out.print("YES");
        }
        else
            System.out.print("NO");


    }
}
