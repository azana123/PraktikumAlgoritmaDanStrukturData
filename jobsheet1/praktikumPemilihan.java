import java.util.Scanner;
public class praktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiTugas, nilaiUts, nilaiKuis, nilaiUas, nilaiAkhir = 0;
        String nilaiHuruf, format = "==============================";
        boolean valid = false;
        String status;


        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println(format);


        System.out.print("Masukan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan Nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukan Nilai UAS: ");
        nilaiUas = sc.nextDouble();

        nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
        if (nilaiAkhir > 80) {
            status = "SELAMAT ANDA LULUS";
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            status = "SELAMAT ANDA LULUS";
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            status = "SELAMAT ANDA LULUS";
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            status = "SELAMAT ANDA LULUS";
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            status = "SELAMAT ANDA LULUS";
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            status = "ANDA TIDAK LULUS";
            nilaiHuruf = "D";
        } else {
            status = "ANDA TIDAK LULUS";
            nilaiHuruf = "E";
        }

        if (nilaiTugas >= 0 && nilaiTugas <= 100) {
            if (nilaiKuis >= 0 && nilaiKuis <= 100) {
                if (nilaiUts >= 0 && nilaiUts <= 100) {
                    if (nilaiUas >= 0 && nilaiUts <= 100) {
                        valid = true;
                    }
                }
            }
        }

        if (valid) {
            System.out.println(format);
            System.out.println(format);
            System.out.println("nilai akhir: " + nilaiAkhir);
            System.out.println("nilai huruf: " + nilaiHuruf);
            System.out.println(format);
            System.out.println(format);
            System.out.println(status);
        } else {
            System.out.println(format);
            System.out.println(format);
            System.out.println("nilai tidak valid");
            System.out.println(format);
            System.out.println(format);
        }
    }
}
