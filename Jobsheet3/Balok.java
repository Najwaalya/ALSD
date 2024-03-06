package Jobsheet3;

public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    public Balok (int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}




