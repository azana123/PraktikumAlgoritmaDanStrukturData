import java.util.Scanner;
public class praktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program menghitung IP semester");
        System.out.println("==============================");

        System.out.print("Masukan Jumlah matkul: ");
        int jumlahMatkul = sc.nextInt();

        int jumlahSks = 0;
        int[] bobotSks = new int[jumlahMatkul];
        String[] namaMatkul = new String[jumlahMatkul];
        double[] nilaiAngka = new double[jumlahMatkul];
        double[] nilaiSetara = new double[jumlahMatkul];
        String[] nilaiHuruf = new String[jumlahMatkul];
        double IP, jumlahNilaiSetara = 0;
        sc.nextLine();

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("masukan nama matkul: ");
            namaMatkul[i] = sc.nextLine();

            System.out.print("masukan bobot sks: ");
            bobotSks[i] = sc.nextInt();

            System.out.print("masukan nilai angka: ");
            nilaiAngka[i] = sc.nextDouble();

            jumlahSks += bobotSks[i];
            sc.nextLine();
        }
        System.out.println("=========================");
        System.out.println("Hasil konversi nilai");
        System.out.println("=========================");
        System.out.printf("| %-30s | %-15s | %-15s | %-15s | %-15s |\n", "Mata Kuliah", "Nilai", "Bobot SKS",
                "Nilai huruf", "Bobot Nilai");
        for (int i = 0; i < jumlahMatkul; i++) {
            if (nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] <= 80 && nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] <= 73 &&  nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] <= 65 && nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] <= 60 && nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] <= 50 && nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
            jumlahNilaiSetara += nilaiSetara[i] * bobotSks[i];
        }
        IP = jumlahNilaiSetara / jumlahSks;
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("| %-30s | %-15s | %-15s | %-15s | %-15s |\n", namaMatkul[i], nilaiAngka[i], bobotSks[i],
                nilaiHuruf[i], nilaiSetara[i]);
        }
    }
}
