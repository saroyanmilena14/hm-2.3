package com.company;

import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {

        Scanner commandLine = new Scanner(System.in);
        System.out.print("Input a month...");
        String month = commandLine.next();

        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;

            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;

            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;

            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;

            default:
                System.out.println("You didn't input any kind of a month");
        }

    }
}
