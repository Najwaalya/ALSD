package q1;

import java.util.Scanner;

public class MainKuis {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

            System.out.println("Masukkan banyak mobil yang akan dihitung: ");
            int jmlMobil = sc.nextInt();
            sc.nextLine();

            Mobil[] daftarMobil = new Mobil[jmlMobil];
            
            for (int i = 0; i < jmlMobil; i++) {
                System.out.println("Masukkan data mobil");
                System.out.println("Masukkan nama mobil ke-" + (i+1));
                String nama = sc.nextLine();
                System.out.println("Masukkan harga beli mobil ke- " + (i+1));
                int hargaBeli =sc.nextInt();
                System.out.println("Masukkan cc dari mobil ke: " + (i+1));
                int cc = sc.nextInt();
                System.out.println("Masukkan tahun produksi mobil ke- " + (i+1));
                int thnProduksi = sc.nextInt();


                daftarMobil[i] = new Mobil(nama, cc, hargaBeli, thnProduksi);
            }

            for (Mobil x : daftarMobil){
                x.printData();
            } 
            
            double hitungBiayaPerawatanRata = daftarMobil[0].hitungBiayaPerawatanRata(daftarMobil);
            System.out.println("Biaya perawatan rata-rata mobil dengan tahun produksi >2010 adalah: " + hitungBiayaPerawatanRata);

            daftarMobil[0].biayaTotalTerbesar(daftarMobil);
    }
}
