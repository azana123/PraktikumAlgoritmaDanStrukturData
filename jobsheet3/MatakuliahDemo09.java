package PraktikumAlgoritmaDanStrukturData.jobsheet3;
import java.util.Scanner;

public class MatakuliahDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah matakuliah: ");
        int jmlMatkul = sc.nextInt();
        Matakuliah09[] arrayOfMatakuliah = new Matakuliah09[jmlMatkul];

        Matakuliah09.tambahData(arrayOfMatakuliah);
        Matakuliah09.cetakInfo(arrayOfMatakuliah);
        System.out.println("----------------------------------------");
        sc.close();
    }
}
