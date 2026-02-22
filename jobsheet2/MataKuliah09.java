package PraktikumAlgoritmaDanStrukturData.jobsheet2;

public class MataKuliah09 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("MATA KULIAH " + kodeMK);
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam Per-Minggu: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("Jumlah SKS berhasil diganti");
        System.out.println("Jumlah SKS: " + sksBaru);
        System.out.println();
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam per-minggu berhasil ditambah");
        System.out.println();
    }

    void kurangiJam(int jam) {
        if (jumlahJam - jam != 0) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam per-Minggu berhasil dikurangi");
            System.out.println("Jumlah jam per-Minggu: " + jumlahJam);
            System.out.println();
        }else {
            System.out.println("Jumlah jam saat ini tidak mencukupi untuk dikurangi");
            System.out.println();
        }
    }

    public MataKuliah09() {
    }

    public MataKuliah09(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
