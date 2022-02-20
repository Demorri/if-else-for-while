package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        var k = in.nextInt();

        if(k < 3 || k == 4 || k == 7){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}
