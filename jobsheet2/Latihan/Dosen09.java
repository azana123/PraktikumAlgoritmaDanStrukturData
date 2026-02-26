package PraktikumAlgoritmaDanStrukturData.jobsheet2.Latihan;

public class Dosen09 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    Dosen09() {
    }
    
    Dosen09(String idDosen, String nama, boolean status, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = status;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Nonaktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        System.out.println("Masa Kerja      : " + (thnSkrg - tahunBergabung) + " Tahun");
        System.out.println("------------------------------------------------------------");

        return (thnSkrg - tahunBergabung);    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
