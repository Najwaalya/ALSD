package Jobsheet2;

public class Buku20 {
    String judul, pengarang;
    int halaman, stok, harga, terjual = 0, totalHarga = 0, hargaBayar = 0;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        if (terjual >= 0){
            terjual += jml;
            stok -= jml;
        } else {
            System.out.println("Mohon maaf stok telah habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    int hitungDiskon(int jml) {
        int diskon = 0;
        int hargaTotal = hitungHargaTotal(jml);
        if (harga > 150000){
            diskon = (int) (hargaTotal * 0.12);
        } else if (harga > 75000) {
            diskon = (int) (hargaTotal * 0.05);
        } else {
            diskon = 0;
        } return diskon;
    }

    int hitungHargaBayar(int jml) {
        return hitungHargaTotal(jml) - hitungDiskon(jml);
    }

    public Buku20() {

    }

    public Buku20(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

}
