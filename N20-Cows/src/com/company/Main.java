package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount of cows: ");
        var n = in.nextInt();

        if(n >= 11 && n <= 14){
            System.out.print(n + " koriv");
        }
        else{
            var temp = n % 10;
            if(temp == 0 || temp >= 5 && temp <= 9){
                System.out.print(n + " koriv");
            }
            if(temp == 1){
                System.out.print(n + " korova");
            }
            if(temp >= 2 && temp <= 4){
                System.out.print(n + " korovy");
            }
        }

    }
}
