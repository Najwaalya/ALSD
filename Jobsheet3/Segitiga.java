package Jobsheet3;

public class Segitiga {
    int alas;
    int tinggi;

    public Segitiga(int a, int t){  
        alas = a;
        tinggi = t;  
    }   
    
    double hitungLuas(){
        return 1/2 * alas * tinggi;
    }
}
