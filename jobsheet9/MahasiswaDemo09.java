package jobsheet9;
import java.util.Scanner;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        StackTugasMahasiswa09 stack = new StackTugasMahasiswa09(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Melihat Tugas Yang Sudah Dikumpulkan");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1 :
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa09 mhs = new Mahasiswa09(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2 :
                    Mahasiswa09 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3 :
                    Mahasiswa09 lihatTerakhir = stack.peek();
                    if (lihatTerakhir != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh: " + lihatTerakhir.nama);
                    }
                    break;
                case 4 :
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa09 lihatPertama = stack.peek();
                    if (lihatPertama != null) {
                        System.out.println("Tugas pertamakali dikumpulkan oleh: " + lihatPertama.nama);
                    }
                    break;
                case 6:
                    int lihatJmlPengumpul = stack.JumlahTugasTerkumpul();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan adalah: " + lihatJmlPengumpul);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
