package com.PrintMenu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 7; j++)
                            System.out.print("* ");
                        System.out.println("");
                    }
                    break;
                case 2:
                    for(int i2 = 0; i2 < 5; i2++){
                    for(int j2 = 0; j2 <= i2; j2++)
                        System.out.print("* ");
                    System.out.println("");
                }
                    break;
                case 3:
                    for(int i3 = 5; i3 > 0; i3--) {
                        for (int j3 = 1; j3 <= i3; j3++)
                            System.out.print("* ");
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
