import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static String jadwal[][];
    static String format = "===================================";
    public static void main(String[] args) {
        inputJadwal();
        tampilkanSeluruhJadwal();
        cariBerdasarkanHari();
        cariBerdasarkanNamaMatkul();
    }
    static void inputJadwal () {
        System.out.print("Masukan jumlah jadwal: ");
        n = sc.nextInt();
        sc.nextLine();
        jadwal = new String [n][4];
        for (int i = 0; i < n; i++) {
                System.out.print("Masukan mata kuliah ke-" + (i + 1) + ": ");
                jadwal[i][0] = sc.nextLine();
                
                System.out.print("Masukan ruangan: ");
                jadwal[i][1] = sc.nextLine();
                
                System.out.print("masukan hari: ");
                jadwal[i][2] = sc.nextLine();

                System.out.print("Masukan jam: ");
                jadwal[i][3] = sc.nextLine();
        }
    }
    static void tampilkanSeluruhJadwal() {
        System.out.println(format);
        System.out.println("Jadwal Kuliah");
        System.out.println(format);
        System.out.printf("| %-15s | %-15s | %-15s | %-15s |\n", "Nama matkul", "Ruangan", "Hari", "Jam");
        for (int i = 0; i < n; i++) {
                System.out.printf("| %-15s | %-15s | %-15s | %-15s |\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }
    static void cariBerdasarkanHari(){
        String indexHari;
        System.out.print("Cari berdasarkan hari: ");
        indexHari = sc.nextLine();        
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(indexHari)) {
                System.out.printf("| %-15s | %-15s | %-15s | %-15s |\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }
    static void cariBerdasarkanNamaMatkul() {
        String indexMatkul;
        System.out.print("Cari berdasarkan nama Mata Kuliah: ");
        indexMatkul = sc.nextLine();        
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(indexMatkul)) {
                System.out.printf("| %-15s | %-15s | %-15s | %-15s |\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                break;
            }
        }
    }
}