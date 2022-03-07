package com.example.test;

import java.util.Scanner;
import java.util.Stack;

public class Nomor1 {
    public static void main(String[] args) {
        System.out.println("Menu :");
        System.out.println("1. Decimal to Binary ");
        System.out.println("2. Binary to Decimal");
        System.out.println("Masukan Pilihan : ");
        Scanner menu = new Scanner(System.in);
        int pilih = menu.nextInt();
        if (pilih == 1) {
            Scanner input = null;
            try {
                input = new Scanner(System.in);
                System.out.println("Enter binary number : ");
                String number = input.next();
                if (isBinaryNumber(number)) {
                    int decimal = getDecimalNumber(number);
                    System.out.println("Decimal Number : " + decimal);
                } else {
                    System.out.println("Please enter valid binary number.");
                }
            } finally {
                if (input != null) {
                    input.close();
                }
            }
        } else if (pilih == 2) {
            Scanner keyboard = new Scanner(System.in);
            Stack<Integer> stack = new Stack<Integer>();
            System.out.println("Enter decimal number: ");
            int num = keyboard.nextInt();

            while (num != 0) {
                int d = num % 2;
                stack.push(d);
                num /= 2;
            }

            System.out.print("\nBinary representation is:");
            while (!(stack.isEmpty())) {
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
    private static int getDecimalNumber(String number) {
        StringBuilder string = new StringBuilder(number);
        string = string.reverse();
        int length = string.length();
        int digit, power, sum = 0;
        for (int i = 0; i < length; i++) {
            digit = string.charAt(i) - 48;
            power = (int) Math.pow(2, i);
            sum = sum + digit * power;
        }
        return sum;
    }

    private static boolean isBinaryNumber(String number) {
        String pattern = "^[01]+$";
        boolean result = number.matches(pattern);
        return result;
    }
}
