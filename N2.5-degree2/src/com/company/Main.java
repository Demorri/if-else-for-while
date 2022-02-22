package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 'a': ");
        int a = in.nextInt();

        System.out.print("Enter 'n': ");
        int n = in.nextInt();

        int res = a;
        for(int i = 1; i < n; i++){
            res *= a;
        }

        System.out.print(res);

    }
}
