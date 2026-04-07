package CM1;

public class Buku {
    String kodeBuku, judul;
    int tahunTerbit;

    Buku(){}

    Buku(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    void tampilBuku() {
        System.out.println("==============================");
        System.out.println("Kode  : " + kodeBuku);
        System.out.println("Judul : " + judul);
        System.out.println("Tahun : " + tahunTerbit);
    }
}