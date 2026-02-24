package PraktikumAlgoritmaDanStrukturData.jobsheet2;

public class MataKuliahMain09 {
    public static void main(String[] args) {
        MataKuliah09 matkul1 = new MataKuliah09("01", "Pancasila", 4, 4);
        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(3);
        matkul1.tampilkanInformasi();
        matkul1.kurangiJam(3);
        matkul1.tampilkanInformasi();
        

        MataKuliah09 matkul2 = new MataKuliah09("02", "Dasar Pemrograman", 6, 6);
        matkul2.tampilkanInformasi();
        matkul2.ubahSKS(8);
        matkul2.tambahJam(2);
        matkul2.tampilkanInformasi();
        matkul2.kurangiJam(2);
        matkul1.tampilkanInformasi();
    }
}
