package Coba;

import java.util.Scanner;
public class Produk {
    // Atribut
    private String nama;
    private double harga;

    // Constructor
    Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method untuk mendapatkan nama produk
    String getNama() {
        return nama;
    }

    // Method untuk mendapatkan harga produk
    double getHarga() {
        return harga;
    }

    // Method untuk menampilkan informasi produk
    void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner
       // Array objek produk
       Produk[] daftarProduk = new Produk[6];

       // Inisialisasi objek dan memasukkannya ke dalam array
       daftarProduk[0] = new Produk("Baju", 100000);
       daftarProduk[1] = new Produk("Celana", 150000);
       daftarProduk[2] = new Produk("Sepatu", 200000);
       daftarProduk[3] = new Produk("Topi", 50000);
       daftarProduk[4] = new Produk("Kemeja", 120000);
       daftarProduk[5] = new Produk("Sandal", 80000);

       // Menampilkan informasi setiap produk dalam array
       for (Produk produk : daftarProduk) {
           produk.displayInfo();
           System.out.println();
       }
       scanner.close();
   }
}
