package jobsheet12;
import java.util.Scanner;

public class DoubleLinkedListMain09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList09 list = new DoubleLinkedList09();
        int pilihan;
        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa09 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa09 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa09 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        } while (pilihan != 0);
        scan.close();
    }

    static Mahasiswa09 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();

        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa09(nim, nama, kelas, ipk);
    }
}
