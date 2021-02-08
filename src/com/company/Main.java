package com.company;

import java.util.Scanner;

public class Main {

    public static void DayofWeek(int Day) {
        switch (Day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a working day");
                break;
            case 6:
            case 7:
                System.out.println("It's holiday");
                break;
            default:
                System.out.println("Day is incorrect");
                break;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the day");
        int a = input.nextInt();

        DayofWeek(a);


    }
}
