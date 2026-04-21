package jobsheet5.Praktikum05;

public class Dosen {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen(){}
    Dosen(String kd, String name, boolean jk, int age){
        kode =kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("nama: " + nama);
        System.out.println("kode: " + kode);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("usia: " + usia);
    }
}

