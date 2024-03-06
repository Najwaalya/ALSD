package Jobsheet2;

public class bukuMain20 {
    public static void main(String[] args) {
        Buku20 bk1 = new Buku20();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku20 bk2 = new Buku20("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku20 bukuNajwa = new Buku20("Laut bercerita", "leila sakhila", 190, 30, 99000);
        bukuNajwa.terjual (8);
        bukuNajwa.tampilInformasi();
        System.out.println("Hitung harga : " + bukuNajwa.hitungHargaTotal(5));
        System.out.println("Diskon: " + bukuNajwa.hitungDiskon(20));
        System.out.println("Harga bayar : " + bukuNajwa.hitungHargaBayar(5));
    }
}
