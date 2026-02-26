package PraktikumAlgoritmaDanStrukturData.jobsheet2.Latihan;

public class DosenMain09 {
    public static void main(String[] args) {
        Dosen09 dosen1 = new Dosen09("D001", "Priyanto", false, 2009, "Keagamaan");
        dosen1.tampilInformasi();
        dosen1.hitungMasaKerja(2026);
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Kewarganegaraan");
        dosen1.tampilInformasi();
        dosen1.hitungMasaKerja(2027);


        Dosen09 dosen2 = new Dosen09("D002", "Rahmat", true, 2006, "Kimia Organik");
        dosen2.tampilInformasi();
        dosen2.hitungMasaKerja(2027);
        dosen2.setStatusAktif(false);
        dosen2.ubahKeahlian("Kimia Analitik");
        dosen2.tampilInformasi();
        dosen2.hitungMasaKerja(2028);
    }
}
