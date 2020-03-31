package com.ekncyln.firstproject;

import java.util.Arrays;
import java.util.Scanner;

public class Ilkprogram {

    public static void main(String arg[]) {

        // primitif tipler
        byte bit = 23;
        short shrt = 1000;
        int age = 35;
        long tree = 233443422;
        float num = 48878.988f;
        double money = 343434.3434;

        double en = 75.5, boy = 56.67, alan;
        alan = en * boy;

        System.out.println(alan + " m2");

        int sum, tst;
        sum = 15 + shrt;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Sayı: ");
        tst = scanner.nextInt();
        System.out.println("Slm " + tst);

        /*
         * Bu bir yorum satırıdır.
         *
         * */

        boolean right = true;

        char ad = 't';

        String soyad = "Test";

        if (soyad == "Test1") {
            System.out.println(bit + " " + soyad);
        } else {
            System.out.println(bit + " " + soyad);
        }
        if (soyad == null) {

        }

        int myarray[] = new int[6];
        int[] yourarray = {1, 3, 4, 5, 3};
        Arrays.sort(yourarray);

        for (int i: yourarray) {
            System.out.println(i);
        }
    }
}
