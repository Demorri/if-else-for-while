package com.company;
import java.util.Scanner;
import java.lang.*;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the chocolate bar size (n × m): ");
        var n = in.nextInt();
        var m = in.nextInt();

        System.out.println("Enter the number of pieces to break off: ");
        var k = in.nextInt();

        if((n * m) > k && n % k == 0 || m % k == 0){
            System.out.print("YES");
        }

        else{
            System.out.print("NO");
        }
    }
}
