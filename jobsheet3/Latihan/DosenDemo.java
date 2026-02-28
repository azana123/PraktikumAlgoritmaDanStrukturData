package PraktikumAlgoritmaDanStrukturData.jobsheet3.Latihan;

import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        inputData();
    }

    static void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah dosen: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosen09[] daftar = new Dosen09[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Data dosen ke-" + (i + 1));

            System.out.print("Kode: ");
            String kode = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Jenis kelamin (Pria/Wanita): ");
            String jk = sc.nextLine();
            boolean gender = false;
            if (jk.equalsIgnoreCase("pria")) {
                gender = true;
            } else if (jk.equalsIgnoreCase("wanita")) {
                gender = false;
            } else {
                System.out.println("Jenis Kelamin Tidak Valid!");
                main(null);
            }

            System.out.print("Usia: ");
            int usia = sc.nextInt();
            sc.nextLine();

            daftar[i] = new Dosen09(kode, nama, gender, usia);
        }
        System.out.println("\n======== DATA DOSEN ========");
        for (Dosen09 dosen : daftar) {
            dosen.tampil();
        }
    }
}
