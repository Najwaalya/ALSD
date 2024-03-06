package Jobsheet1;

import java.util.Scanner;

public class inputNim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input NIM : ");
        String nim = input.next();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        System.out.println("=========================");
        System.out.println("n : " + (nim.substring(nim.length() - 2)));
        System.out.println("OUTPUT: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
