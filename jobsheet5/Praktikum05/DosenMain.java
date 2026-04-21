package jobsheet5.Praktikum05;

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DataDosen list = new DataDosen();
        list.dataDosen = new Dosen[5];
        int menu;
        do {
            System.out.println("===Menu===");
            System.out.println("1. tambah data");
            System.out.println("2. tampil data");
            System.out.println("3. sorting asc");
            System.out.println("4. sorting dsc");
            System.out.print("masukan menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
            case 1:
                System.out.print("Kode   : ");
                String kode = sc.nextLine();

                System.out.print("Nama  : ");
                String nama = sc.nextLine();

                System.out.print("Jenis kelamin (T/F) : ");
                boolean jenisKelamin = sc.nextBoolean();

                System.out.print("Usia   : ");
                int usia = sc.nextInt();
                sc.nextLine();

                Dosen dsn = new Dosen(kode, nama, jenisKelamin, usia);
                list.tambah(dsn);
                break;
            case 2:
                list.tampil();
                break;
            case 3:
                list.SortingASC();
                list.tampil();
                break;
            case 4:
                list.SortingDSC();
                list.tampil();
                break;
            case 5:
                System.out.println("program selesai");
                break;
            default:
                System.out.println("Pilihan tidak valid");
            }
        } while (menu != 5);
        sc.close();
    }
}
