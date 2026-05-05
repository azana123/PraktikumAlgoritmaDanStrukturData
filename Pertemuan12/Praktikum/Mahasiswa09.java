package Pertemuan12.Praktikum;

public class Mahasiswa09 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa09(){}
    Mahasiswa09(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.print(nama);
        System.out.print("\t" + nim);
        System.out.print("\t" + kelas);
        System.out.println("\t" + ipk);
    }
}
