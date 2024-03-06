package Coba;

// Definisi class 'Kucing' dengan konstruktor
public class Kucing {
    // Atribut
    String nama;
    int umur;
    
    // Konstruktor
    public Kucing(String nma, int umr) {
        nama = nma;
        umur = umr;
    }
    
    // Method untuk menentukan suara kucing
    void bersuara() {
        System.out.println("Meow!");
    }
    
    // Method untuk menampilkan informasi kucing
    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Membuat object dari class 'Kucing' menggunakan konstruktor
        Kucing kucing1 = new Kucing("Tom", 3);
        
        // Memanggil method 'bersuara' dan 'info'
        kucing1.bersuara(); // Output: Meow!
        kucing1.info();     // Output: Nama: Tom
                            //         Umur: 3 tahun

        // membuat object 'kucing2'
        Kucing kucing2 = new Kucing("asep", 100);

        //memanggil method
        kucing2.bersuara();
        kucing2.info();
    }
}

