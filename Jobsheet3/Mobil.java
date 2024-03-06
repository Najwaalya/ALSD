package Jobsheet3;

import java.util.Scanner;
public class Mobil{
    String nama;
    int cc, hargaBeli, thnProduksi;

    public Mobil (String nama, int cc, int hargaBeli, int thnProduksi) {
        this.nama = nama;
        this.cc = cc;
        this.hargaBeli = hargaBeli;
        this.thnProduksi = thnProduksi;
    }
    
    double hitungPajak(double pajak){
        if (cc > 1500){
            pajak = 10/100 * hargaBeli;
        } else {
            pajak = (0.0075 * hargaBeli);
        }
        return pajak;
    }

    double hitungBiayaPerawatan(double byPerawatan){
        if (thnProduksi < 2010) {
            byPerawatan = 8/100 * hargaBeli;
        } else {
            byPerawatan = 5/100 * hargaBeli;
        } 
        return byPerawatan;
    } 

    double hitungBiayaTotal(double pajak, double byPerawatan){
        return hitungPajak(pajak) + hitungBiayaPerawatan(byPerawatan);
    }

    double hitungBiayaPerawatanRata(Mobil[] mobilArray){
        int hitung = 0;
        double totalBiayaPerawatan = 0;
        
        for (Mobil mobil : mobilArray) {
            if(mobil.thnProduksi > 2010){
                totalBiayaPerawatan += mobil.hitungBiayaPerawatan(mobil.hitungPajak(mobil.cc));
                hitung++;
            }
        }

        if (hitung == 0){
            return 0.0;
        } else{
            return totalBiayaPerawatan / hitung;
        }
    }

    public void biayaTotalTerbesar(Mobil[] mobilArray) {
        double maxBiayaTotal = 0.0;
        Mobil mobilTerbesar = null;

        for (Mobil mobil : mobilArray) {
            if (mobil.cc > 1500 && mobil.thnProduksi < 2010) {
                double biayaTotal = mobil.hitungBiayaTotal(mobil.hitungPajak(mobil.cc), mobil.hitungBiayaPerawatan(mobil.hitungPajak(mobil.cc)));
                if (biayaTotal > maxBiayaTotal) {
                    maxBiayaTotal = biayaTotal;
                    mobilTerbesar = mobil;
                }
            }
        }

        if (mobilTerbesar != null) {
            System.out.println("Data mobil dengan biaya total terbesar: ");
            mobilTerbesar.printData();
        } else {
            System.out.println("Tidak ada mobil yang memenuhi syarat.");
        }
    }

    void printData() {
        double pajak = hitungPajak(cc);
        double byPerawatan = hitungBiayaPerawatan(pajak);
        double totalBiaya = hitungBiayaTotal(pajak, byPerawatan);
        System.out.println("MobilL " + nama + " dengan biaya total sebesar " + totalBiaya + " dengan rincian: ");
        System.out.println("- Pajak: " + pajak);
        System.out.println("- Biaya Perawatan: " + byPerawatan);
    }

}