package org.example;

public class TreePattern {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 1; i <= height; i++) {

            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= height; i++) {

            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i <= height; i++) {

            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
