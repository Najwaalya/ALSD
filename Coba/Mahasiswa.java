package Coba;

//package Me;

import java.util.Scanner;

public class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;
    private int umur;

    // Constructor
    public Mahasiswa(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Umur: " + umur);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline di buffer

        // Array objek Mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlahMahasiswa];

        // Meminta pengguna untuk memasukkan data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Umur: ");
            int umur = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline di buffer

        // Membuat objek Mahasiswa baru dan memasukkannya ke dalam array
        daftarMahasiswa[i] = new Mahasiswa(nama, nim, umur);
        }
        

        // Menampilkan informasi setiap mahasiswa dalam array menggunakan looping
       for (Mahasiswa x : daftarMahasiswa) {
        x.displayInfo();
       }

        scanner.close(); // Menutup scanner setelah selesai digunakan
    }
}

