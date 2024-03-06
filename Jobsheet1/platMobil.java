package Jobsheet1;
import java.util.Scanner;

public class platMobil {
    public static void main(String[] args) {
       char [] kode= {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
       String [][] kota = {
        {"Banten"}, {"Jakarta"}, {"Bandung"}, {"Cirebon"}, {"Bogor"}, {"Pekalongan"},
        {"Semarang"}, {"Surabaya"}, {"Malang"}, {"Tegal"}
       };

       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan kode plat mobil: ");
       char code = input.next().charAt(0);
       input.close();

       String namaKota = cariNamaKota(kode, kota, code);

       if (namaKota != null) {
        System.out.println("Kota untuk kode plat " + code + " adalah: " + namaKota);
       } else {
        System.out.println("Kode plat mobil tidak ditemukan.");
       }
    }

       public static String cariNamaKota(char[] kode, String[][]kota, char code ) {
            for (int i = 0; i < kode.length; i++) {
                if (kode[i] == code) {
                    return kota [i][0];
                }
            }

            return null;
       }
    
}
