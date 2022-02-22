package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 'N': ");
        int n = in.nextInt();

        float summ = 1;
        float factrl = 1;
        for(int i = 1; i <= n; i++){
            factrl *= i;
            summ += 1 / factrl;
        }

        System.out.printf("%.5f" , summ);

    }
}
