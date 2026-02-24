package PraktikumAlgoritmaDanStrukturData.jobsheet3;
import java.util.Scanner;
public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Mahasiswa09[] arrayOfMahasiwa = new Mahasiswa09[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiwa[i] = new Mahasiswa09();
            System.out.println("Masukan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiwa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiwa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiwa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiwa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------------");
        }
        Mahasiswa09.cetakInfo(arrayOfMahasiwa);
        sc.close();
    }
}
