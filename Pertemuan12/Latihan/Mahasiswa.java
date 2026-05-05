package Pertemuan12.Latihan;

public class Mahasiswa {
    String nim, nama, keperluan;

    Mahasiswa() {}
    Mahasiswa(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    void tampilData() {
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Keperluan  : " + keperluan);
    }
}
