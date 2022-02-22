package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 'N': ");
        int n = in.nextInt();

        int answ = 1;
        for(int i = 1; i <= n; i++){
            answ *= 2;
        }

        System.out.println(answ);



    }
}
