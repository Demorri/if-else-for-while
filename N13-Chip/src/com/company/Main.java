package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of chips: ");
        var k = in.nextInt();

        if(k % 4 == 0){
            System.out.print("YES");
        }

        else{
            System.out.print("NO");
        }
    }
}
