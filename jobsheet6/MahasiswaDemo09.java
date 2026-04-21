package jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi09 list = new MahasiswaBerprestasi09();
        list.listMhs = new Mahasiswa09[jumMhs];

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("\nData mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa09 m = new Mahasiswa09(nim, nama, kelas, ipk);
            System.out.println("---------------------------------------");
            list.tambah(m);
        }
        list.tampil();
        //Melakukan pencarian data sequential
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("Masukan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("---------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("---------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0,jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        sc.close();
    }
}