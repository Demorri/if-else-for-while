package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;

        System.out.print("Enter the 'a': ");
        Scanner z = new Scanner(System.in);
        a = z.nextInt();

        System.out.print("Enter the 'b': ");
        Scanner x = new Scanner(System.in);
        b = x.nextInt();

        if(a > b){
            System.out.print(1);
        }
        else if(b > a){
            System.out.print(2);
        }
        else{
            System.out.print(0);
        }
    }
}
