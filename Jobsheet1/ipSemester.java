package Jobsheet1;

import java.util.Scanner;

public class ipSemester {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] nilai = new int [8];
        String[] mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical thinking and Problem Solving", "Matematika Dasar", 
                        "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Permograman", "Kesehatan dan Keselamatan Kerja"};
        String[] huruf = new String [8];
        double[] nilai1 = new double [8];
        int [] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        double ip = 0;

        System.out.println("=============================================================");
        System.out.println("|               Program Menghitung IP Semester              |");
        System.out.println("=============================================================");
        System.out.println();
        System.out.println("Masukkan nilai angka untuk mata kuliah:");

        for (int i = 0; i < mk.length; i++) {
            System.out.print(mk[i] = ": ");
            nilai[i] = input.nextInt();

            while (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("Input nilai salah! (0-100)");
                System.out.println((mk[i] + ": "));
                nilai [i] = input.nextInt();
            }

            if (nilai[i] > 80 && nilai [i] <= 100) {
                huruf [i] = "A";
                nilai1[i] = 4.00;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                huruf[i] ="B+";
                nilai1[i] = 3.50;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                huruf[i] = "B";
                nilai1[1] = 3.00;
            } else if (nilai[i] > 50 && nilai[i] <= 65) {
                huruf[i] = "C+";
                nilai1[i] = 2.50;
            } else if (nilai[i] > 50 && nilai [i] <= 60) {
                huruf[i] = "C";
                nilai1[i] = 2.00;
            } else if (nilai[i] > 39 && nilai[i] <= 50) {
                huruf[i] = "D";
                nilai1[i] = 1.00;
            } else {
                huruf[i] = "E";
                nilai1[i] = 0;
            }
        }

        double jumN = 0;
        int sumSKS = 0;
        for (int i = 0; i < nilai.length; i++) {
            double sumN = nilai[i] * sks[i];
            jumN += sumN;
            sumSKS += sks[i];
        } 
        ip = jumN / sumSKS;

        System.out.println();
        System.out.println("====================================================================================");
        System.out.println("|                             Hasil Konversi Nilai                                 |");
        System.out.println("====================================================================================");
        System.out.println("|                   MK                    | Nilai Angka | Nilai Huruf | Bobot Nilai|");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.printf("| Pancasila                               |     %d      |     %s      |    %.2f    |\n", nilai[0], huruf[0], nilai[0]);
        System.out.printf("| Konsep Teknologi Informasi              |     %d      |     %s      |    %.2f    |\n", nilai[1], huruf[1], nilai[1]);
        System.out.printf("| Critical Thinking and Problem Solving   |     %d      |     %s      |    %.2f    |\n", nilai[2], huruf[2], nilai[2]);
        System.out.printf("| Matematika Dasar                        |     %d      |     %s      |    %.2f    |\n", nilai[3], huruf[3], nilai[3]);
        System.out.printf("| Bahasa Inggris                          |     %d      |     %s      |    %.2f    |\n", nilai[4], huruf[4], nilai[4]);
        System.out.printf("| Dasar Pemrograman                       |     %d      |     %s      |    %.2f    |\n", nilai[5], huruf[5], nilai[5]);
        System.out.printf("| Praktikum Dasar Pemrograman             |     %d      |     %s      |    %.2f    |\n", nilai[6], huruf[6], nilai[6]);
        System.out.printf("| Keselamatan dan Kesehatan Kerja         |     %d      |     %s      |    %.2f    |\n", nilai[7], huruf[7], nilai[7]);
        System.out.println("====================================================================================");
        System.out.printf("|                                  IP = %.2f                                       |\n", ip);
        System.out.println("====================================================================================");

        input.close();
    }
}
