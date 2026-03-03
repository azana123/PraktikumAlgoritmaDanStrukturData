package PraktikumAlgoritmaDanStrukturData.Kuis;

import java.util.Scanner;

public class cafeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah menu: ");
        int jumlah = sc.nextInt();

        cafe[] listCafe = new cafe[jumlah];

        for (int i = 0; i < jumlah; i++) {
            listCafe[i] = new cafe("", "", 0);
        }

        int counter = 1;
        for (int i = 0; i < listCafe.length; i++) {
            System.out.println("input data Harga ke-" + counter);
            cafe.inputData(listCafe, i);
            counter++;
            System.out.println();
        }

        cafe.tampil(listCafe);
        
        int index;
        System.out.print("ubah menu harga menu ke-");
        index = sc.nextInt();
        int hargaBaru;
        System.out.print("Masukan harga baru: ");
        hargaBaru = sc.nextInt();
        cafe.ubahHarga(listCafe, index, hargaBaru);

        cafe.tampil(listCafe);
    }
}
