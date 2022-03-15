//package com.teksystems.bootcamp.capstone2.UserInputs;
//
//import java.util.Scanner;
//
//public class GetEntreeInput extends Input{
//
//    public int getEntreeInput() {
//        Scanner scanner = new Scanner(System.in);
//
//        int choice = -1;
//        while (choice < 0 || choice > 8) {
//            try {
//                System.out.print("\nEnter your choice: ");
//                choice = Integer.parseInt(scanner.nextLine());
//
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid selection. Please try again.");
//            }
//        }
//        return choice;
//    }
//
//
//}
