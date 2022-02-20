package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the price of the goods in rubles and kopecks: ");
        var a = in.nextInt();
        var b = in.nextInt();

        System.out.println("Enter how much the buyer gave: ");
        var c = in.nextInt();
        var d = in.nextInt();

        var e = c - a;
        var f = d - b;

        if (f < 0) {
            e -= 1;
            f += 100;
            System.out.print(e + " " + f);
        }
        else{
            System.out.print(e + " " + f);
        }
    }
}
