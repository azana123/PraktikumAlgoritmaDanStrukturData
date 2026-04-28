package jobsheet10.Latihan;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);

        int pilih;
        do {
            System.out.println("\n=== ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Mahasiswa Dalam Antrian");
            System.out.println("4. Tampilkan 2 Mahasiswa Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Dilayani");
            System.out.println("8. Sisa Belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    if (antrian.IsFull()) {
                        System.out.println("Antrian Penuh!");
                    } else {
                        System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(m);
                    }
                    break;
                case 2:
                    if (antrian.IsEmpty()) {
                        System.out.println("Antrian kosong!");
                    } else {
                        antrian.layani2Mahasiswa();
                    }
                    break;
                case 3:
                    antrian.tampilSemua();
                    break;
                case 4:
                    antrian.tampilDepan();
                    break;
                case 5:
                    antrian.tampilBelakang();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah dilayani: " + antrian.getJumlahDilayani());
                    break;
                case 8:
                    System.out.println("Sisa belum KRS: " + antrian.sisaBelumDilayani());
                    break;
            }
        } while (pilih != 0);
    }
}