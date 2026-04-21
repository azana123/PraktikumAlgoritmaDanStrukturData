package jobsheet9.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat stack = new StackSurat(10);

        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();

                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);

                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();

                    Surat s = new Surat(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat:");
                        proses.tampilData();
                    }
                    break;

                case 3:
                    Surat lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        lihat.tampilData();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;

                case 0:
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}
