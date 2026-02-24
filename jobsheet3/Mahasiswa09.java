package PraktikumAlgoritmaDanStrukturData.jobsheet3;

public class Mahasiswa09 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    static void cetakInfo(Mahasiswa09[]arrayOfMahasiwa) {
        for (int i = 0; i < arrayOfMahasiwa.length; i++) {
            System.out.println("Data Mahasiswa Ke-" + (i + 1));
            System.out.println("NIM     : " + arrayOfMahasiwa[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiwa[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiwa[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiwa[i].ipk);
            System.out.println("----------------------------------------");
        }
    }
}
