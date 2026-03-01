package PraktikumAlgoritmaDanStrukturData.jobsheet3.Latihan;
import java.util.Scanner;

public class Dosen09 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen09(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("=========================================");
    }

    void inputData(Scanner sc) {
        System.out.print("Kode dosen\t: ");
        kode = sc.nextLine();
        System.out.print("Nama dosen\t: ");
        nama = sc.nextLine();
        System.out.print("Jenis Kelamin (true = pria, false = wanita): ");
        jenisKelamin = sc.nextBoolean();
        System.out.print("Usia\t: ");
        usia = sc.nextInt();
        sc.nextLine();
    }
}
