package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 'N': ");
        var n = in.nextInt();

        int factrl = 1;
        for(int i = 1; i <= n; i++){
            factrl = factrl * i;
        }

        System.out.print(factrl);

    }
}
