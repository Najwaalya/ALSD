package Jobsheet1;
import java.util.Scanner;

public class rumusFisika {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        while (true) {
            System.out.println("\n Menu: ");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");

            System.out.println("Pilih menu (1/2/3/4): ");
            int menu = input.nextInt();

            if (menu == 4) {
                System.out.println("Terima kasih telah menggunakan program ini.");
                break;
            }

            switch (menu) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2 : 
                    hitungJarak();
                    break;
                case 3 :
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
            input.close();
    }

        public static void hitungKecepatan() {
            Scanner input = new Scanner(System.in);
    
            System.out.print("Masukkan jarak (m): ");
            double s = input.nextDouble();
            System.out.print("Masukkan waktu (s): ");
            double t = input.nextDouble();
    
            double v = s / t;
            System.out.println("Kecepatan (v) = " + v + " m/s");
            input.close();
        }
    
        public static void hitungJarak() {
            Scanner input = new Scanner(System.in);
    
            System.out.print("Masukkan kecepatan (m/s): ");
            double v = input.nextDouble();
            System.out.print("Masukkan waktu (s): ");
            double t = input.nextDouble();
    
            double s = v * t;
            System.out.println("Jarak (s) = " + s + " meter");
            input.close();
        }
    
        public static void hitungWaktu() {
            Scanner input = new Scanner(System.in);
    
            System.out.print("Masukkan jarak (m): ");
            double s = input.nextDouble();
            System.out.print("Masukkan kecepatan (m/s): ");
            double v = input.nextDouble();
    
            double t = s / v;
            System.out.println("Waktu (t) = " + t + " detik");
            input.close();
        }
}  
        
    

