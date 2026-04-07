package CM1;
import java.util.Scanner;

public class PeminjamanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] listMahasiswa = DataPeminjaman.getMahasiswa();
        Buku[] listBuku = DataPeminjaman.getBuku();
        Peminjaman[] listPinjam = DataPeminjaman.getPeminjaman(listMahasiswa, listBuku);

        int pilih;
        do {
            tampilMenu();
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            switch(pilih) {
                case 1:
                    for (Mahasiswa m : listMahasiswa) {
                        m.tampilMahasiswa();
                    }
                    System.out.println("==============================");
                    break;
                case 2:
                    for (Buku b : listBuku) {
                        b.tampilBuku();
                    }
                    System.out.println("==============================");
                    break;
                case 3:
                    for (Peminjaman p : listPinjam) {
                        p.tampilPeminjaman();
                    }
                    System.out.println("==============================");
                    break;
                case 4:
                    DataPeminjaman.sortByDenda(listPinjam);
                    System.out.println("Setelah diurutkan (Denda terbesar)");
                        for (Peminjaman p : listPinjam) {
                            p.tampilPeminjaman();
                        }
                    System.out.println("==============================");
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.next();
                    DataPeminjaman.cariByNIM(listPinjam, nim);
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);
    }

    static void tampilMenu() {
        System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");
    }
}