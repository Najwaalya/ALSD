package Jobsheet1;
import java.util.Scanner;
public class NilaiMahasiswa{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        hitungNilaiAkhir(nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS);

        input.close();
    }

    public static void hitungNilaiAkhir (double tugas, double kuis, double uts, double uas){
        if (!(0 <= tugas && tugas <=100) || !(0 <= kuis && kuis <=100) || !(0 <= uts && uts <= 100) || !(0 <= uas && uas <=100)){
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Nilai tidak valid.");
            System.out.println("==============================");
            System.out.println("==============================");
            return;
        }

        double nilaiAkhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;

        String nilaiHuruf, keterangan;
        if (nilaiAkhir >= 80){
            nilaiHuruf = "A";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 73){
            nilaiHuruf = "B+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 65){
            nilaiHuruf = "B";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 60){
            nilaiHuruf = "C+";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 50){
            nilaiHuruf = "C";
            keterangan = "SELAMAT ANDA LULUS";
        } else if (nilaiAkhir >= 39){
            nilaiHuruf = "D";
            keterangan = "Mohon maaf anda belum lulus. Jangan Menyerah dan Tetap Semangat";
        } else {
            nilaiHuruf = "E";
            keterangan = "Mohon maaf anda belum lulus. Jangan Menyerah dan Tetap Semangat";
        }

        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(keterangan);

    }
}