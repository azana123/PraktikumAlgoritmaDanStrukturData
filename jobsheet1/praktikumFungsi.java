public class praktikumFungsi {
    static String jenisBunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    static String cabangToko[] = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
    static int hasilPenjualan[][] = {{10, 5, 15, 7}, 
                                    {6, 11, 9, 12}, 
                                    {2, 10, 10, 5}, 
                                    {5, 7, 12, 9}};
    static int rincianHarga[] = {75000, 50000, 60000, 10000};
    static boolean baik[] = new boolean [4];
    public static void main(String[] args) {
        tampilkanPendapatanSetiapCabang();
    }

    static int hitungPendapatan (int x) {
        int pendapatanPerCabang = 0;
        for (int j = 0; j < jenisBunga.length; j++) {
            pendapatanPerCabang += hasilPenjualan[x][j] * rincianHarga[j];
            if (pendapatanPerCabang > 1500000) {
                baik[j] = true;
            } else {
                baik[j] = false;
            }
        }
        return pendapatanPerCabang;
    }
  

    static void tampilkanPendapatanSetiapCabang() {
        for (int i = 0; i < jenisBunga.length; i++) {
            System.out.print("pendapatan cabang " + cabangToko[i] + " adalah: " + hitungPendapatan(i));
            if (hitungPendapatan(i) > 1500000) {
                System.out.println(" Status = sangat baik");
            } else {
                System.out.println(" Status = perlu evaluasi");
            }
        }
    }
}
