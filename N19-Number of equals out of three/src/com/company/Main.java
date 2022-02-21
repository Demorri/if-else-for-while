package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        var a = in.nextInt();
        var b = in.nextInt();
        var c = in.nextInt();

        if(a == b && a == c && b == c){
            System.out.print("3");
        }
        else if(a == b || a == c || b == c){
            System.out.print("2");
        }
        else{
            System.out.print("0");
        }
    }
}
