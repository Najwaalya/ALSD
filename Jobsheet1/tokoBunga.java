package Jobsheet1;

public class tokoBunga {
    private static int [][] stokBunga = {
        {1, 10, 5, 15, 7},
        {2, 6, 11, 9, 12},
        {3, 2, 10, 10, 15},
        {4, 5, 7, 12, 9}
    };

    private static final int [][] hargaBunga = {
        {75000, 50000, 60000, 10000}
    };

    public static void pendapatanSetiapCabang(){
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 1; j < stokBunga.length; j++) {
                pendapatan += stokBunga[i][j] * hargaBunga[0][j-1];
            }
            System.out.println("Pendapatan Cabang " + stokBunga[i][0] + ": Rp " + pendapatan);
        }
    }

    public static void stokBungaRoyalGarden() {
        System.out.println("Stok Bunga di Royal Garden 4: ");
        for (int j = 1; j < stokBunga[3].length; j++) {
            int jumlahStok = stokBunga [3][j];
            String namaBunga = getNamaBunga(j);
            switch (j) {
                case 1:
                    jumlahStok -= 1;
                    break;
                case 2 :
                    jumlahStok -= 2;
                    break;
                case 3 : 
                    jumlahStok -= 0;
                    break;
                case 4 :
                    jumlahStok -= 5;
                    break;
                default:
                    break;
            }
            System.out.println(namaBunga + ": " + jumlahStok);
        }
    }

    private static String getNamaBunga (int index){
        switch (index) {
            case 1:
                return "Aglonema";
            case 2 :
                return "Keladi";
            case 3 :
                return "Alocasia";
            case 4 :
                return "Mawar";
            default:
              return "";
        }
    }

    public static void main(String[] args) {
        pendapatanSetiapCabang();
        stokBungaRoyalGarden();
    }
    
}
