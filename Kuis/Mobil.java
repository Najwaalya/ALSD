package Kuis;

import java.util.Scanner;
public class Mobil {
    String nama;
    int cc, hargaBeli, thnProduksi;

    public Mobil (String nama, int cc, int hargaBeli, int thnProduksi) {
        this.nama = nama;
        this.cc = cc;
        this.hargaBeli = hargaBeli;
        this.thnProduksi = thnProduksi;
    }
    
    double hitungPajak(){
        if (cc > 1500){
            return 0.1 * hargaBeli;
        } else {
            return 0.075 * hargaBeli;
        }
    }

    double hitungBiayaPerawatan(){
        if (thnProduksi < 2010) {
            return 0.08 * hargaBeli;
        } else {
            return 0.05 * hargaBeli;
        } 
    } 

    double hitungBiayaTotal(){
        return hitungPajak() + hitungBiayaPerawatan();
    }

    double hitungRataBiayaPerawatan (Mobil[] mobil){
        double totalBiayaPerawatan = 0;
        int hitungMobil = 0;

        for(Mobil m : mobil) {
            if (m.thnProduksi > 2010) {
                totalBiayaPerawatan += m.hitungBiayaPerawatan();
                hitungMobil++;
            }
        }

        if (hitungMobil > 0) {
            return totalBiayaPerawatan / hitungMobil;
        } else {
            return 0;
        }
    }

    Mobil biayaTotalTerbesar (Mobil[] mobil) {
        Mobil mobilTerbesar = null;
        double biayaTotalTerbesar = 0;

        for (Mobil m : mobil) {
            if (m.cc > 1500 && m.thnProduksi < 2010) {
                double biayaTotal = m.hitungBiayaTotal();
                if (biayaTotal > biayaTotalTerbesar) {
                    biayaTotalTerbesar = biayaTotal;
                    mobilTerbesar = m;
                }
            }
        }

        return mobilTerbesar; 
    }
    
    void printData(Mobil[] mobil) {
        double pajak = hitungPajak();
        double byPerawatan = hitungBiayaPerawatan();
        double totalBiaya = hitungBiayaTotal();
        double rataBiayaPerawatan = hitungRataBiayaPerawatan(mobil);
        Mobil totalTerbesar = biayaTotalTerbesar(mobil);
        System.out.println("Mobil " + nama + " dengan biaya total sebesar " + totalBiaya + " dengan rincian: ");
        System.out.println("- Pajak: " + pajak);
        System.out.println("- Biaya Perawatan: " + byPerawatan);
        System.out.println("- Rata-rata biaya perawatannya adalah " + rataBiayaPerawatan);
        if (totalTerbesar != null) {
            System.out.println("Biaya total terbesar mobil adalah " + totalTerbesar.hitungBiayaTotal());
        } else {
            System.out.println("Tidak ada mobil yang memenuhi kriteria untuk biaya total terbesar.");
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

            System.out.print("Masukkan banyak mobil yang akan dihitung: ");
            int jmlMobil = sc.nextInt();
            sc.nextLine();

            Mobil[] daftarMobil = new Mobil[jmlMobil];
            
            for (int i = 0; i < jmlMobil; i++) {
                System.out.println("Masukkan data mobil: ");
                System.out.print("Masukkan nama mobil ke-" + (i+1) + ": ");
                String nama = sc.nextLine();
                System.out.print("Masukkan harga beli mobil ke- " + (i+1) + ": ");
                int hargaBeli =sc.nextInt();
                System.out.print("Masukkan cc dari mobil ke: " + (i+1) + ": ");
                int cc = sc.nextInt();
                System.out.print("Masukkan tahun produksi mobil ke- " + (i+1) + ": ");
                int thnProduksi = sc.nextInt();

                daftarMobil[i] = new Mobil(nama, cc, hargaBeli, thnProduksi);
                sc.nextLine();
            }

            for (Mobil x : daftarMobil){
                x.printData(daftarMobil);
            }   

            
    }
}
    