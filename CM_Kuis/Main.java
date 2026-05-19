package CM_Kuis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManajemenAntrian sistem = new ManajemenAntrian();
        int pilih;

        do {
            System.out.println("\n==================================");
            System.out.println("   SISTEM ANTRIAN ROYAL DELISH    ");
            System.out.println("==================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Tambah Antrian Prioritas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    sistem.tambahAntrian(nama, hp);
                    break;

                case 2:
                    sistem.cetakAntrian();
                    break;

                case 3:
                    if (sistem.headAntrian == null) {
                        System.out.println("Antrian kosong!");
                    } else {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String menu = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        
                        sistem.prosesAntrian(kode, menu, harga);
                    }
                    break;

                case 4:
                    sistem.cetakLaporanPesanan();
                    break;

                case 5:
                    System.out.print("Nama Pembeli : ");
                    String namaPrioritas = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hpPrioritas = sc.nextLine();
                    sistem.tambahAntrianPrioritas(namaPrioritas, hpPrioritas);
                    break;
                case 0:
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilih != 0);

        sc.close();
    }
}