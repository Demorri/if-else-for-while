package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numb[] = new int[3];
        int n;

        for(int i = 0; i < 3; i++){
            System.out.print("Enter the " + (i + 1) + " number: ");
            Scanner a = new Scanner(System.in);
            numb[i] = a.nextInt();
        }

        if(numb[0] > numb[1]){
            if(numb[0] > numb[2]){
                System.out.print("The largest number is: " + numb[0]);
            }
            else{
                System.out.print("The largest number is: " + numb[2]);
            }
        }
        else if(numb[1] > numb[2]){
            System.out.print("The largest number is: " + numb[1]);
        }

        else{
            System.out.print("The largest number is: " + numb[2]);
        }

    }
}
