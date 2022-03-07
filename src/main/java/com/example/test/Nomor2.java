package com.example.test;


import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        String kalimat;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan Inputan ");
        kalimat = keyboard.nextLine();
        if (kalimat.isEmpty()) {
            System.out.println("Masukan Kosong");
        } else {
            String poli = "";
            for (int i = kalimat.length(); i > 0; i--) {
                String test1 = kalimat.substring(i - 1, i);
                poli = poli + test1;
            }
            if (kalimat.equals(poli)) {
                System.out.println("Text Polindrome");
            } else {
                System.out.println("Text bukan Polindrome");
            }
        }
    }
}
