package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int StudAnsw, SystAnsw;

        System.out.print("Enter the Student`s answer: ");
        Scanner a = new Scanner(System.in);
        StudAnsw = a.nextInt();

        System.out.print("Enter the System`s answer: ");
        Scanner b = new Scanner(System.in);
        SystAnsw = b.nextInt();

        if (SystAnsw == 1 && StudAnsw != SystAnsw){
            System.out.print("NO");
        }
        else if(SystAnsw != 1 && StudAnsw != 1){
            System.out.print("YES");
        }
        else
            System.out.print("YES");

    }
}
