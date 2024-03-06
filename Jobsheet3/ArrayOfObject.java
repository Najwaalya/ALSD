package Jobsheet3;
import java.util.Scanner;

class PersegiPanjang {
        public int panjang;
        public int lebar;
    }

public class ArrayOfObject {
    
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        ppArray[0] = new PersegiPanjang();
        ppArray[0].panjang = 110;
        ppArray[0].lebar = 30;

        ppArray[1] = new PersegiPanjang();
        ppArray[1].panjang = 80;
        ppArray[1].lebar = 40;

        ppArray[2] = new PersegiPanjang();
        ppArray[2].panjang = 100;
        ppArray[2].lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int length = sc.nextInt();

        PersegiPanjang[] Array = new PersegiPanjang[length];
        
        for (int i = 0; i < 3; i++){
            Array[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            Array[i].panjang = sc.nextInt();
            System.out.print("Masukkan Lebar: ");
            Array[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + Array[i].panjang + ", lebar: " + Array[i].lebar);
        }

        PersegiPanjang[][] ppArray2D = new PersegiPanjang [2][3];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++){
            for (int k = 0; k < 3; k++) {
                ppArray2D[i][k] = new PersegiPanjang();
                System.out.println("Persegi panjang baris ke-" + i + " kolom ke-" + k);
                System.out.println("Masukkan panjang: ");
                ppArray2D[i][k].panjang = input.nextInt();
                System.out.println("Masukkan lebar: ");
                ppArray2D[i][k].lebar = input.nextInt();
            }
        }

        sc.close();
        input.close();
    }
}
