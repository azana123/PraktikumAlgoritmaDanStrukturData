package PraktikumAlgoritmaDanStrukturData.Kuis;
import java.util.Scanner;
public class cafe {
    String menu;
    int harga;
    String kodeMenu;

    public cafe() {
    }
    
    public cafe(String menu, String kodeMenu, int harga) {
        this.menu = menu;
        this.harga = harga;
        this.kodeMenu = kodeMenu;
    }

    static void inputData(cafe[] arrayCafes, int z) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan menu: ");
            String menu = sc.nextLine();
            System.out.print("Masukan harga: ");
            int harga = sc.nextInt();
            System.out.print("Masukan kode menu: ");
            String kodeMenu = sc.nextLine();
            sc.nextLine();
            arrayCafes[z] = new cafe(menu, kodeMenu, harga);
    }

    static void tampil(cafe[] arrayCafes) {
        for (int i = 0; i < arrayCafes.length; i++) {
            System.out.println("Data menu ke-" + (i + 1));
            System.out.println(arrayCafes[i].menu + "\t" + arrayCafes[i].kodeMenu + "\t\t\t" + arrayCafes[i].harga);
        }
    }

    static int ubahHarga(cafe[] arrayCafes, int index, int hargaBaru) {
        System.out.print("Harga berhasil diubah, harga baru: " + hargaBaru);
        return arrayCafes[index - 1].harga = hargaBaru;
    }
}
