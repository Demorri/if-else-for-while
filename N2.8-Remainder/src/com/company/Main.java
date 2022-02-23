package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 'a': ");
        int a = in.nextInt();

        System.out.print("Enter 'b': ");
        int b = in.nextInt();

        System.out.print("Enter 'c': ");
        int c = in.nextInt();

        System.out.print("Enter 'd': ");
        int d = in.nextInt();

        for(int i = a; i <= b; i++){
            if(i % d == c){
                System.out.println(i);
            }
        }


    }
}
