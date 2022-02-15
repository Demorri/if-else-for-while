package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first 2 coordinates: ");
        var x1 = in.nextInt();
        var y1 = in.nextInt();

        System.out.println("Enter first 2 coordinates: ");
        var x2 = in.nextInt();
        var y2 = in.nextInt();

        if(Math.abs(x1-x2) == 1 &&  Math.abs(y1-y2) == 2 || Math.abs(x1-x2) == 2 &&  Math.abs(y1-y2) == 1){
            System.out.print("YES");
        }

        else{
            System.out.print("NO");
        }
    }
}
