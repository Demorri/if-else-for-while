package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount of cutlets: ");
        var n = in.nextInt();

        System.out.print("How many cutlets does fit in pan: ");
        var k = in.nextInt();

        System.out.print("How much time fries one cutlet with one side: ");
        var m = in.nextInt();

        int t;

        if(n <= k){
            t = 2*m;
        }

        else if(n * 2 % k == 0){
            t = m * (n * 2 / k);
        }

        else{
            t = m * (1 + (n * 2 / k));
        }

        System.out.print(t);

    }
}
