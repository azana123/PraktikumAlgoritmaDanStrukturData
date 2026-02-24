package PraktikumAlgoritmaDanStrukturData.jobsheet3;

import java.util.Scanner;
public class Matakuliah09 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah09(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public static void tambahData(Matakuliah09[] arrayOfMatakuliah) {
        String dummy;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Sks           : ");
            dummy = sc.nextLine();
            int sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = sc.nextLine();
            int jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah09(kode, nama, sks, jumlahJam);
        }
        sc.close();
    }
    static void cetakInfo(Matakuliah09[]arrayOfMatakuliah09) {
        for (int i = 0; i < arrayOfMatakuliah09.length; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i + 1));
            System.out.println("NIM     : " + arrayOfMatakuliah09[i].kode);
            System.out.println("Nama    : " + arrayOfMatakuliah09[i].nama);
            System.out.println("Kelas   : " + arrayOfMatakuliah09[i].sks);
            System.out.println("IPK     : " + arrayOfMatakuliah09[i].jumlahJam);
            System.out.println("----------------------------------------");
        }
    }
}
