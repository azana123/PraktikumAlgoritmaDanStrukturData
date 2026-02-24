package PraktikumAlgoritmaDanStrukturData.jobsheet3;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Mahasiswa09[] arrayOfMahasiwa = new Mahasiswa09[3];
        arrayOfMahasiwa[0] = new Mahasiswa09();
        arrayOfMahasiwa[0].nim = "244107060033";
        arrayOfMahasiwa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiwa[0].kelas = "SIB-1E";
        arrayOfMahasiwa[0].ipk = (float) 3.75;

        arrayOfMahasiwa[1] = new Mahasiswa09();
        arrayOfMahasiwa[1].nim = "2341720172";
        arrayOfMahasiwa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiwa[1].kelas = "TI-2A";
        arrayOfMahasiwa[1].ipk = (float) 3.36;

        arrayOfMahasiwa[2] = new Mahasiswa09();
        arrayOfMahasiwa[2].nim = "244107023006";
        arrayOfMahasiwa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiwa[2].kelas = "TI-2E";
        arrayOfMahasiwa[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayOfMahasiwa[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiwa[0].nama);
        System.out.println("Kelas     : " + arrayOfMahasiwa[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiwa[0].ipk);
        System.out.println("----------------------------------------");

        System.out.println("NIM     : " + arrayOfMahasiwa[1].nim);
        System.out.println("Nama    : " + arrayOfMahasiwa[1].nama);
        System.out.println("Kelas     : " + arrayOfMahasiwa[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiwa[1].ipk);
        System.out.println("----------------------------------------");

        System.out.println("NIM     : " + arrayOfMahasiwa[2].nim);
        System.out.println("Nama    : " + arrayOfMahasiwa[2].nama);
        System.out.println("Kelas     : " + arrayOfMahasiwa[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiwa[2].ipk);
        System.out.println("----------------------------------------");

    }
}
